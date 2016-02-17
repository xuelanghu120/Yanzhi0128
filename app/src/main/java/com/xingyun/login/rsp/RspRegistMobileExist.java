package com.xingyun.login.rsp;

import android.content.Intent;
import android.widget.Toast;

import com.common.common.Global;
import com.common.http.YanzhiAbstractResponser;
import com.common.http.base.RspBaseEntity;
import com.google.gson.Gson;
import com.xingyun.login.model.entity.ResultData;

import org.json.JSONObject;

/**
 * Created by 黄笠 on 2016/1/29.
 */
public class RspRegistMobileExist extends YanzhiAbstractResponser {

    public ResultData result;

    @Override
    public void parserResult(int code, JSONObject jsonObject, Gson gson) {
        if (null!=jsonObject && code==0){
            result = gson.fromJson(jsonObject.toString(),ResultData.class);
        }else {
            RspBaseEntity entity = gson.fromJson(jsonObject.toString(),RspBaseEntity.class);
            isSuccess =false;
            errorCode = entity.code;
            errorMessage = entity.desc;
            result = null;
        }
    }
}
