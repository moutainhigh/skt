package net.meyki.data.share.domain;

import java.io.Serializable;

public class DiscountListItem implements Serializable{

	private String id;
	private String marketPrice;//市场价
	private String shopPrice;//折扣价
	private String dsctName;//折扣名称
	private String goodsName;//商品名称
	private String goodsImg;//商品图片
	private String goodId;//商品id
	private String discount;//折扣信息，如8.5
	private String startTime;//开始时间 ，如1446430731
	private String endTime;//结束时间
	private int status;//状态 1.折扣中 -1.暂未开始
	private String goodsUnit;//商品单位
	private String dsctType;//折扣类型
	private String goodsDesc;//商品描述

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodId() {
		return goodId;
	}

	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public String getDsctType() {
		return dsctType;
	}
	public void setDsctType(String dsctType) {
		this.dsctType = dsctType;
	}
	public String getGoodsUnit() {
		return goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(String shopPrice) {
		this.shopPrice = shopPrice;
	}
	public String getDsctName() {
		return dsctName;
	}
	public void setDsctName(String dsctName) {
		this.dsctName = dsctName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
