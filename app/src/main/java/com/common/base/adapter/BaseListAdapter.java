package com.common.base.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by xingyun87 on 2015/10/28.
 */
public abstract  class BaseListAdapter <T> extends BaseAdapter {
    private List<T> mList;

    public BaseListAdapter(List<T> mList){
        this.mList = mList;
    }

    @Override
    public int getCount() {
        if(mList != null){
            return mList.size();
        }
        return 0;
    }

    public void setList(List<T> mList){
        this.mList = mList;
        notifyDataSetChanged();
    }

    public void appendList(List<T> mList){
        if(this.mList == null){
            this.mList = mList;
        }else{
            this.mList.addAll(mList);
        }
        notifyDataSetChanged();
    }

    /***
     * 获取最后一个item信息
     * @return
     */
    public Object getLastItem(){
        if(mList != null){
            return mList.get(getCount() - 1);
        }
        return null;
    }

    @Override
    public Object getItem(int position) {
       if(mList != null && position < mList.size()){
           return mList.get(position);
       }
       return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        View mView = null;
        T t = (T) getItem(pos);
        BaseItemView<T> mItemView = null;
        if(convertView == null){
            mItemView = getItemView(t,pos);
        }else{
            mItemView = (BaseItemView) convertView;
        }
        mItemView.setPos(pos);
        mItemView.setSize(getCount());
        mItemView.setMsg(t);
        mView = mItemView;
        return mView;
    }

    public List<T> getList(){
        return this.mList;
    }

    protected abstract BaseItemView<T> getItemView(T t,int pos);

}
