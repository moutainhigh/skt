package net.meyki.data.client.domain;



public class ShopListItem {



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getOnums() {
		return onums;
	}
	public void setOnums(String onums) {
		this.onums = onums;
	}
	public String getGnums() {
		return gnums;
	}
	public void setGnums(String gnums) {
		this.gnums = gnums;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	private String name;
	private String user_id;
	private String url;
	 //status 两种状态 c 为收藏  n 未收藏 
	private String status;
	
	private String tid;
	private String address;//陕西省西安市雁塔区科技路8号
	private String num;// 分享数量
	private String onums;//已售商品
	private String gnums;// 商品数量
	private String distance;//距离中心点距离，单位km

	
}
