package com.common.common;

/**
 * API定义类
 *
 * 全部post方式请求
 *
 * Created by 黄笠 on 2016/1/23.
 */
public class ApiDefinition {
    /** 登陆 **/
    public static final String URL_LOGIN = "/login.api";
    /** 启动数据 **/
    public static final String URL_WELCOME = "/v2/public/welcome.api";
    /** 手机号注册 **/
    // 确认验证码手机号
    public static final String URL_REGIST_CONFIRM = "/registerConfirm.api";
    // 手机号是否存在
    public static final String URL_REGIST_MOBILE_EXIST = "/mobileExist.api";
    // 发送验证码
    public static final String URL_REGIST_VERIFICATION = "/register.api";
}
