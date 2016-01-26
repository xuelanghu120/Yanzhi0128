package com.xingyun.commentlist;

import com.common.common.URL;
import com.common.http.YanZhiUrlBuilder;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;




/**
 * host 主url
 * 请求数据参数对象
 * Created by anzhuo on 2016/1/23.
 */
@URLBuilder.Path(host = "", url = URL.LOGIN,builder = YanZhiUrlBuilder.class)
public class ReqCommentListparam implements ParamEntity{
    public String id;
    public String size;
}
