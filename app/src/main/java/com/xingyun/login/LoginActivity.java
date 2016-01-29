package com.xingyun.login;


import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.common.base.activity.BaseActivity;
import com.common.common.Global;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;
import com.xingyun.login.controller.LoginController;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.listener.ILoginListener;
import com.xingyun.login.utils.WXUtils;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.HttpWork;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener,NetworkCallback<RspLogin> {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        LoginController.getInstance().registListener(mListener);
        findViewById(R.id.btn_telephone_login).setOnClickListener(this);
        findViewById(R.id.btn_weixin_login).setOnClickListener(this);
        findViewById(R.id.btn_regist).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_telephone_login:
                ReqLoginParam param = new ReqLoginParam();
                param.type = "mobile";
                param.userid = "15075257640";
                param.token = "123456";
                param.expires = "";
                DeviceInfo.Init(LoginActivity.this,LoginActivity.this);
                LoginDataCenterManager.getInstance().login(param, LoginActivity.this);
                break;
            case R.id.btn_regist:
                ActivityUtil.toActivity(this, RegistActivity.class);
                break;
            case R.id.btn_weixin_login :
                LoginController.getInstance().onWeChatLogin(LoginActivity.this);
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
    @Override
    public void onSucessed(RspLogin rsp) {
        User user = rsp.user;
        if (null==user){
            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_PARSE_ERROR, null);
        }else {
            LoginController.getInstance().onLoginResult(true, 0, rsp);
        }
        Logger.d("LoginActivity",rsp.user.toString()+"===================");
    }

    @Override
    public void onFilled(int code, String msg) {
        LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_ERR_SENT_FAILED, null);
    }

    /**
     * 手机登陆在onSucessed做操作
     * 其他登陆成功是监听通知，在mListener操作
     * 微信登陆结果通知过来
     */
    private ILoginListener mListener = new ILoginListener() {
        @Override
        public void onLoginSucc(RspLogin rsp) {

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

}
