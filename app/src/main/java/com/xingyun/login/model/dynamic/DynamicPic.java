/**
 * DynamicPic.java created at 2013-5-29 上午11:06:55 by ShimonXin
 */
package com.xingyun.login.model.dynamic;

/**
 * 用户主页显示的图片
 * 
 * @author ShimonXin
 * @created 2013-5-29
 * 
 */
public class DynamicPic {
	/**
	 * 展示id
	 */
	Integer topicid;

	/**
	 * 动态ID
	 */
	Integer id;
	/**
	 * 动态类型
	 */
	Integer dtype;
	/**
	 * 图片类型：0:图片 , 1:视频 , 2:文字 ,3:音频
	 */
	Integer type;
	/**
	 * 图片ID
	 */
	String pic;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getDtype() {
		return dtype;
	}

	public void setDtype(Integer dtype) {
		this.dtype = dtype;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTopicid() {
		return topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
	}
}
