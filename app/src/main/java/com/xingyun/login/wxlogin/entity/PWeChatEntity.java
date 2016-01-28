package com.xingyun.login.wxlogin.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;

/**
 * 微信授权返回对象
 * Created by anzhuo on 2016/1/22.
 */

public class PWeChatEntity extends BaseObservable implements Serializable {
    public String openid;
    public long expires_in;
    public String scope;
    public String refresh_token;
    public String access_token;
    public String unionid;



//    ErrCode	ERR_OK = 0(用户同意)
//    ERR_AUTH_DENIED = -4（用户拒绝授权）
//    ERR_USER_CANCEL = -2（用户取消）
//    code	用户换取access_token的code，仅在ErrCode为0时有效
//    state	第三方程序发送时用来标识其请求的唯一性的标志，由第三方程序调用sendReq时传入，由微信终端回传，state字符串长度不能超过1K
//    lang	微信客户端当前语言
//    country	微信用户当前国家信息



//            "access_token":"ACCESS_TOKEN",
//            "expires_in":7200,
//            "refresh_token":"REFRESH_TOKEN",
//            "openid":"OPENID",
//            "scope":"SCOPE",
//
//            "unionid":"o6_bmasdasdsad6_2sgVt7hMZOPfL"
}
