package com.xingyun.login;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.common.base.activity.BaseActivity;
import com.common.common.Global;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.sina.weibo.sdk.exception.WeiboException;
import com.xingyun.login.controller.LoginController;
import com.xingyun.login.listener.ILoginListener;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.utils.WXUtils;
import com.xingyun.main.R;
import com.xingyun.main.databinding.ActivityLoginBinding;

import main.mmwork.com.mmworklib.http.HttpWork;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected int getLayoutId() {
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
//        binding.setUser(LoginController.getInstance().getUser());
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        LoginController.getInstance().registListener(mListener);
        findViewById(R.id.btn_weixin_login).setOnClickListener(this);
        findViewById(R.id.btn_weibo_login).setOnClickListener(this);
        findViewById(R.id.btn_default_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            //手机登陆
//            case R.id.btn_telephone_login:
//                ReqLoginParam param = new ReqLoginParam();
//                param.type = "mobile";
//                param.userid = "15075257640";
//                param.token = "123456";
//                param.expires = "";
//                DeviceInfo.Init(LoginActivity.this,LoginActivity.this);
//                LoginDataCenterManager.getInstance().login(param, moblieCallBack);
//                break;
//            //注册
//            case R.id.btn_regist:
//                ActivityUtil.toActivity(this, RegistActivity.class);
//                break;
            //微信登陆
            case R.id.btn_weixin_login :
                LoginController.getInstance().onWeChatLogin(LoginActivity.this);
                break;
            //微博登陆
            case R.id.btn_weibo_login:
                onWeiBoLogin();
                break;
            //跳转到正常的登陆页面
            case R.id.btn_default_login:

                break;
        }
    }

    @Override
    protected void onDestroy() {
        LoginController.getInstance().unRegistListener(mListener);
        HttpWork.getInstace(Global.getContext()).cancel(this);//this为callback
        super.onDestroy();
    }

    /**
     * 手机登陆结果
     * @param rsp
     */
    private NetworkCallback<RspLogin> moblieCallBack = new NetworkCallback<RspLogin>() {
        @Override
        public void onSucessed(RspLogin rsp) {
            User user = rsp.user;
            if (null==user){
                LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_PARSE_ERROR, null);
            }else {
                LoginController.getInstance().onLoginResult(true, 0, rsp);
                Logger.d("LoginActivity", "moblieCallBack" + rsp.user.toString() + "==========手机登陆成功=========");
            }
            Logger.d("LoginActivity","moblieCallBack"+rsp.user.toString()+"===================");
        }

        @Override
        public void onFilled(int code, String msg) {
            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_ERR_SENT_FAILED, null);
        }

    };
    /**
     * 手机登陆在onSucessed做操作
     * 其他登陆成功是监听通知，在mListener操作
     * 微信登陆结果通知过来
     */
    private ILoginListener mListener = new ILoginListener() {
        @Override
        public void onLoginSucc(RspLogin rsp) {
            //微信登陆成功的回调
        }

        @Override
        public void onLoginOut() {

        }

        @Override
        public void onLoginError(int errorCode) {
            String str = WXUtils.getErroStr(LoginActivity.this, errorCode);
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(LoginActivity.this,str,Toast.LENGTH_SHORT).show();
            }
        }
    };

    private SsoHandler mSsoHandler;
    public void onWeiBoLogin(){
        AuthInfo mAuthInfo = new AuthInfo(this, Constants.APP_KEY, Constants.REDIRECT_URL, Constants.SCOPE);
        mSsoHandler = new SsoHandler(this, mAuthInfo);
        mSsoHandler.authorize(new AuthListener());
    }
    /**
     * 微博认证授权回调类。 1. SSO 授权时，需要在 {@link #onActivityResult} 中调用
     * {@link SsoHandler#authorizeCallBack} 后， 该回调才会被执行。 2. 非 SSO
     * 授权时，当授权结束后，该回调就会被执行。 当授权成功后，请保存该 access_token、expires_in、uid 等信息到
     * SharedPreferences 中。
     */
    class AuthListener  implements WeiboAuthListener {
        @Override
        public void onComplete(Bundle values) {
            Logger.d(TAG, "AuthListener onWeiboException");
            Toast.makeText(LoginActivity.this, "成功",Toast.LENGTH_SHORT).show();
            // 从 Bundle 中解析 Token
            Oauth2AccessToken  mAccessToken = Oauth2AccessToken.parseAccessToken(values);
            if (mAccessToken.isSessionValid()) {
                ReqLoginParam param = new ReqLoginParam();
                param.type = "sina";
                param.userid = mAccessToken.getUid();
                param.token = mAccessToken.getToken();
                param.refreshToken = mAccessToken.getRefreshToken();
                param.expires = mAccessToken.getExpiresTime()/1000+"";
                LoginDataCenterManager.getInstance().login(param, moblieCallBack);
            } else {
                // 以下几种情况，您会收到 Code：
                // 1. 当您未在平台上注册的应用程序的包名与签名时；
                // 2. 当您注册的应用程序包名与签名不正确时；
                // 3. 当您在平台上注册的包名和签名与您当前测试的应用的包名和签名不匹配时。
                String code = values.getString("code");
                String message = getString(R.string.weibosdk_demo_toast_auth_success);
                if (!TextUtils.isEmpty(code)) {
                    message = message + "\nObtained the code: " + code;
                }
                Toast.makeText(LoginActivity.this, "",Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onCancel() {
            Logger.d(TAG, "AuthListener onWeiboException");
            Toast.makeText(LoginActivity.this, "取消",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onWeiboException(WeiboException e) {
            Logger.d(TAG, "AuthListener onWeiboException");
            Toast.makeText(LoginActivity.this, "Auth exception : " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (mSsoHandler != null){
            mSsoHandler.authorizeCallBack(requestCode, resultCode, data);
        }
    }
}
