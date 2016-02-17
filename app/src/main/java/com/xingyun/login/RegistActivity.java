package com.xingyun.login;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.common.base.activity.BaseActivity;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.rsp.RspRegistMobileExist;
import com.xingyun.login.rsp.RspRegistVerification;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/26.
 */
public class RegistActivity extends BaseActivity implements View.OnClickListener{

    public static final String TAG = RegistActivity.class.getSimpleName();

    private EditText mRegisterMobile;
    private EditText mRegisterPassword;
    private String mobile,password;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_regist;
    }

    @Override
    protected void init() {
        mRegisterMobile = (EditText) findViewById(R.id.edt_mobile);
        mRegisterPassword = (EditText) findViewById(R.id.edt_password);
        findViewById(R.id.btn_regist).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_regist:
                mobile = mRegisterMobile.getText().toString().trim();
                password = mRegisterPassword.getText().toString().trim();
                DeviceInfo.Init(RegistActivity.this, RegistActivity.this);
                LoginDataCenterManager.getInstance().registMobileExist(mobile,mobileExistNetworkCallback);
                break;
        }
    }

    private NetworkCallback<RspRegistMobileExist> mobileExistNetworkCallback = new NetworkCallback<RspRegistMobileExist>() {
        @Override
        public void onSucessed(RspRegistMobileExist rsp) {
            if(rsp.result.result == 0){
                LoginDataCenterManager.getInstance().registVerication(mobile,password,verificationNetworkCallback);
            }else{
                Toast.makeText(RegistActivity.this,"手机号已存在",Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFilled(int code, String msg) {
            Logger.d(TAG,code + msg);
        }
    };

    private NetworkCallback<RspRegistVerification> verificationNetworkCallback = new NetworkCallback<RspRegistVerification>() {
        @Override
        public void onSucessed(RspRegistVerification rsp) {
            Bundle bundle = new Bundle();
            bundle.putString("mobile",mobile);
            ActivityUtil.toActivity(RegistActivity.this,VerificationActivity.class,bundle);
        }

        @Override
        public void onFilled(int code, String msg) {

        }
    };



}
