package com.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.common.common.Global;
import com.common.common.XYConfig;
import com.xingyun.login.model.entity.User;

/**
 * SP_LOGIN只保存登陆相关的东东
 * 其他的需要更换sp名字
 * Created by anzhuo on 2016/1/28.
 */
public class SpUtil {

    public static final String KEY_TOKEN = "key_token";
    public static final String KEY_NICKNAME = "key_nickname";

    //存放user的昵称和token
    public static void saveLogin(User entity){
        SharedPreferences sp = Global.mContext.getSharedPreferences(XYConfig.SP_LOGIN, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(KEY_TOKEN, entity.token);
        editor.putString(KEY_NICKNAME, entity.nickname);
    }
    //获取token
    public static String getToken(){
        SharedPreferences sp = Global.mContext.getSharedPreferences(XYConfig.SP_LOGIN, Context.MODE_PRIVATE);
        return sp.getString(KEY_TOKEN,"");
    }
    //获取user
    public static User getUser(){
        SharedPreferences sp = Global.mContext.getSharedPreferences(XYConfig.SP_LOGIN, Context.MODE_PRIVATE);
        User user = new User();
        user.token = sp.getString(KEY_TOKEN,"");
        user.nickname = sp.getString(KEY_NICKNAME,"");
        return user;

    }

    public static void clearLoginInfo() {
        SharedPreferences sp = Global.getContext().getSharedPreferences(XYConfig.SP_LOGIN, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
    }
}
