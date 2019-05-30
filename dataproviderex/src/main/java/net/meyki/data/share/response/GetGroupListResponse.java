package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;


public class GetGroupListResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5039646556125648849L;
	
	public String community_id;
	public String cname;
	public String caddress;
	public String clat;
	public String clng;
	public String cerma;
	public String cphoto;
	public String cintroduce;
	
	public String getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getClat() {
		return clat;
	}
	public void setClat(String clat) {
		this.clat = clat;
	}
	public String getClng() {
		return clng;
	}
	public void setClng(String clng) {
		this.clng = clng;
	}
	public String getCerma() {
		return cerma;
	}
	public void setCerma(String cerma) {
		this.cerma = cerma;
	}
	public String getCphoto() {
		return cphoto;
	}
	public void setCphoto(String cphoto) {
		this.cphoto = cphoto;
	}
	public String getCintroduce() {
		return cintroduce;
	}
	public void setCintroduce(String cintroduce) {
		this.cintroduce = cintroduce;
	}
}