package net.meyki.skt.domain;

import java.io.Serializable;

/**
 * 直供商品实体类
 * @author Administrator
 *
 */
public class SupplyGood implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1779744137956316905L;
	public String goodsId;//商品id
	public String image;//商品主图
	public String info;//商品图片说明信息
	public String price;//商品的当前价格
	public String mkprice;//商品的市场价
	public String unit;//商品的计量单位
	public String spec;//商品规格
	public String num;//限购数量
	public String less;//已售
	public String lessTime;//剩余时间
	public String status;//状态1 ： 可以购买 2 不可以购买
}
