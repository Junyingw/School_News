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
            "\t\t\t\t\t<h2>尼泊尔政府代表团来我校考察数字化校园建设</h2>\n" +
            "\t\t\t\t\t<span>( 点击次数：46次   发布时间：2015-09-23   \n" +
            "\t\t\t\t\t 作者：杨鲜 见习记者郑孟娜    来源：本站)</span>\n" +
            "\t\t\t\t</div>\n" +
            "\n" +
            "\t\t\t\t<div class=\"artContent\">\n" +
            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
            "\t<span \"line-height:1.5;\">    新闻网讯（记者</span><span \"line-height:1.5;\">杨鲜 见习记者郑孟娜）9月21日，尼泊尔政府信息与通讯管理部官员访问团一行19人来我校考察数字化校园建设。</span><span \"line-height:1.5;\">在黄家湖校区图书馆二楼，我校现代教育信息中心主任万维新向外宾介绍了我校悠久的办学历史并详细介绍了我校数字化校园建设情况。</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<span \"line-height:1.5;\"><br>\n" +
            "</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t    据了解，我校校园网自1998年开始建设，1999年投入运行，经过不断地升级改造，已成为安全可靠、服务种类丰富的现代化网络中心。\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<br>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t    万维新介绍说，我校已经建立了一套完备的管理制度，为校内办公、教学、科研提供了稳定的网络环境。2014年我校与企业合作，在湖北省率先实现了全校园无线网覆盖。在未来几年内，我们将以建设数字化校园为中心，进一步扩大校园网络的规模，拓展应用范围，把学校建设成真正的智慧校园。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "\t \n" +
            "</p>\n" +
            "<p>\n" +
            "\t    尼泊尔代表团负责人PARASHURAM司长对我校优美的环境赞叹不已，他代表访问团感谢我校给他们提供了一次学习的机会，并希望今后能多与我校交流，创建更完善的数字信息系统。\n" +
            "</p>\n" +
            "<p>\n" +
            "\t<br>\n" +
            "</p></div>\n" +
            "\t\t\t\t\t<div id=\"artEnd\">\n" +
            "\t\t\t\t\t\t<span class=\"artKey\">文章关键字: </span>\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=校园\">校园</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=代表团\">代表团</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=政府\">政府</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=考察\">考察</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=考\">考</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=数字\">数字</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=来\">来</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=建设\">建设</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=我校\">我校</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=我\">我</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t   <a href=\"/searchNews.action?key=代表\">代表</a>\n" +
            "\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t<span id=\"editor\">(编辑：程毓)</span>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t</div>\n" +
            "\t\t\t\t<!-- 分享 -->\n" +
            "\t\t\t\t<div class=\"bshare-custom\">\n" ;
*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
	//	setNeedBackGesture(true);//设置需要手势监听
		getData(); 
//		initView();
//		initWebView();
		
	}

	/* 获取传递过来的数据 */
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
			settings.setJavaScriptEnabled(true);//设置可以运行JS脚本
//			settings.setTextZoom(120);//Sets the text zoom of the page in percent. The default is 100.
			settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
//			settings.setUseWideViewPort(true); //打开页面时， 自适应屏幕 
//			settings.setLoadWithOverviewMode(true);//打开页面时， 自适应屏幕 
			settings.setSupportZoom(false);// 用于设置webview放大
			settings.setBuiltInZoomControls(false);
			webView.setBackgroundResource(R.color.transparent);
			// 添加js交互接口类，并起别名 imagelistner
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
		//底部栏目
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

	// 注入js函数监听
	private void addImageClickListner() {
		// 这段js函数的功能就是，遍历所有的img几点，并添加onclick函数，在还是执行的时候调用本地接口传递url过去
		webView.loadUrl("javascript:(function(){"
				+ "var objs = document.getElementsByTagName(\"img\");"
				+ "var imgurl=''; " + "for(var i=0;i<objs.length;i++)  " + "{"
				+ "imgurl+=objs[i].src+',';"
				+ "    objs[i].onclick=function()  " + "    {  "
				+ "        window.imagelistner.openImage(imgurl);  "
				+ "    }  " + "}" + "})()");
	}

	// js通信接口
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
				Log.i("图片的URL>>>>>>>>>>>>>>>>>>>>>>>", s);
			}
			Intent intent = new Intent();
			intent.putStringArrayListExtra("infos", imgsUrl);
			intent.setClass(context, ImageShowActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(intent);
		}
	}

	// 监听
	private class MyWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return super.shouldOverrideUrlLoading(view, url);
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			view.getSettings().setJavaScriptEnabled(true);
			super.onPageFinished(view, url);
			// html加载完成之后，添加监听图片的点击js函数
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
