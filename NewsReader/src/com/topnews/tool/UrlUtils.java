package com.topnews.tool;

/*
 * ʵ�ֲ�ͬ����ʱURLƴ��
 */
public class UrlUtils {
	private static String Url;
	private static String nickname;// ��������UTF8���������
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
