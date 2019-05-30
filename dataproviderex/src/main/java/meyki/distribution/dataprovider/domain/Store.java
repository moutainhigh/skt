package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

/**
 * 店铺实体类
 * 
 * @author liyc
 */
public class Store implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3902084726961318347L;
	private String shopName;
	private String shopImg;
	private String shopId;
	private String qq;
	private String address;
	private String latitude;
	private String longitude;
	private String tel;
	private String tid;
	private String contact;
	private String shopPhone;
	private String weixin;
	private String opentime;
	private String typeId;
	private String qrCode;// 二维码
	private String wc;// 是否提供wc服务
	private String express;// 是否提供快递代收服务
	private String recovery;// 是否提供绿色回收服务
	private String donation;// 是否提供工艺捐助服务
	private String appointment;// 是否提供居家养老的服务
	private String is_check;
	private String userProvince;
	private String userCity;
	private String userCounty;
	private String latitudeNums;
	private String longitudeNums;
	private String typeNums;
	private String shopNameNums;
	private String typeName;

	public String getIs_check() {
		return is_check;
	}

	public void setIs_check(String is_check) {
		this.is_check = is_check;
	}

	/**
	 * @author chengyuewei
	 */
	private String shippingMess;// 配送描述
	private String isShpping;// 是否支持配送1:开启 2：未开启
	private String sname; // 分店名称，为“”不显示，不为空显示

	public String getQrCode() {
		return qrCode;
	}

	public String getShopName() {
		return shopName;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String shppName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public Store(String name, String qq) {
		this.shopName = name;
		this.qq = qq;
	}

	public Store() {
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopImg() {
		return shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWc() {
		return wc;
	}

	public void setWc(String wc) {
		this.wc = wc;
	}

	public String getExpress() {
		return express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public String getRecovery() {
		return recovery;
	}

	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}

	public String getDonation() {
		return donation;
	}

	public void setDonation(String donation) {
		this.donation = donation;
	}

	public String getShippingMess() {
		return shippingMess;
	}

	public void setShippingMess(String shippingMess) {
		this.shippingMess = shippingMess;
	}

	public String getIsShpping() {
		return isShpping;
	}

	public void setIsShpping(String isShpping) {
		this.isShpping = isShpping;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCounty() {
		return userCounty;
	}

	public void setUserCounty(String userCounty) {
		this.userCounty = userCounty;
	}

	public String getLatitudeNums() {
		return latitudeNums;
	}

	public void setLatitudeNums(String latitudeNums) {
		this.latitudeNums = latitudeNums;
	}

	public String getLongitudeNums() {
		return longitudeNums;
	}

	public void setLongitudeNums(String longitudeNums) {
		this.longitudeNums = longitudeNums;
	}

	public String getTypeNums() {
		return typeNums;
	}

	public void setTypeNums(String typeNums) {
		this.typeNums = typeNums;
	}

	public String getShopNameNums() {
		return shopNameNums;
	}

	public void setShopNameNums(String shopNameNums) {
		this.shopNameNums = shopNameNums;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}