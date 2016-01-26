package com.xingyun.commentlist;


import rx.Observable;

/**
 * 数据的管理类
 * Created by anzhuo on 2016/1/23.
 */
public class CommentListDataCenterManager {
    private static CommentListDataCenterManager instance;
    public static CommentListDataCenterManager getInstance(){
        if (instance==null){
            synchronized (CommentListDataCenterManager.class){
                if (instance==null){
                    instance = new CommentListDataCenterManager();
                }
            }
        }
        return  instance;
    }
//    public ObservableArraylist
}
