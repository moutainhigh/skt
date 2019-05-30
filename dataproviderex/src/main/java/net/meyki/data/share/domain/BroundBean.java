package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 优惠券折扣对应的bean
 * @author Administrator
 */
public class BroundBean implements Serializable{
	public String bonusNo;//优惠券id
	public String price;//优惠券价格
	public String name;//优惠券名称
	public String startTime;//优惠券开始时间
	public String endTime;//结束时间
	public String info;//优惠券介绍说明
	public String shopName;//店铺名称
}
