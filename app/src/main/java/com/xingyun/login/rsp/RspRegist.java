package com.xingyun.login.rsp;

import com.common.http.YanzhiAbstractResponser;
import com.google.gson.Gson;
import com.xingyun.login.model.entity.ResultData;

import org.json.JSONObject;

/**
 * Created by 黄笠 on 2016/1/27.
 */
public class RspRegist extends YanzhiAbstractResponser {

    public ResultData<Integer> result;
    @Override
    public void parserResult(JSONObject jsonObject, Gson gson) {

    }
}
