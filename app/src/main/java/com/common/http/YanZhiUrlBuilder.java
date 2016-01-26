package com.common.http;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.common.common.XYConfig;
import com.common.http.base.ApiRequest;
import com.common.http.base.AppClient;
import com.common.utils.DeviceInfo;
import com.common.utils.MD5Util;

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
    private ApiRequest<ParamEntity> apiReq;
    private Map<String,String> clietMap;
    private Map<String,String> entityMap;

    //    DefaultURLBuilder
    private String getToken() {
        //// TODO: 2016/1/25
        return null;
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
        apiReq = new ApiRequest<ParamEntity>();

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
        apiReq.setClient(client);
        paramsMap.put("client", clietMap);

        String appSystem=XYConfig.PLATFORM;
        apiReq.setAppSystem(appSystem);
        paramsMap.put("appSystem", appSystem);
        String appVersion=XYConfig.VERSION;
        apiReq.setAppVersion(appVersion);
        paramsMap.put("appVersion", appVersion);
        String format= XYConfig.REQUESTFORMAT;
        apiReq.setFormat(format);
        paramsMap.put("format", format);


        String token = getToken();
        if (!TextUtils.isEmpty(token)) {
            apiReq.setToken(token);
            paramsMap.put("token", token);
            String callid = String.valueOf(System.currentTimeMillis());
            apiReq.setCallid(callid);
            paramsMap.put("callid", callid);
            String v = MD5Util.md5(callid + token + XYConfig.API_SECRET);
            apiReq.setV(v);
            paramsMap.put("v", v);
        }

//        String plus =XYConfig.XINGYUN_PLUS;
//        apiReq.setPlus(plus);
//        paramsMap.put("plus", plus);
//        String ent = XYConfig.XINGYUN_PLUS;
//        apiReq.setEnt(ent);
//        paramsMap.put("ent", ent);
//        String channel= ChannelUtil.getChannelCode(Global.mContext);
//        apiReq.setChannel(channel);
//        paramsMap.put("channel", channel);

        String reqStr = JSON.toJSONString(apiReq);
    }
}

