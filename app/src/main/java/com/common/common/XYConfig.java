package com.common.common;

import android.text.TextUtils;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class XYConfig {
    // 0 is branch test,1 is trunk test,2 is production
    public static final int ENVIRONMENT_KEY = 2;
    private static final String[] APP_KEY_ARRAY = { "1289664253", "1289664253","1289664253"};
    private static final String[] SINA_SCRET_ARRAY = { "e030d32ac1d92de8d4cc3a2d1fdcd145", "e030d32ac1d92de8d4cc3a2d1fdcd145", "e030d32ac1d92de8d4cc3a2d1fdcd145" };
    public static final String[] API_URL_ARRAY = {"http://api.branch.xingyun.cn/api",  "http://api.trunk.xingyun.cn/api", "http://api.xingyun.cn" };
    private static final String[] PHOTO_URL_ARRAY = { "http://upload.branch.xingyun.cn:8081/phoneUploadServlet","http://upload.trunk.xingyun.cn:8080/phoneUploadServlet", "http://upload.xingyun.cn:8082/phoneUploadServlet" };
    private static final String[] AUDIO_URL_ARRAY = { "http://upload.branch.xingyun.cn:8081/audioServlet", "http://upload. trunk.xingyun.cn:8080/audioServlet", "http://upload.xingyun.cn:8082/audioServlet"};
    private static final String[] VIDEO_URL_ARRAY = { "http://upload.branch.xingyun.cn:8081/videoServlet","http://upload.trunk.xingyun.cn:8080/videoServlet", "http://upload.xingyun.cn:8082/videoServlet"};
    private static final String[] SHARE_URL_ARRAY = {"http://www.branch.xingyun.cn", "http://www.trunk.xingyun.cn", "http://www.xingyun.cn"};
    private static final String[] SINA_REDIRECT_URL_ARRAY={"http://www.xingyun.cn", "http://www.xingyun.cn", "http://www.xingyun.cn"};
    private static final String[] XY_HELP_URL_ARRAY = {"http://www.branch.xingyun.cn/html/phone_help/008.html","http://www.trunk.xingyun.cn/html/phone_help/008.html", "http://html.xingyun.cn/html/phone_help/008.html"};
    private static final String[] EBASE_URL_ARRAY = {"http://www.branch.xingyun.cn/ebase", "http://www.trunk.xingyun.cnc/ebase", "http://www.xingyun.cn/ebase"};
    private static final String[] XY_WE_MEET_URL_ARRAY = {"http://www.branch.xingyun.cn/wemeet", "http://www.trunk.xingyun.cn/wemeet", "http://www.xingyun.cn/wemeet"};
    private static final String[] XY_MY_LEVEL_URL_ARRAY = {"http://www.branch.xingyun.cn/html/app/level_page.html?", "http://www.trunk.xingyun.cn/html/app/level_page.html?", "http://www.xingyun.cn/html/app/level_page.html?"};
    private static final String[] XY_MY_SCORE_URL_ARRAY = {"http://www.branch.xingyun.cn/u/user_id/yanzhi", "http://www.trunk.xingyun.cn/u/user_id/yanzhi", "http://www.xingyun.cn/u/user_id/yanzhi"};

    public static final boolean IS_DEBUG = false;
    //json调试是否打开
    public static final boolean IS_JSON_DEBUG = false;
    //登陆token日志跟踪开关
    public static final boolean IS_DEBUG_LOGFILE = false;

    private static final boolean TEST_MODE = false;
    public static final String TEST_ACCOUNT = "13466608793";
    public static final String TEST_PASSWORD = "111111";

    public static final boolean MSG_ENABLED = true;
    public static final boolean MSG_HISTORY_ENABLED = true;

    public static final String XINGYUN_PLUS = null;
    //前台程序启动时，动态修改，和前台程序版本号一致
    public static String VERSION = "4.0.1";
    public static final String PLATFORM = "android";
    public static final String REQUESTFORMAT = "json";
    public static final String PREFERENCES_NAME = "XY_REFERENCE";
    public static final String USER_ID_KEY = "userId_key";
    public static final String DB_DELETE = "DB_DELETE";

    public static final int DEFAULT_HTTP_TIMEOUT = 15 * 1000;
    public static final long NUMBER_TIMER = 15 * 1000;
    public static final long MESSAGE_TIMER = 4 * 1000;

    //动态详情页面图片是否全部显示大图
    public static final boolean DYNAMIC_IS_ALL_BIG_IMAGE = true;
    //是否开启展示相关人信息
    public static final boolean SHOW_RELAED_USER_ON = true;

    public static final int MAX_RECORD_SEC = 60;
    public static final int MAX_VIDEO_SIZE = 3;//允许能上传的最大视频3mb
    public static final String VOICE_AAC = "AAC";
    public static final String VOICE_ILBC = "iLBC";
    public static final String VOICE_AMR = "AMR";

    // public static final String defalutOauth2 = "https://api.weibo.com/oauth2/default.html";
    public static final String SINA_REDIRECT_URL = SINA_REDIRECT_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String API_SECRET = ",./;'[]=-098*()_+}{:\"?xy1503";

    public static final String API_Url = API_URL_ARRAY[ENVIRONMENT_KEY];
    //	public static final String API_Url = API_URL_ARRAY[1];
    public static final String PHOTO_API = PHOTO_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String AUDIO_API = AUDIO_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String VIDEO_API = VIDEO_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String SINA_APP_KEY = APP_KEY_ARRAY[ENVIRONMENT_KEY];
    public static final String SINA_SECRET = SINA_SCRET_ARRAY[ENVIRONMENT_KEY];
    public static final String SINA_RELEASE_URL = "https://api.weibo.com/oauth2/revokeoauth2?access_token=";
    public static final String SINA_OAUTH_URL = "https://open.weibo.cn/oauth2/authorize?client_id=" + SINA_APP_KEY + "&response_type=code&redirect_uri=" + SINA_REDIRECT_URL + "&display=mobile";
    public static final String SHARE_URL = SHARE_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String WE_MEET_URL = XY_WE_MEET_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String XY_MY_LEVEL_URL = XY_MY_LEVEL_URL_ARRAY[ENVIRONMENT_KEY];


    public static final String XY_HELP_URL = XY_HELP_URL_ARRAY[ENVIRONMENT_KEY];
    public static final String EBASE_URL = EBASE_URL_ARRAY[ENVIRONMENT_KEY];

    public static final String SINA_ACCESS_TOKEN_URL = "https://open.weibo.cn/oauth2/access_token?client_id=" + SINA_APP_KEY + "&client_secret=" + SINA_SECRET
            + "&grant_type=authorization_code&redirect_uri=" + SINA_REDIRECT_URL + "&code=";

    public static final String SINA_SCOPE = "email,direct_messages_read,direct_messages_write," + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
            + "follow_app_official_microblog," + "invitation_write";

    public static final String REGISTER_AGREEMENT_URL = "http://www.xingyun.cn/html/phone_help/009.html";

    public static final String XY_SCORE_URL = "http://www.xingyun.cn/u/%@/yanzhi";

    public static final String XY_HELP_URL_NEW = "http://mp.weixin.qq.com/s?__biz=MjM5OTE3MTcwMA==&mid=402056094&idx=1&sn=581021cf96ecd296b134364db69a75ad#rd";

    public static final String getScoreUrl(String userId) {
        String scoreUrl = XY_MY_SCORE_URL_ARRAY[ENVIRONMENT_KEY];
        if (!TextUtils.isEmpty(scoreUrl)) {
            return scoreUrl.replace("user_id", userId);
        } else {
            return null;
        }
    }

    @SuppressWarnings("unused")
    public static boolean isTestMode() {
        if (TEST_MODE && !TextUtils.isEmpty(TEST_ACCOUNT) && !TextUtils.isEmpty(TEST_PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 交易单号的单利
     */
    public  static String WXPAY_TRADENO;

    public static String getTradeNo() {
        return WXPAY_TRADENO;
    }
}
