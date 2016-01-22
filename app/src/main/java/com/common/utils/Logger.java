package com.common.utils;

import android.util.Log;

import com.common.common.XYConfig;


/**
 * log工具类
 *
 */
public class Logger {

	/***
	 * 是否打开json调试
	 */
	public static final boolean isJsonDebug(){
		return XYConfig.IS_JSON_DEBUG;
	}
	
	/***
	 * 是否处于调试模式
	 * @return
	 */
	public static boolean isDebug(){
		return XYConfig.IS_DEBUG;
	}
	
	public static void d(String tag,String msg) {
		if (XYConfig.IS_DEBUG) {
			Log.d(tag, msg);
		}
	}
	
	public static void d(String tag,String msg,Throwable e) {
		if (XYConfig.IS_DEBUG) {
			Log.d(tag, msg,e);
		}
	}
	public static void i(String tag,String msg) {
		if (XYConfig.IS_DEBUG) {
			Log.i(tag, msg);
		}
	}
	public static void v(String tag,String msg) {
		if (XYConfig.IS_DEBUG) {
			Log.v(tag, msg);
		}
	}
	public static void e(String tag,String msg) {
		if (XYConfig.IS_DEBUG) {
			Log.e(tag, msg);
		}
	}
	public static void e(String tag,String msg,Throwable e) {
		if (XYConfig.IS_DEBUG) {
			Log.e(tag, msg,e);
		}
	}
	
	public static void e(String tag,Throwable e){
		if(XYConfig.IS_DEBUG){
			Log.e(tag,"",e);
		}
	}
	
	public static void w(String tag,String msg) {
		if (XYConfig.IS_DEBUG) {
			Log.w(tag, msg);
		}
	}
	public static void w(String tag,String msg,Throwable e) {
		if (XYConfig.IS_DEBUG) {
			Log.w(tag, msg,e);
		}
	}
	
}
