package com.topnews;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.topnews.base.BaseActivity;
import com.topnews.bean.NewsEntity;
import com.topnews.service.NewsDetailsService;
import com.topnews.tool.BaseTools;
import com.topnews.tool.DataTools;
import com.topnews.tool.DateTools;

@SuppressLint("JavascriptInterface")
public class DetailsActivity extends BaseActivity {
	private TextView title;
	private ProgressBar progressBar;
	private FrameLayout customview_layout;
	private String news_url;
	private String news_title;
	private String news_source;
	private String news_date;
	private NewsEntity news;
	private TextView action_comment_count;
	WebView webView;
	
	private WebView test;
	private String blank="   ";
	private String data;       /* "<div id=\"innerPadding\">\n" +
            "                \n" +
            "\t\t\t\t<div class=\"artTitle\">\n" +
            "\t\t\t\t\t<h2>�Ჴ����������������У�������ֻ�У԰����</h2>\n" +
            "\t\t\t\t\t<span>( ���������46��   ����ʱ�䣺2015-09-23   \n" +
            "\t\t\t\t\t ���ߣ����� ��ϰ����֣����    ��Դ����վ)</span>\n" +
            "\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t<div class=\"artContent\">\n" +
            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
            "\t<span \"line-height:1.5;\">    ������Ѷ������</span><span \"line-height:1.5;\">���� ��ϰ����֣���ȣ�9��21�գ��Ჴ��������Ϣ��ͨѶ������Ա������һ��19������У�������ֻ�У԰���衣</span><span \"line-height:1.5;\">�ڻƼҺ�У��ͼ��ݶ�¥����У�ִ�������Ϣ����������ά���������������У�ƾõİ�ѧ��ʷ����ϸ��������У���ֻ�У԰���������</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<span \"line-height:1.5;\"><br>\n" +
            "</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t    ���˽⣬��УУ԰����1998�꿪ʼ���裬1999��Ͷ�����У��������ϵ��������죬�ѳ�Ϊ��ȫ�ɿ�����������ḻ���ִ����������ġ�\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<br>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t    ��ά�½���˵����У�Ѿ�������һ���걸�Ĺ����ƶȣ�ΪУ�ڰ칫����ѧ�������ṩ���ȶ������绷����2014����У����ҵ�������ں���ʡ����ʵ����ȫУ԰���������ǡ���δ�������ڣ����ǽ��Խ������ֻ�У԰Ϊ���ģ���һ������У԰����Ĺ�ģ����չӦ�÷�Χ����ѧУ������������ǻ�У԰��<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t \n" +
            "</p>\n" +
            "<p>\n" +
            "\t    �Ჴ�������Ÿ�����PARASHURAM˾������У�����Ļ�����̾���ѣ�����������Ÿ�л��У�������ṩ��һ��ѧϰ�Ļ��ᣬ��ϣ������ܶ�����У���������������Ƶ�������Ϣϵͳ��\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<br>\n" +
            "</p></div>\n" +
            "\t\t\t\t\t<div id=\"artEnd\">\n" +
            "\t\t\t\t\t\t<span class=\"artKey\">���¹ؼ���: </span>\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=У԰\">У԰</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=������\">������</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=����\">����</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=����\">����</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=��\">��</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=����\">����</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=��\">��</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=����\">����</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=��У\">��У</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=��\">��</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=����\">����</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t<span id=\"editor\">(�༭����ع)</span>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<!-- ���� -->\n" +
            "\t\t\t\t<div class=\"bshare-custom\">\n" ;
*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
	//	setNeedBackGesture(true);//������Ҫ���Ƽ���
		getData(); 
//		initView();
//		initWebView();
		
	}

	/* ��ȡ���ݹ��������� */
	private void getData() {
		news = (NewsEntity) getIntent().getSerializableExtra("news");
		news_url = news.getSource_url();
//		news_title = news.getTitle();
		news_source = news.getSource();
		
		data=news.getData();
		news_date = DateTools.getNewsDetailsDate(String.valueOf(news.getPublishTime()));
		test=(WebView)findViewById(R.id.wb_details);
		test.loadDataWithBaseURL("about:blank",data,"text/html","utf-8",null);
	
	}

	private void initWebView() {
		webView = (WebView)findViewById(R.id.wb_details);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		if (!TextUtils.isEmpty(news_url)) {
			WebSettings settings = webView.getSettings();
			settings.setJavaScriptEnabled(true);//���ÿ�������JS�ű�
//			settings.setTextZoom(120);//Sets the text zoom of the page in percent. The default is 100.
			settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
//			settings.setUseWideViewPort(true); //��ҳ��ʱ�� ����Ӧ��Ļ 
//			settings.setLoadWithOverviewMode(true);//��ҳ��ʱ�� ����Ӧ��Ļ 
			settings.setSupportZoom(false);// ��������webview�Ŵ�
			settings.setBuiltInZoomControls(false);
			webView.setBackgroundResource(R.color.transparent);
			// ���js�����ӿ��࣬������� imagelistner
			webView.addJavascriptInterface(new JavascriptInterface(getApplicationContext()),"imagelistner");
			webView.setWebChromeClient(new MyWebChromeClient());
			webView.setWebViewClient(new MyWebViewClient());
			new MyAsnycTask().execute(news_url, news_title, news_source + " " +news_date);
		}
	}

	private void initView() {
		title = (TextView) findViewById(R.id.title);
		progressBar = (ProgressBar) findViewById(R.id.ss_htmlprogessbar);
		customview_layout = (FrameLayout) findViewById(R.id.customview_layout);
		//�ײ���Ŀ
		action_comment_count = (TextView) findViewById(R.id.action_comment_count);
		
		progressBar.setVisibility(View.VISIBLE);
		title.setTextSize(13);
		title.setVisibility(View.VISIBLE);
		title.setText(news_url);
		action_comment_count.setText(String.valueOf(news.getCommentNum()));
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}
	
	private class MyAsnycTask extends AsyncTask<String, String,String>{

		@Override
		protected String doInBackground(String... urls) {
			String data=NewsDetailsService.getNewsDetails(urls[0],urls[1],urls[2]);
			return data;
		}

		@Override
		protected void onPostExecute(String data) {
			webView.loadDataWithBaseURL (null, data, "text/html", "utf-8",null);
		}
	}

	// ע��js��������
	private void addImageClickListner() {
		// ���js�����Ĺ��ܾ��ǣ��������е�img���㣬�����onclick�������ڻ���ִ�е�ʱ����ñ��ؽӿڴ���url��ȥ
		webView.loadUrl("javascript:(function(){"
				+ "var objs = document.getElementsByTagName(\"img\");"
				+ "var imgurl=''; " + "for(var i=0;i<objs.length;i++)  " + "{"
				+ "imgurl+=objs[i].src+',';"
				+ "    objs[i].onclick=function()  " + "    {  "
				+ "        window.imagelistner.openImage(imgurl);  "
				+ "    }  " + "}" + "})()");
	}

	// jsͨ�Žӿ�
	public class JavascriptInterface {

		private Context context;

		public JavascriptInterface(Context context) {
			this.context = context;
		}

		public void openImage(String img) {

			//
			String[] imgs = img.split(",");
			ArrayList<String> imgsUrl = new ArrayList<String>();
			for (String s : imgs) {
				imgsUrl.add(s);
				Log.i("ͼƬ��URL>>>>>>>>>>>>>>>>>>>>>>>", s);
			}
			Intent intent = new Intent();
			intent.putStringArrayListExtra("infos", imgsUrl);
			intent.setClass(context, ImageShowActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(intent);
		}
	}

	// ����
	private class MyWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return super.shouldOverrideUrlLoading(view, url);
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			view.getSettings().setJavaScriptEnabled(true);
			super.onPageFinished(view, url);
			// html�������֮����Ӽ���ͼƬ�ĵ��js����
			addImageClickListner();
			progressBar.setVisibility(View.GONE);
			webView.setVisibility(View.VISIBLE);
		}

		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			view.getSettings().setJavaScriptEnabled(true);
			super.onPageStarted(view, url, favicon);
		}

		@Override
		public void onReceivedError(WebView view, int errorCode,
				String description, String failingUrl) {
			progressBar.setVisibility(View.GONE);
			super.onReceivedError(view, errorCode, description, failingUrl);
		}
	}
	
	private class MyWebChromeClient extends WebChromeClient {
		@Override
		public void onProgressChanged(WebView view, int newProgress) {
			// TODO Auto-generated method stub
			if(newProgress != 100){
				progressBar.setProgress(newProgress);
			}
			super.onProgressChanged(view, newProgress);
		}
	}
	
	
}
