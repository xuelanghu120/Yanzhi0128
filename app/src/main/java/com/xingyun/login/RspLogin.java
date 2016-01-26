package com.xingyun.login;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.common.utils.Logger;
//import com.xingyun.login.Entity.model.entity.User;

import main.mmwork.com.mmworklib.http.responser.AbstractResponser;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class RspLogin extends AbstractResponser {
//    public User user;
    public String user;

    @Override
    public void parserBody(String result) {
        if (isSuccess && TextUtils.isEmpty(result)){
            user = JSON.parseObject(result, String.class);
            Logger.d("user",user.toString());
        }
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return null;
    }
}
