package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 店铺类型实体bean
 * 
 * @author Administrator
 */
public class PaymentCountBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5183883346122767730L;
	/** 店铺分类UUID */
	public String total;
	public String receiverName;
	public String logo;
	public String userLogo;
	public String desc;
	public String status;
	public String addTime;
}
