package com.common.http;

import android.text.TextUtils;

import com.common.common.XYConfig;
import com.common.http.base.AppClient;
import com.common.utils.DeviceInfo;
import com.common.utils.MD5Util;
import com.common.utils.SpUtil;
import com.xingyun.login.wxlogin.cache.UserCache;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import main.mmwork.com.mmworklib.http.builder.ParamEntity;
import main.mmwork.com.mmworklib.http.builder.URLBuilder;

/**
 * 请求参数的通用参数
 * Created by anzhuo on 2016/1/23.
 */
public class YanZhiUrlBuilder implements URLBuilder {
    private String url;
    private Map<String, Object> paramsMap;
    private Map<String,String> clietMap;
    private Map<String,String> entityMap;

    //    DefaultURLBuilder
    private String getToken() {
        String token =null;
        token = UserCache.user==null? SpUtil.getToken():null;
        return token;
    }

    @Override
    public boolean getisJson() {
        return true;
    }

    @Override
    public void parse(Path path, Map<String, Field> fields, ParamEntity entity) throws IllegalAccessException {
        url = path.host() + path.url();
        paramsMap = new HashMap<String, Object>();
        clietMap = new HashMap<>();
        //增加通用参数
        addCommonParams(paramsMap);
        if (fields != null) {
            entityMap = new HashMap<>();
            for (Map.Entry<String, Field> entry : fields.entrySet()) {
                Object value = entry.getValue().get(entity);
                if (value != null) {
                    entityMap.put(entry.getKey(), String.valueOf(value));
                }
            }
            paramsMap.put("req",entityMap);
        }
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Map<String, Object> getParams() {
        return paramsMap;
    }

    //基础参数加
    public void addCommonParams(Map<String, Object> tempParams) {
        AppClient client = new AppClient();
        client.model = DeviceInfo.GetModelAndFactor();
        clietMap.put("model",client.model);
        client.os = DeviceInfo.GetOsVersion();
        clietMap.put("os",client.os);
        client.uniqid = DeviceInfo.getUuid();
        clietMap.put("uniqid",client.uniqid);
        client.screen = DeviceInfo.RESOLUTION;
        clietMap.put("screen",client.screen);
        client.mac = DeviceInfo.MACADDRESS;
        clietMap.put("mac",client.mac);
        paramsMap.put("client", clietMap);

        String appSystem=XYConfig.PLATFORM;
        paramsMap.put("appSystem", appSystem);
        String appVersion=XYConfig.VERSION;
        paramsMap.put("appVersion", appVersion);
        String format= XYConfig.REQUESTFORMAT;
        paramsMap.put("format", format);


        String token = getToken();
        if (!TextUtils.isEmpty(token)) {
            paramsMap.put("token", token);
            String callid = String.valueOf(System.currentTimeMillis());
            paramsMap.put("callid", callid);
            String v = MD5Util.md5(callid + token + XYConfig.API_SECRET);
            paramsMap.put("v", v);
        }
//一下参数暂时不用
//        String plus =XYConfig.XINGYUN_PLUS;
//        paramsMap.put("plus", plus);
//        String ent = XYConfig.XINGYUN_PLUS;
//        paramsMap.put("ent", ent);
//        String channel= ChannelUtil.getChannelCode(Global.mContext);
//        paramsMap.put("channel", channel);

    }
}

