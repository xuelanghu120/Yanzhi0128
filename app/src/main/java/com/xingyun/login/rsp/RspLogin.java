package com.xingyun.login.rsp;

import com.common.http.YanzhiAbstractResponser;
import com.google.gson.Gson;
import com.xingyun.login.model.entity.User;
import org.json.JSONObject;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class RspLogin extends YanzhiAbstractResponser {

    public User user;

    @Override
    public void parserResult(JSONObject jsonObject,Gson gson) {
        user = gson.fromJson(jsonObject.toString(), User.class);
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return super.getErrorDesc(errorCode);
    }
}
