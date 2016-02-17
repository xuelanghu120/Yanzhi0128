package com.xingyun.login.rsp;

import android.widget.Toast;

import com.common.common.Global;
import com.common.http.YanzhiAbstractResponser;
import com.common.http.base.RspBaseEntity;
import com.common.utils.SpUtil;
import com.google.gson.Gson;
import com.xingyun.login.model.entity.User;
import org.json.JSONObject;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class RspLogin extends YanzhiAbstractResponser {

    public User user;

    @Override
    public void parserResult(int code, JSONObject jsonObject, Gson gson) {
        if (code==0){
            SpUtil.saveLoginJson(jsonObject.toString());
            user = gson.fromJson(jsonObject.toString(), User.class);
        }else {
            RspBaseEntity entity = gson.fromJson(jsonObject.toString(),RspBaseEntity.class);
            Toast.makeText(Global.mContext, entity.desc, Toast.LENGTH_SHORT).show();
            user = null;
        }
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return super.getErrorDesc(errorCode);
    }
}
