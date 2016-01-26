package com.common.application;

import android.app.Activity;
import android.support.multidex.MultiDexApplication;

import com.common.common.Global;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class XYApplication extends MultiDexApplication {

    public static final String TAG = XYApplication.class.getSimpleName();

    private static XYApplication mApplication;
    //activity的管理类
    private List<Activity> mActivities = new ArrayList<Activity>();

    public static XYApplication getInstance() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        Global.mContext =this.getApplicationContext();
        Global.init();
        startServices();
    }

    /**
     * 开启服务
     */
    private void startServices() {
        //子线程或者使用rxjava执行
    }

    public void addActivity(Activity activity){
        mActivities.add(activity);
    }

    public void removeActivity(Activity activity){
        mActivities.remove(activity);
    }

    //app安全退出时使用
    public void clearActivities(){
        mActivities.clear();
    }
}
