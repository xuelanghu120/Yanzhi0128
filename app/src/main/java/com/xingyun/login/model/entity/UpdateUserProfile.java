/**
 * UpdateUserProfile.java created at 2013-3-13 下午7:37:32 by ShimonXin
 */
package com.xingyun.login.model.entity;


import android.databinding.BaseObservable;

import com.xingyun.login.model.upload.UploadPicture;

/**
 * 更新用户档案
 * @author ShimonXin
 * @created 2013-3-13
 * 
 */


public class UpdateUserProfile extends BaseObservable {
	
	private String realname;
	private String gender;	
	private String blogurl;	
	private String nation;
	private String provinceid;
	private String cityid;
	private String birthday;
	private String birthdayStatus;	
	private String constellation;	
	private String constellationUp;	
	private String express;	
	private String englishname;	
	private String agency;
	private String height;
	private String weight;
	private String shape1;
	private String shape2;
	private String shape3;
	private String blood;	
	private String school;
	private String schoolStatus;	
	private String language;	
	private String delegate;	
	private String company;	
	private String broker;	
	private String interest;	
	private String mobile;	
	private String qq;	
	private String brokertel;	
	private String assistanttel;	
	private String others;
	private String provinceidBorn;
	private String cityidBorn;
	
	private String weixin;
	
	private String title;

	/**
	 * 经纪公司
	 */	
	private String brokerCompany;

	//下面是更新所用属性
	/**
	 * 全身像图片
	 */
	UploadPicture pic;
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlogurl() {
		return blogurl;
	}
	public void setBlogurl(String blogurl) {
		this.blogurl = blogurl;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthdayStatus() {
		return birthdayStatus;
	}
	public void setBirthdayStatus(String birthdayStatus) {
		this.birthdayStatus = birthdayStatus;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getConstellationUp() {
		return constellationUp;
	}
	public void setConstellationUp(String constellationUp) {
		this.constellationUp = constellationUp;
	}
	public String getExpress() {
		return express;
	}
	public void setExpress(String express) {
		this.express = express;
	}
	public String getEnglishname() {
		return englishname;
	}
	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getShape1() {
		return shape1;
	}
	public void setShape1(String shape1) {
		this.shape1 = shape1;
	}
	public String getShape2() {
		return shape2;
	}
	public void setShape2(String shape2) {
		this.shape2 = shape2;
	}
	public String getShape3() {
		return shape3;
	}
	public void setShape3(String shape3) {
		this.shape3 = shape3;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchoolStatus() {
		return schoolStatus;
	}
	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDelegate() {
		return delegate;
	}
	public void setDelegate(String delegate) {
		this.delegate = delegate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBroker() {
		return broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getBrokertel() {
		return brokertel;
	}
	public void setBrokertel(String brokertel) {
		this.brokertel = brokertel;
	}
	public String getAssistanttel() {
		return assistanttel;
	}
	public void setAssistanttel(String assistanttel) {
		this.assistanttel = assistanttel;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getProvinceidBorn() {
		return provinceidBorn;
	}
	public void setProvinceidBorn(String provinceidBorn) {
		this.provinceidBorn = provinceidBorn;
	}
	public String getCityidBorn() {
		return cityidBorn;
	}
	public void setCityidBorn(String cityidBorn) {
		this.cityidBorn = cityidBorn;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}	
	public String getBrokerCompany() {
		return brokerCompany;
	}
	public void setBrokerCompany(String brokerCompany) {
		this.brokerCompany = brokerCompany;
	}
	public UploadPicture getPic() {
		return pic;
	}
	public void setPic(UploadPicture pic) {
		this.pic = pic;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
