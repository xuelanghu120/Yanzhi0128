package com.xingyun.commentlist;

import com.common.common.Global;
import com.common.common.XYConfig;
import main.mmwork.com.mmworklib.http.HttpWork;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.Observable;

/**
 * 网络管理层
 * 请求参数的配置
 * 返回给被订阅者的数据
 * Created by anzhuo on 2016/1/23.
 */
public class CommentListNetManager {
    public static Observable<CommentListRsp> reqCommentMsgList(Long id,boolean needCache,
                                                               NetworkCallback<CommentListRsp> callback){
        ReqCommentListparam param = new ReqCommentListparam();
        if (id<0){
            param.id = null;
        }
        param.size = XYConfig.COMMENT_SIZE+"";
        return HttpWork.getInstace(Global.getContext()).get(param,CommentListRsp.class,callback,needCache);

    }
}
