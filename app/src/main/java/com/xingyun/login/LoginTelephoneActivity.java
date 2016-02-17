package com.xingyun.login;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.common.base.activity.BaseActivity;
import com.common.common.Global;
import com.common.utils.ActivityUtil;
import com.common.utils.InputMethodUtil;
import com.common.utils.Logger;
import com.common.utils.ToastUtils;
import com.xingyun.login.controller.LoginController;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.main.MainActivity;
import com.xingyun.main.R;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by anzhuo on 2016/2/17.
 */
public class LoginTelephoneActivity extends BaseActivity implements View.OnClickListener {

    private EditText loginPhoneNum;
    private EditText loginPassword;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_telephone_login;
    }

    @Override
    protected void init() {
        loginPhoneNum = (EditText) findViewById(R.id.et_login_phonenum);

        loginPassword = (EditText) findViewById(R.id.et_login_password);
        findViewById(R.id.btn_telephone_login).setOnClickListener(this);
        findViewById(R.id.btn_regist).setOnClickListener(this);

        setActionBarTitle("手机登陆");
    }

    @Override
    protected void onResume() {
        super.onResume();
//        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        //显示软键盘
//        imm.showSoftInputFromInputMethod(loginPhoneNum.getWindowToken(), 0);
//        loginPhoneNum.requestFocus();
////        Global.postDelay(new Runnable() {
////            @Override
////            public void run() {
////                InputMethodUtil.showInputMehtod(LoginTelephoneActivity.this);
////            }
////        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_telephone_login:
                if (TextUtils.isEmpty(loginPassword.getText().toString()) || TextUtils.isEmpty(loginPhoneNum.getText().toString())){
                    ToastUtils.showShortToast(LoginTelephoneActivity.this,"账号或者密码不能为空");
                    return;
                }
                ReqLoginParam param = new ReqLoginParam();
                param.type = "mobile";
                param.userid = loginPhoneNum.getText().toString();
                param.token = loginPassword.getText().toString();
                param.expires = "";
                LoginDataCenterManager.getInstance().login(param, moblieCallBack);
                break;
            case R.id.btn_regist:
                ActivityUtil.toActivity(this, RegistActivity.class);
                break;
        }
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
                ActivityUtil.toActivity(LoginTelephoneActivity.this, MainActivity.class);
                Logger.d("LoginActivity", "moblieCallBack" + rsp.user.toString() + "==========手机登陆成功=========");
            }
        }

        @Override
        public void onFilled(int code, String msg) {
            LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_ERR_SENT_FAILED, null);
        }

    };
}
