package com.xingyun.login.utils;


import android.content.Context;
import com.tencent.mm.sdk.modelmsg.SendAuth.Resp;
import com.common.common.XYConstant;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.xingyun.login.controller.LoginController;
import com.xingyun.main.R;

import java.io.IOException;

public class WXUtils {
	private static final String TAG = "WXUtils";
	
	//https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	//用户同意授权以后,第二步：通过code获取access_token,此处得到请求网络的url
	public static final String getAuthUrl(String code){
		String str = "";
		str = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" 
		+ XYConstant.WX_APP_ID + "&secret="+XYConstant.WX_APP_SECRET+"&code=" + code + "&grant_type=authorization_code";
		return str;
	}

	/**
	 * 微信登陆错误代码的提示
	 * @param context
	 * @param code
	 * @return
	 */
	public static  String getErroStr(Context context, int code) {
		String str = "";
		switch (code) {
			case LoginController.ERRORCODE_AUTH_DENIED:
				str = context.getResources().getString(R.string.auth_denied);
				break;
			case LoginController.ERRORCODE_ERR_SENT_FAILED:
				str = context.getResources().getString(R.string.auth_send_failure);
				break;
			case LoginController.ERRORCODE_JSON_NULL:
				str = context.getResources().getString(R.string.auth_json_null);
				break;
			case LoginController.ERRORCODE_USER_CANCLE:
				str = context.getResources().getString(R.string.auth_cancle);
				break;
			case LoginController.ERRORCODE_JSON_PARSE_ERROR:
				str = context.getResources().getString(R.string.auth_json_parse_error);
				break;
			case LoginController.ERRORCODE_ERR_UNSUPPORT:
				str = context.getResources().getString(R.string.auth_not_support);
				break;
		}
		return str;
	}

	/**
	 * 根究微信返回对象请求网络返回数据string
	 * @return
	 */
	public static String getResponse(Resp authResp) {
		final String url = WXUtils.getAuthUrl(authResp.code);
		Request request = new Request.Builder()
				.url(url)
				.build();
		OkHttpClient client = new OkHttpClient();
		Response response = null;
		String s = null;
		try {
			Call call = client.newCall(request);
			response = call.execute();
			s = response.body().string();
			if (s == null) {
				LoginController.getInstance().onLoginResult(false, LoginController.ERRORCODE_JSON_NULL, null);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
}
