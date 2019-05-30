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
# 创建日期：2015-7-14
#
# @Copyright (c) 2015 Tans All right reserved.
#************************************************
 */
package net.meyki.skt.bean;

import java.io.Serializable;

/**
 * @ClassName GoodsBean
 * @Create Date 2015-7-14 下午6:22:11
 * 
 * @author Tans      QQ     1511895018
 * WSTMall开源商城-合作团队     官网地址:http://www.wstmall.com   联系QQ:707563272
 */
public class GoodsBean implements Serializable {

	public String goodsId;// 商品ID
	public String goodsName;// 商品名称
	public String goodsThums;// 商品图标
	public String shopPrice;// 商品价格
	public String goodsSpec;// 规格
	public String goodsStock;// 是否有库存 0：无货
	public String shopName;//店铺名称
	public String shopId;//店铺ID
	public String appraiseNum;//评论数量

}
