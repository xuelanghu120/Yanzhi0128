package com.xingyun.main;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.common.base.activity.BaseActivity;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.sina.weibo.sdk.exception.WeiboException;
import com.xingyun.login.Constants;
import com.xingyun.login.LoginActivity;
import com.xingyun.login.RegistActivity;
import com.xingyun.login.controller.LoginController;
import com.xingyun.login.listener.ILoginListener;
import com.xingyun.login.manager.LoginDataCenterManager;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.utils.WXUtils;
import com.xingyun.main_yanzhi.Main;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/**
 * Created by 黄笠 on 2016/1/28.
 */
public class TestActivity extends BaseActivity implements View.OnClickListener {

    public static final String TAG = TestActivity.class.getSimpleName();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void init() {
        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.btn_rejist).setOnClickListener(this);
        findViewById(R.id.btn_launch).setOnClickListener(this);
        findViewById(R.id.btn_main).setOnClickListener(this);
        DeviceInfo.Init(TestActivity.this, TestActivity.this);//和启动activity中一样，需要初始化设备信息
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                ActivityUtil.toActivity(this, LoginActivity.class);
                break;
            case R.id.btn_rejist:
                ActivityUtil.toActivity(this,RegistActivity.class);
                break;
            case R.id.btn_launch :
                ActivityUtil.toActivity(this,LaunchActivity.class);
                break;
            case R.id.btn_main :
                ActivityUtil.toActivity(this,Main.class);
                break;
        }
    }


}
