package com.xingyun.login.reqparam;


import com.common.common.XYConstant;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;

/**
 * Created by anzhuo on 2016/1/27.
 */
//"https://api.weixin.qq.com/sns/oauth2/access_token?appid="
//        + XYConstant.WX_APP_ID + "&secret="+XYConstant.WX_APP_SECRET+"&code=" + code + "&grant_type=authorization_code";
@URLBuilder.Path(host = "https://api.weixin.qq.com/sns/oauth2/access_token",url = "")
public  class ReqWeiXinParam implements ParamEntity {
    public String appid = XYConstant.WX_APP_ID;
    public String secret = XYConstant.WX_APP_SECRET;
    public String code ;
    public String grant_type = "authorization_code";
}
