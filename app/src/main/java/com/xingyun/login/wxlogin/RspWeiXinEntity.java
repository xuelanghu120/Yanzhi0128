package com.xingyun.login.wxlogin;

import com.alibaba.fastjson.JSON;
import com.xingyun.login.wxlogin.entity.PWeChatEntity;

import main.mmwork.com.mmworklib.http.responser.AbstractResponser;

/**
 * Created by anzhuo on 2016/1/27.
 */

public class RspWeiXinEntity extends AbstractResponser {
    public PWeChatEntity entity;
    @Override
    public void parserBody(String result) {
        entity = JSON.parseObject(result,PWeChatEntity.class);
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return null;
    }
}
