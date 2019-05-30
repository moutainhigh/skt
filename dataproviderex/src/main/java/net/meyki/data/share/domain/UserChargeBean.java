package net.meyki.data.share.domain;

import java.io.Serializable;

public class UserChargeBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2623919112297346891L;
	/** 店铺分类UUID */
	public String bn;				
	public String tn;
	public String signInfo;//支付宝和微信调起客户端的字符串
}
