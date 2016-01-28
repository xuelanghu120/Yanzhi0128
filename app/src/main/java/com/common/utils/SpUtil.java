package com.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.common.common.Global;
import com.common.common.XYConfig;
import com.xingyun.login.model.entity.User;

/**
 * Created by anzhuo on 2016/1/28.
 */
public class SpUtil {

    public static final String KEY_TOKEN = "key_token";
    public static final String KEY_NICKNAME = "key_nickname";


    public static void saveLogin(User entity){
        SharedPreferences sp = Global.mContext.getSharedPreferences(XYConfig.PREFERENCES_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(KEY_TOKEN, entity.token);
        editor.putString(KEY_NICKNAME, entity.nickname);
    }
    public static void clearLoginInfo() {
        SharedPreferences sp = Global.getContext().getSharedPreferences(XYConfig.PREFERENCES_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
    }
}
