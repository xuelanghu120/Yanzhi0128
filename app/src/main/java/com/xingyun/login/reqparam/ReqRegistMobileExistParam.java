package com.xingyun.login.reqparam;

import com.common.common.ApiDefinition;
import com.common.common.XYConfig;
import com.common.http.YanZhiUrlBuilder;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;

/**
 * Created by 黄笠 on 2016/1/27.
 */
@URLBuilder.Path(host = XYConfig.API_HOST, url = ApiDefinition.URL_REGIST_MOBILE_EXIST, builder = YanZhiUrlBuilder.class)
public class ReqRegistMobileExistParam implements ParamEntity {
    /**
     * 手机号
     */
    public String mobile;
}
