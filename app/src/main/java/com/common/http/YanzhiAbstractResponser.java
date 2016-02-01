package com.common.http;

import android.text.TextUtils;

import com.common.http.base.RspBaseDataEntity;
import com.common.http.base.RspBaseEntity;
import com.common.utils.DateDeSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.util.Date;

import main.mmwork.com.mmworklib.http.responser.AbstractResponser;

/**
 * Created by 黄笠 on 2016/1/27.
 */
public abstract class YanzhiAbstractResponser extends AbstractResponser {

    public abstract void parserResult(JSONObject jsonObject, Gson gson);

    @Override
    public void parserBody(String result) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateDeSerializer()).setDateFormat(DateFormat.LONG).create();
        JSONObject jsonObject = json2Obj(result);
        parserResult(jsonObject, gson);
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return null;
    }

    public JSONObject json2Obj(String result) {
        if (isSuccess && !TextUtils.isEmpty(result)) {
            int code = -1;
            JSONObject jsonObj1 = null;
            try {
                RspBaseEntity baseEntity1 = new RspBaseEntity();
                jsonObj1 = new JSONObject(result);
                code = jsonObj1.getInt("code");
                baseEntity1.code = code;
                String desc = jsonObj1.getString("desc");
                baseEntity1.desc = desc;
                if(jsonObj1.has("token")){
                    String token = jsonObj1.getString("token");
                    baseEntity1.token = token;
                }
                if (code == 0) {
                    JSONObject jsonObj2 = jsonObj1.getJSONObject("data");
                    if (jsonObj2 != null) {
                        RspBaseDataEntity baseEntity2 = new RspBaseDataEntity();
                        int code2 = jsonObj2.getInt("code");
                        baseEntity2.code = code2;
                        if(jsonObj2.has("desc")){
                            baseEntity2.desc = jsonObj2.getString("desc");
                        }
                        if (jsonObj2.has("data")) {
                            JSONObject jsonObj3 = jsonObj2.getJSONObject("data");
                            return jsonObj3;
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
