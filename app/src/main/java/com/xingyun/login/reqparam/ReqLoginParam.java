package com.xingyun.login.reqparam;

import com.common.common.XYConfig;
import com.common.http.YanZhiUrlBuilder;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;

/**
 * Created by anzhuo on 2016/1/25.
 */
@URLBuilder.Path(host = XYConfig.API_HOST, url = "/login.api", builder = YanZhiUrlBuilder.class)
public class ReqLoginParam implements ParamEntity {
   public String type;
    /**
     * 微博ID,必填
     */
    public String userid;
    /**
     * 用户名,必填
     */
    public String token;
    /**
     * 过期时间戳
     */
    public String expires;
    /**
     * RefreshToken
     */
   public String refreshToken;
    /**
     * unionid
     */
    public String unionid;

}
