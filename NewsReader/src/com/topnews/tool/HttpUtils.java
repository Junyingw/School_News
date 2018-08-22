package com.topnews.tool;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.topnews.MainActivity;



public class HttpUtils {

	private static StringBuilder result;

	/**
	 * 
	 * @param url
	 * @param which
	 */
	public static void getJSON(final String url, final int which) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				HttpURLConnection conn;
				InputStream is;
				try {
					conn = (HttpURLConnection) new URL(url).openConnection();
					conn.setRequestMethod("GET");
					is = conn.getInputStream();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(is));
					String line = "";
					result = new StringBuilder();
					while ((line = reader.readLine()) != null) {
						result.append(line);
					}
					reader.close();
					is.close();

					switch (which) {

					case 1:
						// ÏòLoginActicity´«µÝdata
						MainActivity.getJSONresult(result.toString());
						break;
					default:
						break;

					}

					/*
					 * Message msg = new Message(); msg.obj = result.toString();
					 * handler.sendMessage(msg);
					 */
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}
}
