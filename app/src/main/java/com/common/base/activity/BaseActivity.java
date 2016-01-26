package com.common.base.activity;

import android.app.Activity;
import android.os.Bundle;

import com.common.application.XYApplication;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        XYApplication.getInstance().addActivity(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        XYApplication.getInstance().removeActivity(this);
        super.onDestroy();
    }
}
