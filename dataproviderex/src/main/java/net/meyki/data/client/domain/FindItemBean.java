package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by hl on 2016/4/28.
 */
public class FindItemBean implements Serializable {


   public String bulletinId		;		//out		String		YES		广告类bannerID,业务ID
   public String positionId		;		//out		String		YES		媒体类型 0-图片 1-视频
   public String content		;		//out		String		YES		快报内容
   public String mediaLinkType	;		//	out		String		OPTION		链接方式，0-无 1-静态页面 2-店铺 3-商品,默认值为0
   public String mediaLinkObject;		//		out		String		OPTION		链接对象ID，媒体链接方式为0时，为空；媒体链接方式为1时，为静态页面URL；媒体链接方式为2时，为店铺ID；媒体链接方式为3时，为商品ID；
   public String objectName		;		//out		String		YES		链媒体链接方式为2时，为店铺名称；媒体链接方式为3时，为商品名称
   public String orderSource	;		//	out		String		OPTION		当链接方式为3时，显示：1为活动商品，0为普通商品
   public String dataFrom		;		//out		String		OPTION		链接数据来源,0-特产馆 1-综合商城 ，当“链接方式”等于2,3时有效
}
