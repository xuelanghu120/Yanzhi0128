package com.xingyun.login.reqparam;

import com.common.common.ApiDefinition;
import com.common.common.XYConfig;
import com.common.http.YanZhiUrlBuilder;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;

/**
 * Created by 黄笠 on 2016/1/28.
 */
@URLBuilder.Path(host = XYConfig.API_HOST, url = ApiDefinition.URL_REGIST_CONFIRM, builder = YanZhiUrlBuilder.class)
public class ReqRegistConfirmParam implements ParamEntity{
    /**
     * 手机号
     */
    public String mobile;
    /**
     * 验证码
     */
    public String code;
}
