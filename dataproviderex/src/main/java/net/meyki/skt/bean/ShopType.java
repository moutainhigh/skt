package net.meyki.skt.bean;

import java.io.Serializable;

public class ShopType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5816987755375925674L;
	private String shopName;
	private int count;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ShopTypeList [shopName=" + shopName + ", count=" + count + "]";
	}

}
