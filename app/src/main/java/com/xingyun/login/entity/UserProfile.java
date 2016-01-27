package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import com.xingyun.login.upload.UploadPicture;

import java.io.Serializable;
import java.util.Date;



public class UserProfile extends BaseObservable implements Serializable {

	/**
	 * user_profile.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_profile.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_profile.realname 真实姓名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String realname;
	/**
	 * user_profile.gender 性别 0：女 1：男
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer gender;
	/**
	 * user_profile.blogurl 新浪微博名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String blogurl;
	/**
	 * user_profile.nation 民族
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String nation;
	/**
	 * user_profile.provinceid 省份id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer provinceid;
	/**
	 * user_profile.cityid 城市id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer cityid;
	/**
	 * user_profile.birthday 生日
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String birthday;
	/**
	 * user_profile.birthday_status 生日是否显示年 0：显示年 1：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer birthdayStatus;
	/**
	 * user_profile.constellation 星座
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String constellation;
	/**
	 * user_profile.constellation_up 上升星座
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String constellationUp;
	/**
	 * user_profile.express 快递地址
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String express;
	/**
	 * user_profile.englishname 英文名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String englishname;
	/**
	 * user_profile.agency 机构全称
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String agency;
	/**
	 * user_profile.height 身高
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String height;
	/**
	 * user_profile.weight 体重
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String weight;
	/**
	 * user_profile.shape1 胸围
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer shape1;
	/**
	 * user_profile.shape2 腰围
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer shape2;
	/**
	 * user_profile.shape3 臀围
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer shape3;
	/**
	 * user_profile.blood 血型
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String blood;
	/**
	 * user_profile.school 学校
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String school;
	/**
	 * user_profile.school_status 毕业状态 0：毕业 1：在读
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer schoolStatus;
	/**
	 * user_profile.language 擅长语言
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String language;
	/**
	 * user_profile.delegate 代表作
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String delegate;
	/**
	 * user_profile.company 当前公司
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String company;
	/**
	 * user_profile.broker 经纪公司/经纪人
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String broker;
	/**
	 * user_profile.interest 兴趣爱好
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String interest;
	/**
	 * user_profile.mobile 手机
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String mobile;
	/**
	 * user_profile.qq qq
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String qq;
	/**
	 * user_profile.brokertel 经纪人电话
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String brokertel;
	/**
	 * user_profile.assistanttel 助理电话
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String assistanttel;
	/**
	 * user_profile.others 其它联系方式
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String others;
	/**
	 * user_profile.provinceid_born 家乡省份
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer provinceidBorn;
	/**
	 * user_profile.cityid_born 家乡城市
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer cityidBorn;
	/**
	 * user_profile.wholebodypic 全身照
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String wholebodypic;
	/**
	 * user_profile.weixin 微信号
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String weixin;
	/**
	 * user_profile.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * user_profile.title 行业身份
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String title;
	/**
	 * user_profile.broker_company 经纪公司
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String brokerCompany;

	/**
	 * user_profile.id 主键
	 * 
	 * @return the value of user_profile.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_profile.id 主键
	 * 
	 * @param id
	 *            the value for user_profile.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_profile.userid 用户id
	 * 
	 * @return the value of user_profile.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_profile.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_profile.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_profile.realname 真实姓名
	 * 
	 * @return the value of user_profile.realname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getRealname() {
		return realname;
	}

	/**
	 * user_profile.realname 真实姓名
	 * 
	 * @param realname
	 *            the value for user_profile.realname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * user_profile.gender 性别 0：女 1：男
	 * 
	 * @return the value of user_profile.gender
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * user_profile.gender 性别 0：女 1：男
	 * 
	 * @param gender
	 *            the value for user_profile.gender
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * user_profile.blogurl 新浪微博名
	 * 
	 * @return the value of user_profile.blogurl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBlogurl() {
		return blogurl;
	}

	/**
	 * user_profile.blogurl 新浪微博名
	 * 
	 * @param blogurl
	 *            the value for user_profile.blogurl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBlogurl(String blogurl) {
		this.blogurl = blogurl;
	}

	/**
	 * user_profile.nation 民族
	 * 
	 * @return the value of user_profile.nation
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getNation() {
		return nation;
	}

	/**
	 * user_profile.nation 民族
	 * 
	 * @param nation
	 *            the value for user_profile.nation
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * user_profile.provinceid 省份id
	 * 
	 * @return the value of user_profile.provinceid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getProvinceid() {
		return provinceid;
	}

	/**
	 * user_profile.provinceid 省份id
	 * 
	 * @param provinceid
	 *            the value for user_profile.provinceid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setProvinceid(Integer provinceid) {
		this.provinceid = provinceid;
	}

	/**
	 * user_profile.cityid 城市id
	 * 
	 * @return the value of user_profile.cityid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getCityid() {
		return cityid;
	}

	/**
	 * user_profile.cityid 城市id
	 * 
	 * @param cityid
	 *            the value for user_profile.cityid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	/**
	 * user_profile.birthday 生日
	 * 
	 * @return the value of user_profile.birthday
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBirthday() {
		return birthday;
	}

	/**
	 * user_profile.birthday 生日
	 * 
	 * @param birthday
	 *            the value for user_profile.birthday
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * user_profile.birthday_status 生日是否显示年 0：显示年 1：不显示
	 * 
	 * @return the value of user_profile.birthday_status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getBirthdayStatus() {
		return birthdayStatus;
	}

	/**
	 * user_profile.birthday_status 生日是否显示年 0：显示年 1：不显示
	 * 
	 * @param birthdayStatus
	 *            the value for user_profile.birthday_status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setBirthdayStatus(Integer birthdayStatus) {
		this.birthdayStatus = birthdayStatus;
	}

	/**
	 * user_profile.constellation 星座
	 * 
	 * @return the value of user_profile.constellation
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getConstellation() {
		return constellation;
	}

	/**
	 * user_profile.constellation 星座
	 * 
	 * @param constellation
	 *            the value for user_profile.constellation
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	/**
	 * user_profile.constellation_up 上升星座
	 * 
	 * @return the value of user_profile.constellation_up
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getConstellationUp() {
		return constellationUp;
	}

	/**
	 * user_profile.constellation_up 上升星座
	 * 
	 * @param constellationUp
	 *            the value for user_profile.constellation_up
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setConstellationUp(String constellationUp) {
		this.constellationUp = constellationUp;
	}

	/**
	 * user_profile.express 快递地址
	 * 
	 * @return the value of user_profile.express
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getExpress() {
		return express;
	}

	/**
	 * user_profile.express 快递地址
	 * 
	 * @param express
	 *            the value for user_profile.express
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setExpress(String express) {
		this.express = express;
	}

	/**
	 * user_profile.englishname 英文名
	 * 
	 * @return the value of user_profile.englishname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getEnglishname() {
		return englishname;
	}

	/**
	 * user_profile.englishname 英文名
	 * 
	 * @param englishname
	 *            the value for user_profile.englishname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}

	/**
	 * user_profile.agency 机构全称
	 * 
	 * @return the value of user_profile.agency
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getAgency() {
		return agency;
	}

	/**
	 * user_profile.agency 机构全称
	 * 
	 * @param agency
	 *            the value for user_profile.agency
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
	 * user_profile.height 身高
	 * 
	 * @return the value of user_profile.height
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getHeight() {
		return height;
	}

	/**
	 * user_profile.height 身高
	 * 
	 * @param height
	 *            the value for user_profile.height
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * user_profile.weight 体重
	 * 
	 * @return the value of user_profile.weight
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getWeight() {
		return weight;
	}

	/**
	 * user_profile.weight 体重
	 * 
	 * @param weight
	 *            the value for user_profile.weight
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * user_profile.shape1 胸围
	 * 
	 * @return the value of user_profile.shape1
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getShape1() {
		return shape1;
	}

	/**
	 * user_profile.shape1 胸围
	 * 
	 * @param shape1
	 *            the value for user_profile.shape1
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setShape1(Integer shape1) {
		this.shape1 = shape1;
	}

	/**
	 * user_profile.shape2 腰围
	 * 
	 * @return the value of user_profile.shape2
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getShape2() {
		return shape2;
	}

	/**
	 * user_profile.shape2 腰围
	 * 
	 * @param shape2
	 *            the value for user_profile.shape2
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setShape2(Integer shape2) {
		this.shape2 = shape2;
	}

	/**
	 * user_profile.shape3 臀围
	 * 
	 * @return the value of user_profile.shape3
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getShape3() {
		return shape3;
	}

	/**
	 * user_profile.shape3 臀围
	 * 
	 * @param shape3
	 *            the value for user_profile.shape3
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setShape3(Integer shape3) {
		this.shape3 = shape3;
	}

	/**
	 * user_profile.blood 血型
	 * 
	 * @return the value of user_profile.blood
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBlood() {
		return blood;
	}

	/**
	 * user_profile.blood 血型
	 * 
	 * @param blood
	 *            the value for user_profile.blood
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBlood(String blood) {
		this.blood = blood;
	}

	/**
	 * user_profile.school 学校
	 * 
	 * @return the value of user_profile.school
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getSchool() {
		return school;
	}

	/**
	 * user_profile.school 学校
	 * 
	 * @param school
	 *            the value for user_profile.school
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * user_profile.school_status 毕业状态 0：毕业 1：在读
	 * 
	 * @return the value of user_profile.school_status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSchoolStatus() {
		return schoolStatus;
	}

	/**
	 * user_profile.school_status 毕业状态 0：毕业 1：在读
	 * 
	 * @param schoolStatus
	 *            the value for user_profile.school_status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSchoolStatus(Integer schoolStatus) {
		this.schoolStatus = schoolStatus;
	}

	/**
	 * user_profile.language 擅长语言
	 * 
	 * @return the value of user_profile.language
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getLanguage() {
		return language;
	}

	/**
	 * user_profile.language 擅长语言
	 * 
	 * @param language
	 *            the value for user_profile.language
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * user_profile.delegate 代表作
	 * 
	 * @return the value of user_profile.delegate
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getDelegate() {
		return delegate;
	}

	/**
	 * user_profile.delegate 代表作
	 * 
	 * @param delegate
	 *            the value for user_profile.delegate
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setDelegate(String delegate) {
		this.delegate = delegate;
	}

	/**
	 * user_profile.company 当前公司
	 * 
	 * @return the value of user_profile.company
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getCompany() {
		return company;
	}

	/**
	 * user_profile.company 当前公司
	 * 
	 * @param company
	 *            the value for user_profile.company
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * user_profile.broker 经纪公司/经纪人
	 * 
	 * @return the value of user_profile.broker
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBroker() {
		return broker;
	}

	/**
	 * user_profile.broker 经纪公司/经纪人
	 * 
	 * @param broker
	 *            the value for user_profile.broker
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBroker(String broker) {
		this.broker = broker;
	}

	/**
	 * user_profile.interest 兴趣爱好
	 * 
	 * @return the value of user_profile.interest
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getInterest() {
		return interest;
	}

	/**
	 * user_profile.interest 兴趣爱好
	 * 
	 * @param interest
	 *            the value for user_profile.interest
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * user_profile.mobile 手机
	 * 
	 * @return the value of user_profile.mobile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getMobile() {
		return mobile;
	}

	/**
	 * user_profile.mobile 手机
	 * 
	 * @param mobile
	 *            the value for user_profile.mobile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * user_profile.qq qq
	 * 
	 * @return the value of user_profile.qq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getQq() {
		return qq;
	}

	/**
	 * user_profile.qq qq
	 * 
	 * @param qq
	 *            the value for user_profile.qq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * user_profile.brokertel 经纪人电话
	 * 
	 * @return the value of user_profile.brokertel
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBrokertel() {
		return brokertel;
	}

	/**
	 * user_profile.brokertel 经纪人电话
	 * 
	 * @param brokertel
	 *            the value for user_profile.brokertel
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBrokertel(String brokertel) {
		this.brokertel = brokertel;
	}

	/**
	 * user_profile.assistanttel 助理电话
	 * 
	 * @return the value of user_profile.assistanttel
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getAssistanttel() {
		return assistanttel;
	}

	/**
	 * user_profile.assistanttel 助理电话
	 * 
	 * @param assistanttel
	 *            the value for user_profile.assistanttel
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setAssistanttel(String assistanttel) {
		this.assistanttel = assistanttel;
	}

	/**
	 * user_profile.others 其它联系方式
	 * 
	 * @return the value of user_profile.others
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getOthers() {
		return others;
	}

	/**
	 * user_profile.others 其它联系方式
	 * 
	 * @param others
	 *            the value for user_profile.others
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setOthers(String others) {
		this.others = others;
	}

	/**
	 * user_profile.provinceid_born 家乡省份
	 * 
	 * @return the value of user_profile.provinceid_born
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getProvinceidBorn() {
		return provinceidBorn;
	}

	/**
	 * user_profile.provinceid_born 家乡省份
	 * 
	 * @param provinceidBorn
	 *            the value for user_profile.provinceid_born
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setProvinceidBorn(Integer provinceidBorn) {
		this.provinceidBorn = provinceidBorn;
	}

	/**
	 * user_profile.cityid_born 家乡城市
	 * 
	 * @return the value of user_profile.cityid_born
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getCityidBorn() {
		return cityidBorn;
	}

	/**
	 * user_profile.cityid_born 家乡城市
	 * 
	 * @param cityidBorn
	 *            the value for user_profile.cityid_born
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setCityidBorn(Integer cityidBorn) {
		this.cityidBorn = cityidBorn;
	}

	/**
	 * user_profile.wholebodypic 全身照
	 * 
	 * @return the value of user_profile.wholebodypic
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getWholebodypic() {
		return wholebodypic;
	}

	/**
	 * user_profile.wholebodypic 全身照
	 * 
	 * @param wholebodypic
	 *            the value for user_profile.wholebodypic
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setWholebodypic(String wholebodypic) {
		this.wholebodypic = wholebodypic;
	}

	/**
	 * user_profile.weixin 微信号
	 * 
	 * @return the value of user_profile.weixin
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getWeixin() {
		return weixin;
	}

	/**
	 * user_profile.weixin 微信号
	 * 
	 * @param weixin
	 *            the value for user_profile.weixin
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	/**
	 * user_profile.systime 系统时间
	 * 
	 * @return the value of user_profile.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_profile.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_profile.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * user_profile.title 行业身份
	 * 
	 * @return the value of user_profile.title
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * user_profile.title 行业身份
	 * 
	 * @param title
	 *            the value for user_profile.title
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * user_profile.broker_company 经纪公司
	 * 
	 * @return the value of user_profile.broker_company
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getBrokerCompany() {
		return brokerCompany;
	}

	/**
	 * user_profile.broker_company 经纪公司
	 * 
	 * @param brokerCompany
	 *            the value for user_profile.broker_company
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setBrokerCompany(String brokerCompany) {
		this.brokerCompany = brokerCompany;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1653979422911666156L;
	/**
	 * 省份名称
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;

	/**
	 * 出生省份
	 */
	private String provinceBorn;
	/**
	 * 出生城市
	 */
	private String cityBorn;

	public String getProvinceBorn() {
		return provinceBorn;
	}

	public void setProvinceBorn(String provinceBorn) {
		this.provinceBorn = provinceBorn;
	}

	public String getCityBorn() {
		return cityBorn;
	}

	public void setCityBorn(String cityBorn) {
		this.cityBorn = cityBorn;
	}

	// 下面是更新所用属性
	/**
	 * 全身像图片
	 */
	UploadPicture pic;

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pic
	 */
	public UploadPicture getPic() {
		return pic;
	}

	/**
	 * @param pic
	 *            the pic to set
	 */
	public void setPic(UploadPicture pic) {
		this.pic = pic;
	}

	String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}