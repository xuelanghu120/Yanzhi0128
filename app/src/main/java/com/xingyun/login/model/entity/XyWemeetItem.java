package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class XyWemeetItem extends BaseObservable implements Serializable {
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5845681433763226265L;

	/**
     * xy_wemeet_item.id 主键iD
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private Integer id;

    /**
     * xy_wemeet_item.wemeet_id 约见表ID
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private Integer wemeetId;

    /**
     * xy_wemeet_item.type 类型 0：文本 1：图片 2：视频
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private Integer type;

    /**
     * xy_wemeet_item.c1 文本或图片路径
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private String c1;

    /**
     * xy_wemeet_item.c2 图片描述或视频描述
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private String c2;

    /**
     * xy_wemeet_item.c3 视频原网站地址
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private String c3;

    /**
     * xy_wemeet_item.c4 视频ipad支持播放的地址
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private String c4;

    /**
     * xy_wemeet_item.c5 新浪视频vid
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private String c5;

    /**
     * xy_wemeet_item.seq 顺序
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private Integer seq;

    /**
     * xy_wemeet_item.systime 系统时间
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    private Date systime;

    /**
     * xy_wemeet_item.id 主键iD
     *
     * @return the value of xy_wemeet_item.id
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * xy_wemeet_item.id 主键iD
     *
     * @param id the value for xy_wemeet_item.id
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * xy_wemeet_item.wemeet_id 约见表ID
     *
     * @return the value of xy_wemeet_item.wemeet_id
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public Integer getWemeetId() {
        return wemeetId;
    }

    /**
     * xy_wemeet_item.wemeet_id 约见表ID
     *
     * @param wemeetId the value for xy_wemeet_item.wemeet_id
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setWemeetId(Integer wemeetId) {
        this.wemeetId = wemeetId;
    }

    /**
     * xy_wemeet_item.type 类型 0：文本 1：图片 2：视频
     *
     * @return the value of xy_wemeet_item.type
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public Integer getType() {
        return type;
    }

    /**
     * xy_wemeet_item.type 类型 0：文本 1：图片 2：视频
     *
     * @param type the value for xy_wemeet_item.type
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * xy_wemeet_item.c1 文本或图片路径
     *
     * @return the value of xy_wemeet_item.c1
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public String getC1() {
        return c1;
    }

    /**
     * xy_wemeet_item.c1 文本或图片路径
     *
     * @param c1 the value for xy_wemeet_item.c1
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setC1(String c1) {
        this.c1 = c1;
    }

    /**
     * xy_wemeet_item.c2 图片描述或视频描述
     *
     * @return the value of xy_wemeet_item.c2
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public String getC2() {
        return c2;
    }

    /**
     * xy_wemeet_item.c2 图片描述或视频描述
     *
     * @param c2 the value for xy_wemeet_item.c2
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setC2(String c2) {
        this.c2 = c2;
    }

    /**
     * xy_wemeet_item.c3 视频原网站地址
     *
     * @return the value of xy_wemeet_item.c3
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public String getC3() {
        return c3;
    }

    /**
     * xy_wemeet_item.c3 视频原网站地址
     *
     * @param c3 the value for xy_wemeet_item.c3
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setC3(String c3) {
        this.c3 = c3;
    }

    /**
     * xy_wemeet_item.c4 视频ipad支持播放的地址
     *
     * @return the value of xy_wemeet_item.c4
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public String getC4() {
        return c4;
    }

    /**
     * xy_wemeet_item.c4 视频ipad支持播放的地址
     *
     * @param c4 the value for xy_wemeet_item.c4
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setC4(String c4) {
        this.c4 = c4;
    }

    /**
     * xy_wemeet_item.c5 新浪视频vid
     *
     * @return the value of xy_wemeet_item.c5
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public String getC5() {
        return c5;
    }

    /**
     * xy_wemeet_item.c5 新浪视频vid
     *
     * @param c5 the value for xy_wemeet_item.c5
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setC5(String c5) {
        this.c5 = c5;
    }

    /**
     * xy_wemeet_item.seq 顺序
     *
     * @return the value of xy_wemeet_item.seq
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * xy_wemeet_item.seq 顺序
     *
     * @param seq the value for xy_wemeet_item.seq
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * xy_wemeet_item.systime 系统时间
     *
     * @return the value of xy_wemeet_item.systime
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public Date getSystime() {
        return systime;
    }

    /**
     * xy_wemeet_item.systime 系统时间
     *
     * @param systime the value for xy_wemeet_item.systime
     *
     * @mbggenerated Tue Jun 03 17:09:42 CST 2014
     */
    public void setSystime(Date systime) {
        this.systime = systime;
    }
}