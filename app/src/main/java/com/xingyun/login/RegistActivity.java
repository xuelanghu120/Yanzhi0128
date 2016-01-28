package com.xingyun.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.common.base.activity.BaseActivity;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.reqparam.ReqRegistMobileExistParam;
import com.xingyun.login.reqparam.ReqRegistVerification;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import main.mmwork.com.mmworklib.http.responser.AbstractResponser;

/**
 * Created by 黄笠 on 2016/1/26.
 */
public class RegistActivity extends BaseActivity implements View.OnClickListener,NetworkCallback{

    public static final String TAG = RegistActivity.class.getSimpleName();

    private EditText mRegisterMobile;
    private EditText mRegisterPassword;
    private Button mBtnRegister;
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
                ReqRegistVerification param = new ReqRegistVerification();
                param.mobile = mobile;
                param.password = password;
                DeviceInfo.Init(RegistActivity.this, RegistActivity.this);
                LoginDataCenterManager.getInstance().registVerication(param,this);
                break;
        }
    }

    @Override
    public void onSucessed(AbstractResponser rsp) {
        Bundle bundle = new Bundle();
        bundle.putString("mobile",mobile);
        ActivityUtil.toActivity(this,VerificationActivity.class,bundle);
    }

    @Override
    public void onFilled(int code, String msg) {

    }
}
