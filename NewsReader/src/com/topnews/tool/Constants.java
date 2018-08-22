package com.topnews.tool;

import java.util.ArrayList;
import java.util.List;

import com.topnews.bean.CityEntity;
//import com.topnews.bean.NewsClassify;
import com.topnews.bean.NewsEntity;

public class Constants {
//	private String data;
	private static int columnselectindex ;
	
	public Constants(/*String data2,*/int c) {
	//	this.data = data;
		this.columnselectindex= c;
	}
	public void setColumnselectindex(int c){
		this.columnselectindex=c;
		
	}	
	/*
	 * ��ȡ�����б�
	 */
	public  static  ArrayList<NewsEntity> getNewsList(int channel_id) {
		
		ArrayList<NewsEntity> newsList = new ArrayList<NewsEntity>();
		columnselectindex=channel_id;
	if(columnselectindex==1){
	
		for(int i =0 ; i < 10 ; i++){
			NewsEntity news = new NewsEntity();
			news.setId(i);
			news.setNewsId(i);
			news.setCollectStatus(false);
			news.setCommentNum(i + 10);
			news.setInterestedStatus(true);
			news.setLikeStatus(true);
			news.setReadStatus(false);
			news.setNewsCategory("�Ƽ�");
			news.setNewsCategoryId(1);
			news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/28/75985.html");
			news.setTitle("��Զ�������Ľ�����꽲������ѧ�ӽ��µġ��й�������ʷ");
			news.setData("<div id=\"innerPadding\">\n" +
		            "                \n" +
		            "\t\t\t\t<div class=\"artTitle\">\n" +
		            "\t\t\t\t\t<h2>��Զ�������Ľ�����꽲������ѧ�ӽ��µġ��й�������ʷ</h2>\n" +
		            "\t\t\t\t\t<span>   \n" +
		            "\t\t\t\t\t </span>\n" +
		            "\t\t\t\t</div>\n" +
		            "\n" +
		            "\t\t\t\t<div class=\"artContent\">\n" +
		            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
		            "\t<span \"line-height:1.5;\">������</span><span \"line-height:1.5;\">��������Դ����Զ��Ժ       ����ʱ�䣺2016��05��01��</span><span \"line-height:1.5;\">��վѶ 4��28�����磬��Զ�������Ľ�����ɽУ��ͼ��ݵڶ������ҿ��������������й�����ѧԺ�����о����о�Ա�������ܿ����о������������ڣ�Ϊ����ʦ��������Ϊ������ѧ�ӽ��µġ��й�������ʷ�����ݽ�����������һ������ѧ�ҵ��ӽǣ�������������й������ĵ����뷢չ����һ�������˵��黳������˺��ԡ��й����������������У�����֡�</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t<span \"line-height:1.5;\"><br>\n" +
		            "</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    �����ڴӡ������й���Ѱ������֮�á����⣬���������˼�֡���������»�Ȫ�����ֶ����Ҷ�������ԭ�򣬼��Կ�ѧ���Ժ�������֪׷��ʷʵ��ԭ�����Ծ���ͼ�������������ʶ����������ͬ��������ָ���������й�����ʷ���ڲ�ͬ�Ľ����������Ӧ�����Լ���Զ�������ݲ���дʷ����Ԫ˼ά�Ĳ���Ҳ������һ�������\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t<br>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    ̸�����й������������������Կ���ѧΪ��λ���������Ĺ۵㡣���ݶ���Ŀ����о�����������Ϊ�����ڡ��й�����ָ���ǹ�����Ȩ���ң�����ͷ�Ļ���������ġ��й�������˵��������й����������ڹ�Ԫǰȫ������ʷ��ʱ�տ���У��Ϳ��Կ�������ͷ�Ļ�֮ǰ�������Ļ�����ɽ�Ļ�ʱ�ڣ������Ϸ�ɢ������ŷ�Ǵ�½����ͭ�Ļ���������ԭ���𣬡������Ƕ����ķ�ɢ�Ļ���չ�ɡ��������¡��Ķ���ͷ���أ�����ͷ�Ļ��ʹ����ɶ�Ԫ��һ��Ľڵ��ϡ���Ϊ����ʵ��ġ��й���������ֻ�����ݵ�����ͷ����˶���ͷ�Ļ�Ӧ������ġ��й�����<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    ����ͷ�Ļ������ں���������أ���Ϊ����ͷ���Ŷӵ����ζӳ���������˵�����ͷ��ַ������ش����������䡣�й�����ĳ��иɵ��������ǡ������߲��ֵĹ����Ⱥ���������ͭ����������������ʯ����������ͭ����Ⱥ�ȵȣ������й���ʷ���������Ǵ�½��δ���ֹ����ż����������ͷ�����Ķ����������ܳ�Ϊ�й�֮����ݿ����о����֣�����ͷʽ�ľ�����谵�һ����ɢ�������Ա������������εȵ���������Щ��ͭ���������������ǻ��ľ��ȣ����й��Ŵ�������������һ����Ӱ�죬��Щ������Ϊ�����й���������Ļ�����Ҫ���š�����ͷ�Ļ�����Ҫ���ɴ˿ɼ�һ�ߡ�\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    ���������й����γɣ���������Ϊ���ڼȲ��ǵ������������ģ�Ҳ����ȫ�������ġ���ȫ��ʷ�ĽǶȿ��й���ʷ�������й����Ƿ�յģ����������˴��������Ļ�����ȫ����ͭ�Ļ�Ϊ�����������Ȼͭ�����������������ͭ���ֱ���������ڵ������˺������䣬�Ŵ��й���ͭ���п�������������ͭ�Ļ�Ӱ������ֵġ������ͬʱǿ�������ڶ���ͷ�Ļ������ʽ綨���ԡ��й����������о����ڻ��������ۡ�����ֻ���ַ���Ķ������������Ͽ���ѧ�ҵľ��飬��Ҳʹ�ÿ�����������������в��ɼ����ԣ�û�д������ȷ֮�֡����ڣ����ŷ�������������Ȼû���ҵ�������Դ��û�к�����ͣ��д���һ��̽����\n" +
		            "</p>\n" +
		            "<p>\n"+
		            "\t��        ���������Զ��ԺԺ��Ǯ�������������ʴ𻷽ڣ���������ֳ�ʦ�������������ʹ�ҵ�����һһ���\n"+
		            "</p>\n" +
		            "<p>\n"+
		            "\t    Ϊ������ɽУ��ʦ��������Զ��������Զ��Ժ�״�����ɽУ��ʤ��¥��������������Ƶ�ֻ᳡������ͬ����������50���������ڼ����о��������Ȥ����ɽУ��ʦ�������ֻ᳡������������ڵľ��ʱ��档\n"+
		            "</p>\n"+
		            "<p>\n"+
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
		            "\t\t\t\t<div class=\"bshare-custom\">\n");
			List<String> url_list = new ArrayList<String>();
			if(i%4 == 1){
			//	String url1 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066094_400_640.jpg";
			//	String url2 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066096_400_640.jpg";
			//	String url3 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066099_400_640.jpg";
			//	news.setPicOne(url1);
			//	news.setPicTwo(url2);
			//	news.setPicThr(url3);
				news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/28/75971.html");
			//	url_list.add(url1);
			//	url_list.add(url2);
			//	url_list.add(url3);
			}else if (i%4==2){
				news.setTitle("����������ѧУ����־�����й������ѧ�������봴�½���ר�ⱨ��");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>����������ѧУ����־�����й������ѧ�������봴�½���ר�ⱨ��</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">������</span><span \"line-height:1.5;\">��ΰ ��Դ����վԭ�� ����ʱ�䣺2016��04��30��</span><span \"line-height:1.5;\">��վѶ 2016��4��29�գ��й������ѧ��ͼ��ݵ�һ�����Ҿ��е�ί�����飨���󣩵�41��ר��ѧϰ����������������ѧУ����־���������봴�½���ר�ⱨ�档У�����쵼�ϴ������ž�����ΡȻ���������������¬��־�������ϯ����ᡣ</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ��־���֪ʶ����������˼ά��ʽ�ص㡢�����۵ĽǶȡ����ý�ѧ�ĸ���ĸ�����̸���Լ��Դ��ºʹ��½�������ʶ��\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ��־��˵��֪ʶ��Ϊ����֪ʶ������֪ʶ������֪ʶ�ǻ��ھ����ֱ���Լ��˵����Ե�֪ʶ�����˵�֪ʶ�����У�����֪ʶռ90%������֪ʶֻռ10%����־���ʾ������Ϊ����֪ʶ�����ԣ�����Ϊ����֪ʶ���ڻ����������˲����������У�Ҫ�ر�ע������֪ʶ�����������ֽ����ʵ������������˼ά���߼�˼ά���ص㣬����ʾ����ѧ˼άʼ�չᴩ�ڿ�ѧ�о���ȫ���̣�û��˼ά�Ĵ��£��Ͳ������пƼ��Ľ�������־���ڴӷ����۵ĽǶ�̸����ʱ�����������ӱ������ܽἯ���˴��̵�ı�ԡ����ɺ���·������ѧ�ش�����Ƽ�����Ҳ�̺��ŷḻ��ı�ԡ���������·�������·�������˵����ѧ˼ά����ѧ�����Ϳ�ѧ���ߣ������о���ȷ�����⡢��ȷ���о��������Ч�ؽ�����⡣<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ��־�彫���α������ص���ڴӿ��ý�ѧ�ĸ�̸�����봴�½�����һ���档����ʾ����ѧ���ò�ͬ����ѧ�ķ�տ��ã����ǿ��ŵĿ��ã�������ʱ���ϴӿ�����������죻�ռ��ϴӽ�����ͼ��ݺ�ʵ������չ�������ϴӽ̲���ο��������䡣��־��˵����ͳ�Ľ�ѧ��������ʦ��֪ʶ�ͼ��ܴ��ڸ�ѧ����������������������ܵ��γ̡����úͽ̲ĵ����ص���Լ��ʹ�ý�ѧ������ѧ����ѧϰ�����������Ľ�ѧӦ���ǽ�ѧ����ѧ����ѧ��ѧ�ᣬ��ѧ�����Լ�ѧ����˼��ѧ��������ѧ����ˣ���־��������ܹ�����ѧ���Լ�ѧϰ�Ľ�ѧ������Ч�Ľ�ѧ����ſ��ã�����߼��Ŀ���������\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ��ί��Ǿϴ����Ա��α���������ܽᡣ��˵����ѧ���������˲�Ϊ��Ҫ������������ѧ���ܹ�����ѧϰ��ѧϰ������ÿһλ��ʦ��Ӧ��˼�������⡣��˵����ѧ����Ҫ��ѧ��Ϊ���壬����Ҫѧ��Χ����ʦת����Ҫ��ʦΧ��ѧ��ת���Ӷ����õ�Ϊ�����������²ż汸���˲š�\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    ��У����ΡȻ���ֱ���ᡣ��ί�������Ա�����񴦡�ѧ��������ί��ѧ����ҵ��ҵָ����������ġ��о���Ժ����ز��������ˣ��Լ���Ժ��ϵ����ί����ǡ��ֹܽ�ѧ������Ժ���������Σ��μ�ר��ѧϰ��\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
		//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
		//		news.setPicOne(url);
		//		url_list.add(url);
			}else if(i%4==3){
				news.setTitle("�й������ѧ������ְ������������λ����ٿ� ");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>�й������ѧ������ְ������������λ����ٿ�</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">����</span><span \"line-height:1.5;\">����� ��Դ����վԭ�� ����ʱ�䣺2016��04��28�� </span><span \"line-height:1.5;\">��վѶ �й������ѧ������ְ������������λ�����2016��4��27���ٿ��������ȡ��������У���������桢ѧУ���������棬����ͨ���ˡ��й������ѧ��ְ��������ʵʩ�취���޶��ݰ���������ͨ���˴����顣</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    �����Ϊ��У����������ȫ���ܽ���ѧУ2015����������ȡ�õ�ͻ���ɼ����������ۺϸĸＰ��ʮ���塱��ҵ�滮����ȷѧУ2016����ص㹤��������ʵ�����ǣ�˼·������������ȷ���ص�ͻ�������ڽ�һ��ͳһ˼�룬�����ʶ���������ģ��ƶ�ѧУ��ҵ�ֺ��ֿ췢չ��������Ҫ���á�ѧУ2015�������ǿ��������Դ��������������״�����ã���Ч�ر�����ѧУ��ҵ�ķ�չ��2016�����Ԥ�㰲�ź������ͬ�⡶����2015���Ԥ��ִ�м�2016���Ԥ�㰲�ŵı��桷�����й������ѧ��ְ��������ʵʩ�취���޶��ݰ����������ϼ��йع涨��Ҫ�󣬷���ѧУʵ�ʣ�������������ְ����ȷ��ʹ����Ȩ��������ѧУ��������������ල�������ڲ�����ṹ���ٽ�ѧУ�ĸ﷢չ����ʮ����Ҫ�����á�\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ѧУ��ί��Ǿϴ����ڽ�����ָ�����̴����ǹ����й���ɫ�ִ���ѧ�ƶȵ���Ҫ���ݣ���ѧУ��������Ļ�����ʽ�ͻ����ƶȣ��ǽ�ְ����ʹ��������Ȩ������Ҫ�������μӻ���ĸ�λ�����Ը߶ȵ������ĺ�ʹ���У���������ְ�𣬻��������ײߣ�����˺ܶ�õ�����ͽ��飬��ֱ��ֳ������ְ���Ȱ�ѧУ������ѧУ���������黳�����ֳ���ѧУ�ӿ�ĸ�ͷ�չ���������κͼᶨ���ġ�<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t \n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    �ϴ����ͽ�һ����ǿ�̴��Ὠ�衢���õط��ӽ̴�������̸�����������һ�������ʶ��������̴������Ҫ���á��̴�����Ϊ��У������֯�ṹ֮һ���Ƿ��ӹ���ְ�����������õ���Ҫƽ̨����ά����ְ���Ϸ�Ȩ�����Ҫƽ̨����ѧУʵ��������ѧ����Ҫƽ̨����ˣ�ȫУ����Ҫվ��ȫ�ָ߶Ⱥ�������У�ĽǶȣ���Խ̴�����Ҫ�Ե���ʶ����⡣���Ǽ�ǿ���裬��ַ��ӽ̴������Ҫְ�ܡ�Ҫ��ʵ��ǿ�Խ̴�����쵼��Ҫͨ��ץ���ƶȽ��衢������齨�衢�����̴��Ὠ�裬����ʵ��ǿ�̴��������裻Ҫ��ǿ�����о���ע��Դͷ���룬����ʵ�Ľ�����������Ҫ��ʵ���ӹ������ã��ý�ְ������ȫ���ְ��������̵ظ��ܵ����κ����Σ�Ϊ������Ϊ�ȶ���г��У԰����������\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    ��У����ΡȻ������ĸ�ı��չ�����ľ������Ѽ����������棬У�ܻ��ʦ��������ѧУ2015���Ԥ��ִ�м�2016���Ԥ�㰲�ŵı��棬У������ϯ���������й������ѧ��ְ��������ʵʩ�취���޶�˵����\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
		//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
		//		news.setPicOne(url);
		//		url_list.add(url);
			}else{
				news.setTitle("�й������ѧ2015���＾ѧ�ڿγ̽�ѧ�����ܽ���û����");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>�й������ѧ2015���＾ѧ�ڿγ̽�ѧ�����ܽ���û����</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\"> ����</span><span \"line-height:1.5;\">�����緼 ��Դ���ߵȽ����о����������� ����ʱ�䣺2016��04��27�� </span><span \"line-height:1.5;\">����վѶ 4��26�����磬�й������ѧ2015���＾ѧ�ڿγ̽�ѧ�����ܽ���û�����ɽУ��ͼ��ݵ�һ�����Ҿ��С���У����ΡȻ��ϯ���飬��Ϊ�񽱽�ʦ�䷢����֤�顣</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ѧУ��ѧ����ר�ҳ���ίԱ���������¹��������ְ佱��ʽ����������2015���＾ѧ�ڿγ̽�ѧ���������27λ������ʦ�У����ġ���褡���ѩӭ����������ӱ����̫���6λ��ʦ����Ϊ����ȼ�������19λ��ʦ����Ϊ���õȼ���2λ��ʦ����Ϊ�ϸ�ȼ���\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ��ΡȻ�ڽ����ж�ȫ�������ʦ���������������һ��ϣ������������ʦͨ�����ܿγ��������𽥳ɳ�Ϊ��ѧ���ֺ�ר�ҡ�����һЩ�Ѿ��������ȼ��������γ̣�����Ҫ���ô���������ô��ʴ��У�����Щ�����Ľ�ѧ��ͳ������н���ഫ���������ϵ��������ƽ�ѧ������ˮƽ������ϣ���ڿγ̽�ѧ�У�ʵ�֡��桱�롰������ͳһ����������ʦ����֯���ý�ѧ�Ĺ����У���Ҫǿ�������桱��̽������׷����֪��ҲҪ���ڷ���ѧ��֪ʶ�С�������Ԫ�أ�����ѧ�������һ����ѧ�ľ��磻����ϣ�������ʦ�ڽ�ѧ�����У�ʼ����������עѧ���������ذ�ѧ������������ѧ��������עѧ���ĳɳ��ɲţ���עѧ������б仯����עѧ����ѧҵ�ɾ͸У�����������ѧ���ĳɳ�Ϊ������ѧ����ѧϰ��ЧΪ������ʵ��߿��ý�ѧЧ����<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ����ר�Ҵ���ҽҩѧԺ��Ժ�����޽���������Ϊ���γ�����������������ѧ��Ϊ���ĵĽ�ѧʵ��������ּ���ԡ�������ʦ�ԡ�����д����ѧ�����¡��͡�΢����ѧ�����ſγ̵Ľ�ѧʵ��Ϊ�������ӿγ���ơ���ѧ��֯����ѧ���ۡ���ѧ��������������������ȷ��棬���ҷ�������ȥ������ڼ丰����UCLA��ϰ��ѵ���ڿγ̽�ѧ�������Ľ�ѧ�ĸ��̽����\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ���ġ���褡���ѩӭ����������ӱ����̫���6λ��ʦ�������ҷ����������ѧ�ľ�������ᡣѧ������Ҳ�ͱ��ƽ�ѧ������Լ�������뽨�顣\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    ���´������񴦡��߽��о����������ġ���ѧ֧�����ġ�ѧϰ֧�������йظ����˾��й�������ʦ����������˻���������ѧУ��ѧ����ר�ҳ���ίԱ�����Ρ������Σ�2015���＾ѧ�ڡ�2016�괺��ѧ��ȫ�������ʦ������ѧ������μ��˻��顣\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");

			}
			news.setPicList(url_list);
			//news.setPublishTime(Long.valueOf(i));
			news.setReadStatus(false);
			news.setSource("");
			news.setSummary("��վѶ 4��26�գ������ί������Ա��������������ٿ�ȫ����ѧ����������������Ƶ�ᡣ�����ί������Ա��������Ĳ��������������������ޥ���ϯ���鲢����ع������в����й������ѧ�����ֻ᳡�����񴦡�ѧ��������װ����ѧ����ҵ��ҵָ����������ġ���Ժ��ϵ�������ˣ�����ί��У��ί���йص�λ�μ��˷ֻ᳡���顣");
			news.setMark(i);
			if(i == 4){
				news.setTitle("2016��ȫ����ѧ����������������Ƶ�����ٿ�");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>2016��ȫ����ѧ����������������Ƶ�����ٿ�</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">���� </span><span \"line-height:1.5;\">������ ��Դ����վԭ�� ����ʱ�䣺2016��04��27�� </span><span \"line-height:1.5;\">��վѶ 4��26�գ������ί������Ա��������������ٿ�ȫ����ѧ����������������Ƶ�ᡣ�����ί������Ա��������Ĳ��������������������ޥ���ϯ���鲢����ع������в����й������ѧ�����ֻ᳡�����񴦡�ѧ��������װ����ѧ����ҵ��ҵָ����������ġ���Ժ��ϵ�������ˣ�����ί��У��ί���йص�λ�μ��˷ֻ᳡���顣</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ����ָ����ǿ������ǿ����ǿ������ǿ�����ҹ���2000������У��ÿ���д�ѧ��ҵ��700�����ˣ���У��3000�����ˣ����Ǿ������ʱ�Ա��ս�Դ������ء�����Ҫ������Ӧ���������·�չ�;��ӽ���������ȫ���߿����й������Ϊ�����������ʱ�Ա��·�ӡ�\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ����ǿ��������Ҫ�Ѵ�ѧ������������Ϊǿ���˾��Ļ������̡��ƶ������ں���ȷ�չ����Ҫ���ݡ������²ż汸�����˲ŵ�ʵ�ʾٴ룬��ִ������������Ӿ������ƣ��γ�ǿ���������ʵ�Ѵ�ѧ����������ץ��ץ�ã�ץ����Ч��<span \"line-height:1.5;\">������繫˾������Ա���������ĸ��ּ�������һһ���˽��</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t \n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    ����Ҫ��ʡ���������������칫��Ҫ��ͬ���������ƶ���У�����ƻ�����ȷϽ���ڸ�У���������ڸ�У����������������վ��ȷ����У����������������Ա�����ѡ����ء��ĵ�λ����Ҫ��һ���淶��У�����������̣�ȷ����ѧ�����ȱ���Ӧ����������������������������������ȷ���ȥ��Ϊ��������һ���������͸�������ʱ�Ա���ƽ���ѧ����������������̨�ס�\n" +
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
				news.setLocal("");
				news.setIsLarge(true);
		//		String url = "http://imgt2.bdstatic.com/it/u=3269155243,2604389213&fm=21&gp=0.jpg";
				news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/25/75920.html");
		//		news.setPicOne(url);
		//		url_list.clear();
		//		url_list.add(url);
			}else{
				news.setIsLarge(false);
			}
			if(i == 2){
				news.setComment("");
			}
			
			if(i <= 2){
				news.setPublishTime(Long.valueOf(DateTools.getTime()));
			}else if(i >2 && i <= 5){
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400);
			}else{
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400 * 2);
			}
			newsList.add(news);
		}
	}

	if(columnselectindex==2){

			for(int i =0 ; i < 10 ; i++){
				NewsEntity news = new NewsEntity();
				news.setId(i);
				news.setNewsId(i);
				news.setCollectStatus(false);
				news.setCommentNum(i + 10);
				news.setInterestedStatus(true);
				news.setLikeStatus(true);
				news.setReadStatus(false);
				news.setNewsCategory("�Ƽ�");
				news.setNewsCategoryId(1);
				news.setSource_url("http://www.ouc.edu.cn/jwc/bf/8c/c6517a49036/page.psp");
				news.setTitle("������֯2016�괺��ѧ�ڱ��ƿγ���ĩ���Ե�֪ͨ");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>������֯2016�괺��ѧ�ڱ��ƿγ���ĩ���Ե�֪ͨ</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
				List<String> url_list = new ArrayList<String>();
				if(i%4 == 1){
				//	String url1 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066094_400_640.jpg";
				//	String url2 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066096_400_640.jpg";
				//	String url3 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066099_400_640.jpg";
				//	news.setPicOne(url1);
				//	news.setPicTwo(url2);
				//	news.setPicThr(url3);
					news.setSource_url("http://www.ouc.edu.cn/jwc/bf/5a/c6517a48986/page.psp");
				//	url_list.add(url1);
				//	url_list.add(url2);
				//	url_list.add(url3);
				}else if (i%4==2){
					news.setTitle("���ھٰ�2016���й������ѧ��ѧ��ģ������2016�ꡰ���ڱ�����ѧ��ģ��ս��У��ѡ������֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>���ھٰ�2016���й������ѧ��ѧ��ģ������2016�ꡰ���ڱ�����ѧ��ģ��ս��У��ѡ������֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else if(i%4==3){
					news.setTitle("�����й������ѧ��Ӣ����Ӣ������ѧ������2+2����������Ŀ˵�����֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>�����й������ѧ��Ӣ����Ӣ������ѧ������2+2����������Ŀ˵�����֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else{
					news.setTitle("���ھٰ��й������ѧ�����칤����ͼ������֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>���ھٰ��й������ѧ�����칤����ͼ������֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");

				}
				news.setPicList(url_list);
				//news.setPublishTime(Long.valueOf(i));
				news.setReadStatus(false);
				news.setSource("");
				news.setSummary("��վѶ 4��26�գ������ί������Ա��������������ٿ�ȫ����ѧ����������������Ƶ�ᡣ�����ί������Ա��������Ĳ��������������������ޥ���ϯ���鲢����ع������в����й������ѧ�����ֻ᳡�����񴦡�ѧ��������װ����ѧ����ҵ��ҵָ����������ġ���Ժ��ϵ�������ˣ�����ί��У��ί���йص�λ�μ��˷ֻ᳡���顣");
				news.setMark(i);
				if(i == 4){
					news.setTitle("�����걨�й������ѧ��ʮһ�������ѧ�ɹ�����֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>�����걨�й������ѧ��ʮһ�������ѧ�ɹ�����֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
					news.setLocal("");
					news.setIsLarge(true);
			//		String url = "http://imgt2.bdstatic.com/it/u=3269155243,2604389213&fm=21&gp=0.jpg";
					news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/25/75920.html");
			//		news.setPicOne(url);
					url_list.clear();
			//		url_list.add(url);
				}else{
					news.setIsLarge(false);
				}
				if(i == 2){
					news.setComment("");
				}
				if(i <= 2){
					news.setPublishTime(Long.valueOf(DateTools.getTime()));
				}else if(i >2 && i <= 5){
					news.setPublishTime(Long.valueOf(DateTools.getTime()) -86400);
				}else{
					news.setPublishTime(Long.valueOf(DateTools.getTime()) -86400*2);
				}
				newsList.add(news);
			}
	}
		
	if(columnselectindex==3){
			for(int i =0 ; i < 10 ; i++){
				NewsEntity news = new NewsEntity();
				news.setId(i);
				news.setNewsId(i);
				news.setCollectStatus(false);
				news.setCommentNum(0);
				news.setInterestedStatus(true);
				news.setLikeStatus(true);
				news.setReadStatus(false);
				news.setNewsCategory("�Ƽ�");
				news.setNewsCategoryId(1);
				news.setSource_url("http://www.baidu.com");
				news.setTitle("���ڶ��ڱ��ʹ�ҵ��Ŀ����Ϣ��֪ͨ");
				news.setData("<div id=\"innerPadding\">\n" +
            "                \n" +
            "\t\t\t\t<div class=\"artTitle\">\n" +
            "\t\t\t\t\t<h2>���ڶ��ڱ��ʹ�ҵ��Ŀ����Ϣ��֪ͨ</h2>\n" +
            "\t\t\t\t\t<span>   \n" +
            "\t\t\t\t\t </span>\n" +
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
            "\t\t\t\t<div class=\"bshare-custom\">\n" );
				List<String> url_list = new ArrayList<String>();
				if(i%4 == 1){
				//	String url1 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066094_400_640.jpg";
				//	String url2 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066096_400_640.jpg";
				//	String url3 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066099_400_640.jpg";
				//	news.setPicOne(url1);
				//	news.setPicTwo(url2);
				//	news.setPicThr(url3);
					news.setSource_url("http://www.ouc.edu.cn/jwc/bf/5a/c6517a48986/page.psp");
				//	url_list.add(url1);
				//	url_list.add(url2);
				//	url_list.add(url3);
				}else if (i%4==2){
					news.setTitle("������ѡ��Ŀ��פO-Labѧ�����´�ҵʵ���ҵ�֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>������ѡ��Ŀ��פO-Labѧ�����´�ҵʵ���ҵ�֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else if(i%4==3){
					news.setTitle("���ڿ�չ2016���ѧ�����ڡ������硱���ʵ�� ���֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>���ڿ�չ2016���ѧ�����ڡ������硱���ʵ�� ���֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else{
					news.setTitle("������ѡ�ڶ����й������ѧ ���𻨽�ѧ�𡱵�֪ͨ");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>������ѡ�ڶ����й������ѧ ���𻨽�ѧ�𡱵�֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");

				}
				news.setPicList(url_list);
				//news.setPublishTime(Long.valueOf(i));
				news.setReadStatus(false);
				news.setSource("");
				news.setSummary("��վѶ 4��26�գ������ί������Ա��������������ٿ�ȫ����ѧ����������������Ƶ�ᡣ�����ί������Ա��������Ĳ��������������������ޥ���ϯ���鲢����ع������в����й������ѧ�����ֻ᳡�����񴦡�ѧ��������װ����ѧ����ҵ��ҵָ����������ġ���Ժ��ϵ�������ˣ�����ί��У��ί���йص�λ�μ��˷ֻ᳡���顣");
				news.setMark(i);
				if(i == 4){
					news.setTitle("��������վ��ҵ����ָ��");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>������ѡ�ڶ����й������ѧ ���𻨽�ѧ�𡱵�֪ͨ</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
					news.setLocal("");
					news.setIsLarge(true);
			//		String url = "http://imgt2.bdstatic.com/it/u=3269155243,2604389213&fm=21&gp=0.jpg";
					news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/25/75920.html");
			//		news.setPicOne(url);
					url_list.clear();
			//		url_list.add(url);
				}else{
					news.setIsLarge(false);
				}
				if(i == 2){
					news.setComment("");
				}
				if(i <= 2){
					news.setPublishTime(Long.valueOf(DateTools.getTime()));
				}else if(i >2 && i <= 5){
					news.setPublishTime(Long.valueOf(DateTools.getTime()) -86400);
				}else{
					news.setPublishTime(Long.valueOf(DateTools.getTime()) -86400*2);
				}
				newsList.add(news);
			
			}
			
	}
			
			
/*		
		for(int i =0 ; i < 10 ; i++){
			NewsEntity news = new NewsEntity();
			news.setId(i);
			news.setNewsId(i);
			news.setCollectStatus(false);
			news.setCommentNum(i + 10);
			news.setInterestedStatus(true);
			news.setLikeStatus(true);
			news.setReadStatus(false);
			news.setNewsCategory("�Ƽ�");
			news.setNewsCategoryId(1);
			news.setSource_url("http://news.sina.com.cn/c/2014-05-05/134230063386.shtml");
			news.setTitle("�����ùȸ��۾�����10�����£�����������Ϸ");
			List<String> url_list = new ArrayList<String>();
			if(i%2 == 1){
				String url1 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066094_400_640.jpg";
				String url2 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066096_400_640.jpg";
				String url3 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066099_400_640.jpg";
				news.setPicOne(url1);
				news.setPicTwo(url2);
				news.setPicThr(url3);
				news.setSource_url("http://tech.sina.com.cn/zl/post/detail/i/2013-11-06/pid_8436571.htm?from=groupmessage&isappinstalled=0");
				url_list.add(url1);
				url_list.add(url2);
				url_list.add(url3);
			}else{
				news.setTitle("AA�ó�:���ܶ����⳵ƽ̨");
				String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
				news.setPicOne(url);
				url_list.add(url);
			}
			news.setPicList(url_list);
			news.setPublishTime(Long.valueOf(i));
			news.setReadStatus(false);
			news.setSource("�ֻ���Ѷ��");
			news.setSummary("��Ѷ����Ѷ�����룺Gin���ȸ��۾�������Ŀǰ���Ŀɴ��������豸������Դ�����ȥ�κεط���ֻҪ���ɷ����������û��������ŭ������Ϊ�ֻ��ĵڶ��顰��ǿ��ʵ��ʾ������ʹ�á����⣬��Ȼ����δ��ʽ���ۣ����ȸ�����������г������˽���һ��Ŀ��Ź������۸���Ϊ1500��Ԫ��Լ�������9330Ԫ������Ȼ��ʮ�ְ��󣬵����ٿ�������һЩ�����ߵ�����ҲԤʾ�Źȸ��۾��Ĺ������ģ����������Խ��Խ���ˡ�");
			news.setMark(i);
			if(i == 4){
				news.setTitle("����ս��ǿ�ƻع�");
				news.setLocal("�ƹ�");
				news.setIsLarge(true);
				String url = "http://imgt2.bdstatic.com/it/u=3269155243,2604389213&fm=21&gp=0.jpg";
				news.setSource_url("http://games.sina.com.cn/zl/duanpian/2014-05-21/141297.shtml");
				news.setPicOne(url);
				url_list.clear();
				url_list.add(url);
			}else{
				news.setIsLarge(false);
			}
			if(i == 2){
				news.setComment("���۲��֣�˵�ķǳ��á�");
			}
			
			if(i <= 2){
				news.setPublishTime(Long.valueOf(DateTools.getTime()));
			}else if(i >2 && i <= 5){
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400);
			}else{
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400 * 2);
			}
			newsList.add(news);
		}*/
	
		return newsList;
	}
	
	/** mark=0 ���Ƽ� */
	public final static int mark_recom = 0;
	/** mark=1 ������ */
	public final static int mark_hot = 1;
	/** mark=2 ���׷� */
	public final static int mark_frist = 2;
	/** mark=3 ������ */
	public final static int mark_exclusive = 3;
	/** mark=4 ���ղ� */
	public final static int mark_favor = 4;
	
	/*
	 * ��ȡ�����б�
	 */
	public static ArrayList<CityEntity> getCityList(){
		ArrayList<CityEntity> cityList =new ArrayList<CityEntity>();
		
		CityEntity city1 = new CityEntity(1,"����ѧԺ", 'G');
		CityEntity city2 = new CityEntity(2, "��������ѧԺ", 'H');
		CityEntity city3 = new CityEntity(3, "�����ѧѧԺ", 'H');
		CityEntity city4 = new CityEntity(4, "���󻷾�ѧԺ", 'H');
		CityEntity city5 = new CityEntity(5, "��������ѧѧԺ", 'H');
		CityEntity city6 = new CityEntity(6, "����ϵ", 'J');
		CityEntity city7 = new CityEntity(7,"�������ص�ʵ����", 'J' );
		CityEntity city8 = new CityEntity(8, "ʳƷ��ѧ�빤��ѧԺ", 'S');
		CityEntity city9 = new CityEntity(9,  "ˮ��ѧԺ", 'S');
		CityEntity city10 = new CityEntity(10,  "�����ѧԺ", 'W');
		CityEntity city11 = new CityEntity(11, "��Ϣ��ѧ�빤��ѧԺ", 'X');
		CityEntity city12 = new CityEntity(12,"ҽҩѧԺ", 'Y');
		CityEntity city13 = new CityEntity(13, "����ϵ", 'Y');
		
		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);
		cityList.add(city5);
		cityList.add(city6);
		cityList.add(city7);
		cityList.add(city8);
		cityList.add(city9);
		cityList.add(city10);
		cityList.add(city11);
		cityList.add(city12);
		cityList.add(city13);
		return cityList;
	}
	/* Ƶ�������� �纼�� ��Ӧ����ĿID */
	public final static int CHANNEL_CITY = 3;
}
