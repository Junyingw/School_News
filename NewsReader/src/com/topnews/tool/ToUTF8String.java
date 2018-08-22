package com.topnews.tool;

public class ToUTF8String {

	public static String toUTF8(String str) {
		
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= 0 && c <= 255) {

				sb.append(c);

			} else {
				
				byte[] b;
				try {

					b = String.valueOf(c).getBytes("utf-8");

				} catch (Exception ex) {

					System.out.println(ex);
					b = new byte[0];

				}

				for (int j = 0; j < b.length; j++) {

					int k = b[j];
					if (k < 0)
						k += 256;
					sb.append("%" + Integer.toHexString(k).toUpperCase());

				}
			}
		}
		return sb.toString();
	}

}