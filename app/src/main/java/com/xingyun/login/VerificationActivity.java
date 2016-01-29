package com.xingyun.login;

import android.os.Bundle;
import android.view.View;

import com.common.base.activity.BaseActivity;
import com.common.utils.Logger;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.model.entity.User;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/28.
 */
public class VerificationActivity extends BaseActivity implements View.OnClickListener{

    public static final String TAG = VerificationActivity.class.getSimpleName();

    public String mobile;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_verification;
    }

    @Override
    protected void init() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mobile = bundle.getString("mobile");
        }
        findViewById(R.id.btn_commit).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_commit:
                LoginDataCenterManager.getInstance().registConfirm(mobile,"123456",registConfimNetworkCallback);
                break;
        }
    }

    private NetworkCallback<RspLogin> registConfimNetworkCallback = new NetworkCallback<RspLogin>() {
        @Override
        public void onSucessed(RspLogin rsp) {
            User user = rsp.user;
            Logger.d(TAG,"userid = "+user.userid + " -----------------" + "token = "+user.token);
        }

        @Override
        public void onFilled(int code, String msg) {

        }
    };
}
