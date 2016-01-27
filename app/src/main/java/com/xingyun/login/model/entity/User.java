package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import com.xingyun.login.model.dynamic.DynamicPic;
import com.xingyun.login.model.experience.Experience;
import com.xingyun.login.model.upload.UploadPicture;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class User extends BaseObservable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3118712622572827123L;
	
	/**
	 * 用户级别V3.6
	 */
	public Integer userLevel;
	
	/**
	 * 级别名称V3.6
	 */
	public String levelName;
	
	/**
	 * 是否评分用户：0否，1是V3.6
	 */
	public Integer voteUser ;
	
	/**
	 * 评分人数V3.6
	 */
	public Integer scoreUserCount;
	
	/**
	 * 评分总分V3.6
	 */
	public float score;
	
	/**
	 * 用户所得星数
	 */
	public float starScore;
	
	/**
	 * 是否已评分：0否，1是V3.6
	 */
	public Integer isVote;
	
	/**
	 * 打分文案配置V3.6
	 */
	public ArrayList<String> scoreTips;
	
	/**
	 * 我给出的评分V3.6
	 */
	public float myScore;
	/**
	 * 我给出的评论v3.6
	 */
	public String myScoreComment;
	/**
	 * 底部文案
	 */
	public String scoreMsg;
	/**
	 * 显示分数的最小评分人数
	 */
	public Integer minScoreUserCount;
	/**
	 * 用户奖品文案信息
	 */
	public String awardMsg;
	
	/**
	 * user.userid 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String userid;
	/**
	 * user.email 邮箱
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String email;
	/**
	 * user.nickname 昵称
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String nickname;
	/**
	 * user.lid 用户级别 0：游客 1：精英 2：明星
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer lid;
	/**
	 * user.wkey 个性域名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String wkey;
	/**
	 * user.logourl 头像路径
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String logourl;
	/**
	 * user.introduction 一句话简介
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String introduction;
	/**
	 * user.verified 是否认证 0：未认证 1：已认证
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer verified;
	/**
	 * user.verified_reason 认证内容
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String verifiedReason;
	/**
	 * user.verified_name 认证姓名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String verifiedName;
	/**
	 * user.xynumber 星云号
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String xynumber;
	/**
	 * user.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public long systime;
	/**
	 * user.pinyinname 昵称汉字拼音
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String pinyinname;
	/**
	 * user.job_status 求职状态
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer jobStatus;
	/**
	 * user.mobile_background 手机端动态背景图片
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String mobileBackground;
	/**
	 * 注册来源：1 用户名密码，2新浪微博，3 QQ ，4
	 */
	public Integer registerFrom;
	/**
	 * user.mastertype 达人类型:0否,1是,2取消
	 * 
	 * @mbggenerated Thu Dec 19 10:21:59 CST 2013
	 */
	public Integer mastertype;
	
	/**
	 * 推荐ID
	 */
	public Integer id;
	/**
	 * 是否人才
	 */
	public Integer rencai;
	/**
	 * 微博已认证
	 */
	public Integer weiboVerified;
	/**
	 * 微博信息
	 */
	public String weiboVerifiedReason;
	/**
	 * 用于识别请求的TOKEN
	 */
	public String token;

	/**
	 * 新浪微博信息
	 */
	public WeiboProfile weibo;
	/**
	 * 用户申请状态
	 */
	public UserProfileProgress progress;
	/**
	 * 用户个人档案
	 */
	public UserProfile profile;
	/**
	 * 用户个人自定义档案
	 */
	public List<UserProfileOther> otherProfiles;
	/**
	 * 显示联系方式
	 */
	public List<UserProfileStatus> showContacts;
	/**
	 * 用户技能
	 */
	public List<DicSkill> skills;
	/**
	 * 用户数值表
	 */
	public UserCounter counter;
	/**
	 * 用户首页控制
	 */
	public Face face;
	/**
	 * 控制选项
	 */
	public UserControl control;
	/**
	 * 当前登录用户是否关注所查看的用户
	 */
	public Integer isFollower;

	/**
	 * 所查看的用户是否关注当前登录用户，即对方是否粉丝
	 */
	public Integer isFans;
	/**
	 * 当前登录用户是否与所查看的用户是双向关注关系（好友）
	 */
	public Integer isDouble;
	/**
	 * 当前登录用户是否将对方拉入黑名单
	 */
	public Integer isBlock;
	/**
	 * 当前登录用户是否将对方隐藏
	 */
	public Integer isHide;
	/**
	 * 当前登录用户是否能给查看的用户发送私信
	 */
	public Integer canSendMessage;
	/**
	 * 当前登录用户是否已经添加查看的用户为意向合作
	 */
	public Integer isCooperate;
	/**
	 * 是否被当前用户推荐过
	 */
	public Integer isRecommend;
	/**
	 * 是否可以被推荐
	 */
	public Integer canRecommend;
	/**
	 * 所有头像
	 */
	public List<UserLogo> logos;
	/**
	 * 领域/行业
	 */
	public List<String> trades;
	/**
	 * 领域/行业ID
	 */
	public List<Integer> tradeIds;
	/**
	 * 擅长/技能
	 */
	public List<String> goodAt;
	/**
	 * 交易量
	 */
	public Integer vob;
	/**
	 * 行业身份
	 */
	public String title;

	/**
	 * 性别
	 */
	public Integer gender;
	/**
	 * 省份ID
	 */
	public Integer provinceid;
	/**
	 * 城市ID
	 */
	public Integer cityid;
	/**
	 * 省份名称
	 */
	public String province;
	/**
	 * 城市
	 */
	public String city;
	/**
	 * 访问量
	 */
	public Integer visitCount;
	/**
	 * 收藏的展示数
	 */
	public Integer favorWorksCount;
	/**
	 * 我的评论数
	 */
	public Integer myCommentsCount;
	/**
	 * 被推荐数
	 */
	public Integer recommendCount;
	/**
	 * 被我推荐数
	 */
	public Integer recommendByMe;
	/**
	 * 可能认识的人数
	 */
	public Integer mayknownCount;
	/**
	 * 转发我的数
	 */
	public Integer fowardMyCount;
	/**
	 * 是否代理人
	 */
	public Integer isAgent;
	/**
	 * 是否担保用户
	 */
	public Integer isWarranty;

	/**
	 * 被保护的用户
	 */
	public Integer protect;
	/**
	 * 专业用户
	 */
	public Integer professional;
	/**
	 * 付费会员
	 */
	public Integer payUser;
	/**
	 * 是否星主会员
	 */
	public Integer hostUser = 0;
	/**
	 * 是否屏蔽星友圈
	 */
	public Integer blockStatus = 0;
	/**
	 * 是否已购买
	 */
	public Integer subscribed;
	/**
	 * 绑定手机号
	 */
	public MobileNumber bindingMobile;

	// 下面用于更新用户使用
	/**
	 * 显示联系方式
	 */
	public List<String> contactShows;
	/**
	 * 移动端背景图片
	 */
	public UploadPicture mobileBackGroundPic;
	/**
	 * 更改个人资料
	 */
	public UpdateUserProfile updateProfile;
	
	public String nicknameError;
	/**
	 * Email更新出错信息
	 */
	public String emailError;
	/**
	 * 手机更新出错信息
	 */
	public String mobileError;
	/**
	 * 技能更新出错
	 */
	public String skillError;
	
	/**
	 * 排序时间
	 */
	public Long sortTime;
	/**
	 * 拉黑原因/推荐理由等
	 */
	public String reason;
	/**
	 * 推荐语音链接
	 */
	public String audioUrl;
	/**
	 * 推荐语音时长
	 */
	public Integer audioDuration;
	/**
	 * 推荐语音类型
	 */
	public String audioType;
	/**
	 * 推荐语音ID
	 */
	public Long audioId;
	/**
	 * 星云网用户
	 */
	public String xingyunId;
	/**
	 * 星云推荐页是否已查看
	 */
	public Integer recommendOnce;
	/**
	 * 星友圈页 如果背景图未设置 ，显示此默认图
	 */
	public String defaultMobileBackground;
	/**
	 * 朋友
	 */
	public List<User> friends;

	/**
	 * 朋友来源
	 */
	public User friendSource;
	/**
	 * 是否填写基础档案(用于个人设置)
	 */
	public Integer isProfileSet;
	
	/**
	 * 页面显示时间
	 */
	public String blogSystime;
	/**
	 * 是否游客：0用户，1游客
	 */
	public Integer isvisitor;
	
	/**
	 * 是否群管理员
	 */
	public Integer isAdmin;
	/**
	 * 群权限
	 */
	public Integer groupAccess;
	
	/**
	 * 头像100尺寸
	 */
	public String logourl100;
	/**
	 * 用户创建时间
	 */
	public long joinDate;

	/**
	 * 真实姓名
	 */
	public String realname;
	/**
	 * 英文名
	 */
	public String englishname;
	/**
	 * 民族
	 */
	public String nation;
	/**
	 * 生日
	 */
	public String birthday;
	/**
	 * 星座
	 */
	public String constellation;
	/**
	 * 上升星座
	 */
	public String constellationUp;
	/**
	 * 身高
	 */
	public String height;
	/**
	 * 胸围
	 */
	public Integer shape1;
	/**
	 * 腰围
	 */
	public Integer shape2;
	/**
	 * 臀围
	 */
	public Integer shape3;
	/**
	 * 体重
	 */
	public String weight;
	/**
	 * 血型
	 */
	public String blood;
	/**
	 * 关注类型:0未关注,1相互关注,2已关注,3我的粉丝
	 */
	public Integer followType;
	/**
	 * 家乡省ID
	 */
	public Integer provinceidBorn;
	/**
	 * 家乡市ID
	 */
	public Integer cityidBorn;
	/**
	 * 家乡省名称
	 */
	public String provinceidName;
	/**
	 * 家乡市名称
	 */
	public String cityidName;
	/**
	 * 省名称
	 */
	public String provinceName;
	/**
	 * 市名称
	 */
	public String cityName;
	/**
	 * 学校
	 */
	public String school;
	/**
	 * 擅长语言
	 */
	public String language;
	/**
	 * 代表作
	 */
	public String delegate;
	/**
	 * 当前公司
	 */
	public String company;
	/**
	 * 经纪公司
	 */
	public String brokerCompany;
	/**
	 * 经纪人
	 */
	public String broker;
	/**
	 * 兴趣爱好
	 */
	public String interest;
	/**
	 * QQ
	 */
	public String qq;
	/**
	 * 微信
	 */
	public String weixin;
	/**
	 * 微博
	 */
	public String blogurl;
	/**
	 * 推荐数量
	 */
	public Integer recommendcount;
	/**
	 * 粉丝数量
	 */
	public Integer fanscount;
	/**
	 * 影响力数量
	 */
	public Integer affectcount;
	/**
	 * 展示点击量
	 */
	public Integer postcount;
	/**
	 * 档案点击量
	 */
	public Integer profilecount;
	/**
	 * 个人首页点击量
	 */
	public Integer homecount;
	/**
	 * 推荐点击量
	 */
	public Integer recommendcountUvc;
	/**
	 * 用户机会访问量
	 */
	public Integer xingyucount;
	/**
	 * 影响力数量
	 */
	public Integer userjobcount;
	/**
	 * 用户提供服务访问量
	 */
	public Integer userservecount;
	/**
	 * 点击量总数
	 */
	public Integer count;
	/**
	 * 个人主页连接
	 */
	public String userHref;
	/**
	 * 三张动态图片
	 */
	public List<DynamicPic> sayings;
	/**
	 * 总支持数
	 */
	public Integer surpportScore;
	/**
	 * 榜单支持人数
	 */
	public Integer ladderScore;
	/**
	 * 用户分享URL
	 */
	public String shareUrl;
	/**
	 * 用户微博分享正文
	 */
	public String shareWeiboContent;
	/**
	 * 微信分享标题
	 */
	public String shareWeixinTitle;
	/**
	 * 微信分享正文
	 */
	public String shareWeixinContent;
	public boolean isPayUser;
	/**
	 * 用户的最新约见
	 */
	public XyWemeet wemeet;
	/**
	 * 是否同城推荐
	 */
	public Integer nearbyRecommend;
	/**
	 * 微信信息
	 */
	public WechatProfile weChat;
	/**
	 * 本周评分人数
	 */
	public Integer scoreWeekUserCount;
	/**
	 * 被回复人
	 */
	public User upUser;
	
	/**
	 * 邀请别人打分分享的文案
	 */
	public String scoreShareTitle;
	
	/**
	 * 是否允许发布体验:0不允许，1允许V3.8
	 */
	public Integer allowDianping;
	
	/**
	 * 允许发布体验的用户类型名V3.8
	 */
	public String dianpingUserTypeName;
	
	/**
	 * 用户收藏或签到的体验列表V3.8
	 */
	public ArrayList<Experience> favoriteExperiences;
	
	/**
	 * 排名  V3.9
	 */
	public Integer rank;
	
	// 赞数-V3.9.0
	public Integer zanCount;
	
	// 赞数-V3.9.0
	public Integer totalZanCount;
	/**
	 * 是否允许更改查看关注人的选项,0不允许，1允许V3.9.5
	 */
	public Integer allowChangeViewFollowersSetting;
	
	/**
	 * 是否允许查看关注人,0不允许，1允许V3.9.5
	 */
	public Integer allowViewFollowers;
	
	/**
	 * V4.0 消费级别
	 */
	public Integer consumeLevel;

	// 消费级别名称
	public String consumeLevelName;

	// V4.0 用户收入，单位：元
	public Double income;
	/**
	 * 共同好友数 V4.0
	 */
	public Integer mutualCount;
	/**
	 * V4.1 当前用户打赏的总金额
	 */
	public Integer rewardAmount;
	/**
	 * V4.1 余额的提示信息
	 */
	public String balanceMsg;
}