package com.topnews.tool;

/*
 * 实现不同方法时URL拼接
 */
public class UrlUtils {
	private static String Url;
	private static String nickname;// 用来储存UTF8编码的名字
	private static String GET_URL = "http://1.dmlx.applinzi.com/";

	public static String register(String userlogin, String userid,
			String userpwd, String action) {
		nickname = ToUTF8String.toUTF8(userid);
		Url = GET_URL + "?UserLogin=" + userlogin + "&UserID=" + nickname
				+ "&UserPwd=" + userpwd + "&Aaction=" + action;
		return Url;
	}

	public static String login(String userlogin, String userpwd, String action) {
		Url = GET_URL + "?UserLogin=" + userlogin + "&UserPwd=" + userpwd
				+ "&Aaction=" + action;
		return Url;
	}

	public static String findpwd(String userlogin, String newpassword,
			int action) {
		Url = GET_URL + "?UserLogin=" + userlogin + "&UserPwd=" + newpassword
				+ "&Aaction=" + action;
		return Url;
	}
}
