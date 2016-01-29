package com.common.common;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class Global {

    private static final String TAG = "Global";

    private static Looper mLooper;
    private static Handler mHandler;
    private static Handler uiHandler;
    //application上下文
    public static Context mContext;
    public static boolean isPageFont = false;

    static{
        HandlerThread mThread = new HandlerThread("Global");
        mThread.start();
        mLooper = mThread.getLooper();
        mHandler = new Handler(mLooper);
        //init uiHandler
        uiHandler = new Handler(Looper.getMainLooper());
    }

    /**
     * 全局的一些变量的初始化
     */
    public static void  init(){

    }

    /***
     * 获取全局变量
     * @return
     */
    public static Context getContext(){
        return mContext;
    }

    /***
     * 非UI线程调用耗时操作
     * @param r
     */
    public static final void postDelay(Runnable r){
        mHandler.post(r);
    }

    /***
     * Runnable post到主线程
     * @param r
     */
    public static final void postRunnable2UI(Runnable r){
        uiHandler.post(r);
    }

    public static final void postRunnable2UIAttime(Runnable r,long time){
        uiHandler.postDelayed(r,time);
    }

    public void removeRunnale(Runnable r){
        uiHandler.removeCallbacks(r);
        mHandler.removeCallbacks(r);
    }

}
