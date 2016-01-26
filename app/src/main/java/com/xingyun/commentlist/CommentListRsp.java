package com.xingyun.commentlist;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import java.util.List;

import main.mmwork.com.mmworklib.http.responser.AbstractResponser;

/**
 * 返回的数据对象
 * Created by anzhuo on 2016/1/23.
 */
public class CommentListRsp  extends AbstractResponser{
    public List<PMsgItemEntity> mList;
    @Override
    public void parserBody(String result) {
        if (isSuccess && !TextUtils.isEmpty(result)){
            mList = JSON.parseArray(result,PMsgItemEntity.class);
        }else {

        }
    }

    @Override
    public String getErrorDesc(int errorCode) {
        return null;
    }
}
