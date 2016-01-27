package com.xingyun.main;

import android.os.CountDownTimer;
import android.os.Environment;
import android.view.Window;

import com.common.base.activity.BaseActivity;
import com.common.common.Global;
import com.common.utils.ActivityUtil;
import com.common.utils.DeviceInfo;
import com.common.utils.Logger;

/**
 * Created by 黄笠 on 2016/1/27.
 */
public class LaunchActivity extends BaseActivity {

    public static final String TAG = LaunchActivity.class.getSimpleName();

    @Override
    protected int getLayoutId() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        return R.layout.activity_launcher;
    }

    @Override
    protected void init() {
        Global.postDelay(startMainRunnable);
    }

    private Runnable startMainRunnable = new Runnable() {

        private MyCountDown myCountDown;

        @Override
        public void run() {
            myCountDown = new MyCountDown(2000, 1000);
            myCountDown.start();
            try {
                DeviceInfo.Init(LaunchActivity.this, LaunchActivity.this);
                initDirs();
            } catch (Exception e) {
                Logger.e(TAG, "init", e);
            }
        }
    };

    private class MyCountDown extends CountDownTimer {

        public MyCountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            Logger.d(TAG, "进入主界面");
            ActivityUtil.toActivity(context, MainActivity.class);
            finish();
        }

    }

    private void initDirs() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {

        }
    }
}
