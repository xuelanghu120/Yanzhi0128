package com.xingyun.main.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.common.common.XYConstant;
import com.common.utils.Logger;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.controller.LoginController;
import com.xingyun.login.model.PWeChatEntity;
import com.xingyun.login.utils.WXUtils;
import com.xingyun.main.R;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler, NetworkCallback<RspLogin> {
    private final String TAG = "WXEntryActivity";

    private IWXAPI api;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //注册应用
        api = WXAPIFactory.createWXAPI(WXEntryActivity.this, XYConstant.WX_APP_ID);
        if (null != api) {
            try {
                api.handleIntent(getIntent(), this);
            } catch (Exception e) {
//                finish();
            }
            api.registerApp(XYConstant.WX_APP_ID);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (null != api) {
            api.handleIntent(intent, this);
        }
    }

    @Override
    public void onReq(BaseReq req) {

    }

    @Override
    public void onResp(BaseResp resp) {
        if (null != resp) {
            //授权登陆不为空的情况下
            if (!LoginController.getInstance().isMyReqEmpty()) {
                if (resp instanceof Resp) {
                    final Resp authResp = (Resp) resp;
                    String str = "";
                    switch (authResp.errCode) {
                        case BaseResp.ErrCode.ERR_OK:
                            str = this.getResources().getString(R.string.auth_success);
                            Toast.makeText(WXEntryActivity.this, str, Toast.LENGTH_SHORT).show();
                            break;
                        case BaseResp.ErrCode.ERR_AUTH_DENIED:
                            str = this.getResources().getString(R.string.auth_denied);
                            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_AUTH_DENIED, null);
                            break;
                        case BaseResp.ErrCode.ERR_COMM:
                        case BaseResp.ErrCode.ERR_SENT_FAILED:
                            str = this.getResources().getString(R.string.auth_send_failure);
                            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_ERR_SENT_FAILED, null);
                            break;
                        case BaseResp.ErrCode.ERR_UNSUPPORT:
                            str = this.getResources().getString(R.string.auth_not_support);
                            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_ERR_UNSUPPORT, null);
                            break;
                        case BaseResp.ErrCode.ERR_USER_CANCEL:
                            str = this.getResources().getString(R.string.auth_cancle);
                            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_USER_CANCLE, null);
                            break;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Logger.d(TAG, "[onResp]" + str);
                    }
                    if (authResp.errCode == BaseResp.ErrCode.ERR_OK) {

                        Observable<String> observable = (Observable<String>) Observable.create(new Observable.OnSubscribe<String>() {
                            @Override
                            public void call(Subscriber<? super String> subscriber) {
                                subscriber.onNext(WXUtils.getResponse(authResp));
                            }
                        })
                                .subscribeOn(Schedulers.io())
                                .subscribeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Action1<String>() {
                                    @Override
                                    public void call(String s) {
                                        PWeChatEntity entity = JSON.parseObject(s, PWeChatEntity.class);
                                        Logger.d(TAG, s + "--------url-------");
                                        if (entity != null) {
                                            //得到token自己的后台进行登陆
                                            LoginController.getInstance().onLogin(entity);
                                        } else {
                                            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_PARSE_ERROR, null);
                                        }
                                        finish();
                                    }
                                });

                    }
                }
                LoginController.getInstance().clearMyReq();
            }
        }
    }

    @Override
    public void onSucessed(RspLogin rsp) {
        if (rsp == null) {
            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_NULL, null);
        } else {
            LoginController.getInstance().onLoginResult(true, 0, rsp);
        }
    }

    @Override
    public void onFilled(int code, String msg) {
        LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_NULL, null);
    }
}
