/**
#************************************************
# 项目名称：WSTMall
# 版本号： V1.0  
#************************************************
# 文件说明：
#          
#************************************************
# 子模块说明：
#                     
#************************************************
# 创建人员： 谈泳豪
# 创建人员QQ：1511895018
# 创建日期：2015-6-26
#
# @Copyright (c) 2015 Tans All right reserved.
#************************************************
*/
package net.meyki.skt.bean;

import java.io.Serializable;

/**
 * @ClassName GoodsListBean
 * @Create Date 2015-6-26 上午11:05:58 
 * 
 * @author Tans      QQ     1511895018
 * WSTMall开源商城-合作团队     官网地址:http://www.wstmall.com   联系QQ:707563272
 */
public class GoodsListBean implements Serializable{
	
	public String shopName;//店铺名称
	public String shopId;//店铺ID
	public String goodsId;//商品ID
	public String goodsName;//商品名称
	public String goodsThums;//商品缩略图
	public String shopPrice;//商品价格
	public double userDistance;//距离
	public double deliveryStartMoney;//订单配送起步价
	public double deliveryFreeMoney;//商店免运费价格
	public double score;//星星
	public String goodsAttrId; //商品属性ID,
	public int goodsStock; //商品库存,
	public String goodsSn;//商品编号
	public boolean isBook;
	
	public int goodscount;//用于购物车单个商品数目
	public boolean cbchild; //用于购物车记录checkbox状态
	public String attrVal;
	public String attrName;
	public String goodsSpec;// 规格
	public String appraiseNum;//评论数量
	
	public double totalMoney;
	public int goodsNum;
	public double goodsPrice;
	public void setGoodscount(int goodscount){
		this.goodscount=goodscount;
	}
	public void Setchild(boolean cbchild){
		this.cbchild=cbchild;
	}
}
