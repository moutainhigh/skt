/**
 * 
 */
package net.meyki.data.distributon.domain;

import java.io.Serializable;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月26日 上午10:04:31 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class StoreBean implements Serializable {
	/** 店铺id */
	private String shopId;		
	/** 店铺名称 */
	private String shopName;		
	/** 经纬度  */
	private String adr;		
	/**  */
	private String tid;		
	/** 店铺qq */
	private String qq;
	/** 店铺联系人  */
	private String contact;		
	/** 店铺电话 */
	private String shopTel;		
	/** 店铺地址 */
	private String shopAddress;	
	/** 店铺图像 */
	private String shopImg;
	/** 店铺微信 */
	private String weixin;
	/** 店铺描述 */
	private String shopDesc;		
	/** 店铺id二维码信息 */
	private String qrCode;
	/** 营业时间范围 */
	private String openTimeDes;		
	/** 推送id */
	private String tcid;	
	/** 店铺是否审核   1：未审核  2：审核中 3：审核通过 4：已拒绝*/
	private int isChecked;
	/** 是否实地认证  */
	private int isValidate;
	public int updNameNum;//名称更新次数
	public int updTypeNum;//类型更新次数
	public int updLongitudeNum;
	public int updLatitudeNum;
	
	
	public int getIsValidate() {
		return isValidate;
	}
	public void setIsValidate(int isValidate) {
		this.isValidate = isValidate;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getShopTel() {
		return shopTel;
	}
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getShopDesc() {
		return shopDesc;
	}
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getOpenTimeDes() {
		return openTimeDes;
	}
	public void setOpenTimeDes(String openTimeDes) {
		this.openTimeDes = openTimeDes;
	}
	public String getTcid() {
		return tcid;
	}
	public void setTcid(String tcid) {
		this.tcid = tcid;
	}

	public int getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(int isChecked) {
		this.isChecked = isChecked;
	}
}
