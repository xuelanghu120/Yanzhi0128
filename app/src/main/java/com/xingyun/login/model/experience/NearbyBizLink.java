/**
 * NearbyBizLink.java created at 2015-8-31 上午11:04:18 by ShimonXin
 */
package com.xingyun.login.model.experience;

import android.databinding.BaseObservable;

import java.io.Serializable;

/**
 * 店铺链接
 * @author ShimonXin
 * @created 2015-8-31
 * 
 */
public class NearbyBizLink extends BaseObservable implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2249531365078119135L;
	Integer id; // ID
	Integer bizid; // 颜值商家ID
	String title; // 链接标题
	String url;// 链接URL
	Integer seq; // 排序
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBizid() {
		return bizid;
	}
	public void setBizid(Integer bizid) {
		this.bizid = bizid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
}
