package com.xingyun.login;

import android.view.View;
import android.widget.TextView;

import com.common.base.activity.BaseActivity;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener,NetworkCallback<RspLogin> {

    private TextView textViewTelephone;
    private TextView textViewPwd;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        findViewById(R.id.btn_telephone_login).setOnClickListener(this);
        textViewTelephone = (TextView) findViewById(R.id.text_telephone);
        textViewPwd = (TextView) findViewById(R.id.text_pwd);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_telephone_login:
                ReqLoginParam param = new ReqLoginParam();
                param.type = "mobile";
//                param.userid = textViewPwd.getText().toString();
                param.userid = "15075257640";
//                param.userid = textViewTelephone.getText().toString();
                param.token = "123456";
                param.expires = "";
                DeviceInfo.Init(LoginActivity.this, LoginActivity.this);
                LoginDataCenterManager.getInstance().login(param, LoginActivity.this);
                break;
        }
    }

    @Override
    public void onSucessed(RspLogin rsp) {
        User user = rsp.user;
        Logger.d("LoginActivity",rsp.user.toString()+"===================");
    }

    @Override
    public void onFilled(int code, String msg) {

    }
}
