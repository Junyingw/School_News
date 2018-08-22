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
	 * 获取新闻列表
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
			news.setNewsCategory("推荐");
			news.setNewsCategoryId(1);
			news.setSource_url("http://xinwen.ouc.edu.cn/Article/Class3/xwlb/2016/04/28/75985.html");
			news.setTitle("行远讲座第四讲：许宏讲述考古学视角下的“中国”诞生史");
			news.setData("<div id=\"innerPadding\">\n" +
		            "                \n" +
		            "\t\t\t\t<div class=\"artTitle\">\n" +
		            "\t\t\t\t\t<h2>行远讲座第四讲：许宏讲述考古学视角下的“中国”诞生史</h2>\n" +
		            "\t\t\t\t\t<span>   \n" +
		            "\t\t\t\t\t </span>\n" +
		            "\t\t\t\t</div>\n" +
		            "\n" +
		            "\t\t\t\t<div class=\"artContent\">\n" +
		            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
		            "\t<span \"line-height:1.5;\">（作者</span><span \"line-height:1.5;\">赵琪。来源：行远书院       发布时间：2016年05月01日</span><span \"line-height:1.5;\">本站讯 4月28日下午，行远讲座第四讲在崂山校区图书馆第二会议室开讲。讲座邀请中国社会科学院考古研究所研究员、夏商周考古研究室主任许宏教授，为海大师生带来题为“考古学视角下的‘中国’诞生史”的演讲。许宏教授以一个考古学家的视角，带大家审视了中国文明的诞生与发展；用一个考古人的情怀，解答了何以“中国”。讲座由李华军副校长主持。</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t<span \"line-height:1.5;\"><br>\n" +
		            "</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    许宏教授从“百年中国：寻根问祖之旅”入题，讲述考古人坚持“上穷碧落下黄泉，动手动脚找东西”的原则，既以科学理性和文明认知追求史实复原，又以救亡图存和民族主义意识建构国族认同。许宏教授指出，对于中国诞生史存在不同的解读，考古人应该以自己相对独立的身份参与写史，多元思维的并存也是社会的一大进步。\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t<br>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    谈到“中国”的由来，许宏教授以考古学为本位讲述了他的观点。根据多年的考古研究，许宏教授认为，早期“中国”即指东亚广域王权国家，二里头文化就是最早的“中国”。他说，如果将中国古文明置于公元前全球文明史的时空框架中，就可以看出二里头文化之前的仰韶文化、龙山文化时期，文明较分散；而后欧亚大陆的青铜文化东渐，中原崛起，“满天星斗”的分散文化发展成“众星捧月”的二里头都邑，二里头文化就处在由多元到一体的节点上。作为政治实体的“中国”，最早只能上溯到二里头，因此二里头文化应是最早的“中国”。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    二里头文化出现在河南洛阳盆地，作为二里头考古队第三任队长，许宏教授说起二里头遗址的诸多重大发现如数家珍。中国最早的城市干道网、宫城、中轴线布局的宫殿建筑群、最早的青铜器铸造作坊、绿松石器作坊、青铜礼器群等等，皆是中国历史上乃至东亚大陆从未出现过的遗迹遗物。“二里头出土的东西，都可能成为中国之最。”据考古研究发现，二里头式的酒礼、牙璋等一度扩散至长城以北、长江中下游等地区，而这些青铜礼器、酒器、礼仪化的爵等，对中国古代王朝都产生了一定的影响，有些甚至成为后世中国社会政治文化的重要符号。二里头文化的重要性由此可见一斑。\n" +
		            "</p>\n" +
		            "<p>\n" +
		            "\t    对于早期中国的形成，许宏教授认为早期既不是单纯土生土长的，也不完全是外来的。从全球史的角度看中国历史，早期中国不是封闭的，而是吸收了大量外来文化。以全球青铜文化为例，最早的天然铜打制器和最早的铸造铜器分别出现在现在的伊拉克和土耳其，古代中国青铜器有可能是受西方青铜文化影响而出现的。许教授同时强调，对于二里头文化的性质界定、对“中国”由来的研究现在还存在争论。考古只呈现发掘的东西，解读则会结合考古学家的经验，这也使得考古领域的许多问题具有不可检验性，没有错误和正确之分。现在，考古发掘的许多现象仍然没有找到本土来源，没有合理解释，有待进一步探索。\n" +
		            "</p>\n" +
		            "<p>\n"+
		            "\t　        讲座最后，行远书院院长钱致榕先生主持问答环节，许教授与现场师生交流互动，就大家的提问一一解答。\n"+
		            "</p>\n" +
		            "<p>\n"+
		            "\t    为方便鱼山校区师生聆听行远讲座，行远书院首次在鱼山校区胜利楼报告厅增设了视频分会场，进行同步讲座。近50名对许宏教授及其研究领域感兴趣的鱼山校区师生来到分会场，聆听了许教授的精彩报告。\n"+
		            "</p>\n"+
		            "<p>\n"+
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
				news.setTitle("沈阳化工大学校长李志义来中国海洋大学作创新与创新教育专题报告");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>沈阳化工大学校长李志义来中国海洋大学作创新与创新教育专题报告</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">（记者</span><span \"line-height:1.5;\">左伟 来源：本站原创 发布时间：2016年04月30日</span><span \"line-height:1.5;\">本站讯 2016年4月29日，中国海洋大学在图书馆第一会议室举行党委中心组（扩大）第41次专题学习，邀请沈阳化工大学校长李志义作创新与创新教育专题报告。校党政领导鞠传进、张静、李巍然、李华军、王剑敏、卢光志、陈锐出席报告会。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    李志义从知识本质特征、思维方式特点、方法论的角度、课堂教学改革等四个方面谈了自己对创新和创新教育的认识。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    李志义说，知识分为显性知识和隐形知识。隐性知识是基于经验和直觉以及人的悟性的知识，在人的知识构成中，隐性知识占90%，显性知识只占10%。李志义表示，能力为隐性知识的外显，素质为隐性知识的内化，所以在人才培养过程中，要特别注重隐性知识的培养。他又结合着实例讲述了形象思维和逻辑思维的特点，并表示，科学思维始终贯穿于科学研究的全过程；没有思维的创新，就不可能有科技的进步。李志义在从方法论的角度谈创新时讲到，《孙子兵法》总结集成了打仗的谋略、技巧和套路，而科学重大发现与科技进步也蕴涵着丰富的谋略、技巧与套路，即创新方法。他说，科学思维、科学方法和科学工具，可以研究正确的问题、正确地研究问题和有效地解决问题。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    李志义将本次报告会的重点放在从课堂教学改革谈创新与创新教育这一方面。他表示，大学课堂不同于中学的封闭课堂，而是开放的课堂，表现在时间上从课内向课外延伸；空间上从教室向图书馆和实验室拓展；内容上从教材向参考资料扩充。李志义说，传统的教学观念是老师将知识和技能传授给学生，但在这个过程中由于受到课程、课堂和教材等因素的制约，使得教学抑制了学生的学习动力。真正的教学应该是教学生乐学、会学、学会，让学生会自己学、会思中学、会做中学。因此，李志义提出，能够调动学生自己学习的教学才是有效的教学。解放课堂，向更高级的课堂迈进。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    党委书记鞠传进对本次报告会做了总结。他说，大学是以培养人才为首要任务，怎样培养学生能够快乐学习、学习快乐是每一位老师都应该思考的问题。他说，大学教育要以学生为主体，不仅要学生围着老师转，还要老师围着学生转，从而更好地为国家培养出德才兼备的人才。\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    副校长李巍然主持报告会。党委中心组成员，教务处、学生处、团委、学生就业创业指导与服务中心、研究生院等相关部处负责人，以及各院（系）党委副书记、分管教学工作副院长（副主任）参加专题学习。\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
		//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
		//		news.setPicOne(url);
		//		url_list.add(url);
			}else if(i%4==3){
				news.setTitle("中国海洋大学第五届教职工代表大会第六次会议召开 ");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>中国海洋大学第五届教职工代表大会第六次会议召开</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">作者</span><span \"line-height:1.5;\">：李华昌 来源：本站原创 发布时间：2016年04月28日 </span><span \"line-height:1.5;\">本站讯 中国海洋大学第五届教职工代表大会第六次会议于2016年4月27日召开。大会听取并审议了校长工作报告、学校财务工作报告，审议通过了《中国海洋大学教职工代表大会实施办法（修订草案）》，并通过了大会决议。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    大会认为：校长工作报告全面总结了学校2015年各项工作和所取得的突出成绩，并结合深化综合改革及“十三五”事业规划，明确学校2016年的重点工作。报告实事求是，思路清晰，任务明确，重点突出，对于进一步统一思想，提高认识，凝聚人心，推动学校事业又好又快发展将发挥重要作用。学校2015年财务工作强化管理，开源节流，整体运行状况良好，有效地保障了学校事业的发展；2016年财务预算安排合理。大会同意《关于2015年度预算执行及2016年度预算安排的报告》。《中国海洋大学教职工代表大会实施办法（修订草案）》符合上级有关规定和要求，符合学校实际，对于引导广大教职工正确行使民主权利、参与学校民主管理和民主监督，完善内部治理结构、促进学校改革发展具有十分重要的作用。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    学校党委书记鞠传进在讲话中指出，教代会是构建中国特色现代大学制度的重要内容，是学校民主管理的基本形式和基本制度，是教职工行使民主管理权利的重要机构。参加会议的各位代表以高度的责任心和使命感，认真履行职责，积极建言献策，提出了很多好的意见和建议，充分表现出海大教职工热爱学校、关心学校的主人翁情怀，表现出对学校加快改革和发展的热切期盼和坚定信心。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t \n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    鞠传进就进一步加强教代会建设、更好地发挥教代会作用谈了两点意见：一是提高认识，深刻理解教代会的重要作用。教代会作为高校法定组织结构之一，是发挥广大教职工主人翁作用的重要平台，是维护教职工合法权益的重要平台，是学校实现民主办学的重要平台。因此，全校上下要站在全局高度和依法治校的角度，深化对教代会重要性的认识和理解。二是加强建设，充分发挥教代会的重要职能。要切实加强对教代会的领导；要通过抓好制度建设、代表队伍建设、二级教代会建设，来切实加强教代会自身建设；要加强调查研究，注重源头参与，来切实改进工作方法；要切实发挥工会作用，让教职工代表及全体教职工更加深刻地感受到信任和责任，为创建更为稳定和谐的校园贡献力量。\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    副校长李巍然作《深化改革谋发展，凝心聚力创佳绩》工作报告，校总会计师王剑敏作学校2015年度预算执行及2016年度预算安排的报告，校工会主席王震作《中国海洋大学教职工代表大会实施办法》修订说明。\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");
		//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
		//		news.setPicOne(url);
		//		url_list.add(url);
			}else{
				news.setTitle("中国海洋大学2015年秋季学期课程教学评估总结表彰会举行");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>中国海洋大学2015年秋季学期课程教学评估总结表彰会举行</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\"> 作者</span><span \"line-height:1.5;\">：王淑芳 来源：高等教育研究与评估中心 发布时间：2016年04月27日 </span><span \"line-height:1.5;\">　本站讯 4月26日下午，中国海洋大学2015年秋季学期课程教学评估总结表彰会在崂山校区图书馆第一会议室举行。副校长李巍然出席会议，并为获奖教师颁发荣誉证书。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    学校教学评估专家常设委员会主任刘新国教授主持颁奖仪式。他宣读了2015年秋季学期课程教学评估结果。27位参评教师中，董文、孙瑜、曾雪迎、于铭、陈颖、吕太锋等6位教师被评为优秀等级，另有19位教师被评为良好等级，2位教师被评为合格等级。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    李巍然在讲话中对全体参评教师提出了三点期望：一是希望更多的青年教师通过接受课程评估，逐渐成长为教学能手和专家。对于一些已经获得优秀等级的评估课程，尤其要做好传帮带，做好代际传承，将这些优良的教学传统与做法薪火相传，持续不断地提升本科教学质量与水平；二是希望在课程教学中，实现“真”与“美”的统一。广大青年教师在组织课堂教学的过程中，既要强调“求真”，探索真理，追求真知，也要善于发掘学科知识中“美”的元素，将教学活动上升到一种美学的境界；三是希望青年教师在教学过程中，始终做到“关注学生”、“关爱学生”、“关心学生”，关注学生的成长成才，关注学生的情感变化，关注学生的学业成就感，真正做到以学生的成长为本，以学生的学习成效为本，切实提高课堂教学效果。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    评估专家代表、医药学院副院长李筠教授作了题为“课程评价与评估——以学生为中心的教学实践”的主旨发言。李筠老师以“论文写作与学术道德”和“微生物学”两门课程的教学实践为案例，从课程设计、教学组织、教学评价、教学方法、考试与意见反馈等方面，与大家分享了她去年暑假期间赴美国UCLA研习培训后，在课程教学中所做的教学改革和探索。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    董文、孙瑜、曾雪迎、于铭、陈颖、吕太锋等6位教师代表与大家分享了优秀教学的经验与体会。学生代表也就本科教学表达了自己的意见与建议。\n" +
			            "</p>\n" +
			            "<p>\n"+
			            "\t    人事处、教务处、高教研究与评估中心、教学支持中心、学习支持中心有关负责人就有关问题与师生代表进行了互动交流。学校教学评估专家常设委员会主任、副主任，2015年秋季学期、2016年春季学期全体参评教师，部分学生代表参加了会议。\n"+
			            "</p>\n"+
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
			            "\t\t\t\t<div class=\"bshare-custom\">\n");

			}
			news.setPicList(url_list);
			//news.setPublishTime(Long.valueOf(i));
			news.setReadStatus(false);
			news.setSource("");
			news.setSummary("本站讯 4月26日，中央军委国防动员部与教育部联合召开全国大学生征兵工作网络视频会。中央军委国防动员部副部长牟明滨、教育部副部长林蕙青出席会议并就相关工作进行部署。中国海洋大学设立分会场，教务处、学生处、武装部、学生就业创业指导与服务中心、各院（系）负责人，及市委高校工委等有关单位参加了分会场会议。");
			news.setMark(i);
			if(i == 4){
				news.setTitle("2016年全国大学生征兵工作网络视频会议召开");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>2016年全国大学生征兵工作网络视频会议召开</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
			            "\t\t\t\t</div>\n" +
			            "\n" +
			            "\t\t\t\t<div class=\"artContent\">\n" +
			            "\t\t\t\t\t<div id=\"detailNews\"><p>\n" +
			            "\t<span \"line-height:1.5;\">作者 </span><span \"line-height:1.5;\">：辛文 来源：本站原创 发布时间：2016年04月27日 </span><span \"line-height:1.5;\">本站讯 4月26日，中央军委国防动员部与教育部联合召开全国大学生征兵工作网络视频会。中央军委国防动员部副部长牟明滨、教育部副部长林蕙青出席会议并就相关工作进行部署。中国海洋大学设立分会场，教务处、学生处、武装部、学生就业创业指导与服务中心、各院（系）负责人，及市委高校工委等有关单位参加了分会场会议。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<span \"line-height:1.5;\"><br>\n" +
			            "</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    会议指出，强国必先强军，强军必先强兵。我国有2000多所高校，每年有大学毕业生700多万人，在校生3000多万人，这是军队优质兵员的战略储备基地。各地要积极适应教育形势新发展和军队建设新需求，全面走开依托国民教育为军队输送优质兵员的路子。\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t<br>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    会议强调，各级要把大学生征兵工作作为强军兴军的基础工程、推动军民融合深度发展的重要内容、培育德才兼备军地人才的实际举措，坚持创新驱动，发挥军地优势，形成强大合力，切实把大学生征兵工作抓紧抓好，抓出成效。<span \"line-height:1.5;\">锐捷网络公司技术人员就外宾提出的各种技术问题一一做了解答。</span>\n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t \n" +
			            "</p>\n" +
			            "<p>\n" +
			            "\t    会议要求，省级人民政府征兵办公室要会同教育部门制定高校征集计划，明确辖区内高校征集任务，在高校挂牌设立征兵工作站，确保高校征兵工作机构、人员、经费、场地“四到位”；要进一步规范高校征兵工作流程，确保大学生优先报名应征、优先体检政考、优先审批定兵、优先分配去向，为建设世界一流军队输送更多的优质兵员，推进大学生征兵工作再上新台阶。\n" +
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
				news.setNewsCategory("推荐");
				news.setNewsCategoryId(1);
				news.setSource_url("http://www.ouc.edu.cn/jwc/bf/8c/c6517a49036/page.psp");
				news.setTitle("关于组织2016年春季学期本科课程期末考试的通知");
				news.setData("<div id=\"innerPadding\">\n" +
			            "                \n" +
			            "\t\t\t\t<div class=\"artTitle\">\n" +
			            "\t\t\t\t\t<h2>关于组织2016年春季学期本科课程期末考试的通知</h2>\n" +
			            "\t\t\t\t\t<span>   \n" +
			            "\t\t\t\t\t </span>\n" +
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
					news.setTitle("关于举办2016年中国海洋大学数学建模竞赛暨2016年“深圳杯”数学建模挑战赛校内选拔赛的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于举办2016年中国海洋大学数学建模竞赛暨2016年“深圳杯”数学建模挑战赛校内选拔赛的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else if(i%4==3){
					news.setTitle("关于中国海洋大学与英国东英吉利大学本科生2+2联合培养项目说明会的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于中国海洋大学与英国东英吉利大学本科生2+2联合培养项目说明会的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else{
					news.setTitle("关于举办中国海洋大学第三届工程制图大赛的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于举办中国海洋大学第三届工程制图大赛的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");

				}
				news.setPicList(url_list);
				//news.setPublishTime(Long.valueOf(i));
				news.setReadStatus(false);
				news.setSource("");
				news.setSummary("本站讯 4月26日，中央军委国防动员部与教育部联合召开全国大学生征兵工作网络视频会。中央军委国防动员部副部长牟明滨、教育部副部长林蕙青出席会议并就相关工作进行部署。中国海洋大学设立分会场，教务处、学生处、武装部、学生就业创业指导与服务中心、各院（系）负责人，及市委高校工委等有关单位参加了分会场会议。");
				news.setMark(i);
				if(i == 4){
					news.setTitle("关于申报中国海洋大学第十一届优秀教学成果奖的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于申报中国海洋大学第十一届优秀教学成果奖的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				news.setNewsCategory("推荐");
				news.setNewsCategoryId(1);
				news.setSource_url("http://www.baidu.com");
				news.setTitle("关于定期报送创业项目库信息的通知");
				news.setData("<div id=\"innerPadding\">\n" +
            "                \n" +
            "\t\t\t\t<div class=\"artTitle\">\n" +
            "\t\t\t\t\t<h2>关于定期报送创业项目库信息的通知</h2>\n" +
            "\t\t\t\t\t<span>   \n" +
            "\t\t\t\t\t </span>\n" +
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
					news.setTitle("关于遴选项目入驻O-Lab学生创新创业实验室的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于遴选项目入驻O-Lab学生创新创业实验室的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else if(i%4==3){
					news.setTitle("关于开展2016年大学生暑期“三下乡”社会实践 活动的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于开展2016年大学生暑期“三下乡”社会实践 活动的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");
			//		String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
			//		news.setPicOne(url);
			//		url_list.add(url);
				}else{
					news.setTitle("关于评选第二届中国海洋大学 “金花奖学金”的通知");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于评选第二届中国海洋大学 “金花奖学金”的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
				            "\t\t\t\t<div class=\"bshare-custom\">\n");

				}
				news.setPicList(url_list);
				//news.setPublishTime(Long.valueOf(i));
				news.setReadStatus(false);
				news.setSource("");
				news.setSummary("本站讯 4月26日，中央军委国防动员部与教育部联合召开全国大学生征兵工作网络视频会。中央军委国防动员部副部长牟明滨、教育部副部长林蕙青出席会议并就相关工作进行部署。中国海洋大学设立分会场，教务处、学生处、武装部、学生就业创业指导与服务中心、各院（系）负责人，及市委高校工委等有关单位参加了分会场会议。");
				news.setMark(i);
				if(i == 4){
					news.setTitle("海创服务站创业服务指南");
					news.setData("<div id=\"innerPadding\">\n" +
				            "                \n" +
				            "\t\t\t\t<div class=\"artTitle\">\n" +
				            "\t\t\t\t\t<h2>关于评选第二届中国海洋大学 “金花奖学金”的通知</h2>\n" +
				            "\t\t\t\t\t<span>   \n" +
				            "\t\t\t\t\t </span>\n" +
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
			news.setNewsCategory("推荐");
			news.setNewsCategoryId(1);
			news.setSource_url("http://news.sina.com.cn/c/2014-05-05/134230063386.shtml");
			news.setTitle("可以用谷歌眼镜做的10件酷事：导航、玩游戏");
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
				news.setTitle("AA用车:智能短租租车平台");
				String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
				news.setPicOne(url);
				url_list.add(url);
			}
			news.setPicList(url_list);
			news.setPublishTime(Long.valueOf(i));
			news.setReadStatus(false);
			news.setSource("手机腾讯网");
			news.setSummary("腾讯数码讯（编译：Gin）谷歌眼镜可能是目前最酷的可穿戴数码设备，你可以戴着它去任何地方（只要法律法规允许或是没有引起众怒），作为手机的第二块“增强现实显示屏”来使用。另外，虽然它仍未正式销售，但谷歌近日在美国市场举行了仅限一天的开放购买活动，价格则为1500美元（约合人民币9330元），虽然仍十分昂贵，但至少可以满足一些尝鲜者的需求，也预示着谷歌眼镜的公开大规模销售离我们越来越近了。");
			news.setMark(i);
			if(i == 4){
				news.setTitle("部落战争强势回归");
				news.setLocal("推广");
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
				news.setComment("评论部分，说的非常好。");
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
	
	/** mark=0 ：推荐 */
	public final static int mark_recom = 0;
	/** mark=1 ：热门 */
	public final static int mark_hot = 1;
	/** mark=2 ：首发 */
	public final static int mark_frist = 2;
	/** mark=3 ：独家 */
	public final static int mark_exclusive = 3;
	/** mark=4 ：收藏 */
	public final static int mark_favor = 4;
	
	/*
	 * 获取城市列表
	 */
	public static ArrayList<CityEntity> getCityList(){
		ArrayList<CityEntity> cityList =new ArrayList<CityEntity>();
		
		CityEntity city1 = new CityEntity(1,"工程学院", 'G');
		CityEntity city2 = new CityEntity(2, "海洋生命学院", 'H');
		CityEntity city3 = new CityEntity(3, "海洋科学学院", 'H');
		CityEntity city4 = new CityEntity(4, "海洋环境学院", 'H');
		CityEntity city5 = new CityEntity(5, "海洋地球科学学院", 'H');
		CityEntity city6 = new CityEntity(6, "教育系", 'J');
		CityEntity city7 = new CityEntity(7,"教育部重点实验室", 'J' );
		CityEntity city8 = new CityEntity(8, "食品科学与工程学院", 'S');
		CityEntity city9 = new CityEntity(9,  "水产学院", 'S');
		CityEntity city10 = new CityEntity(10,  "外国语学院", 'W');
		CityEntity city11 = new CityEntity(11, "信息科学与工程学院", 'X');
		CityEntity city12 = new CityEntity(12,"医药学院", 'Y');
		CityEntity city13 = new CityEntity(13, "艺术系", 'Y');
		
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
	/* 频道中区域 如杭州 对应的栏目ID */
	public final static int CHANNEL_CITY = 3;
}
