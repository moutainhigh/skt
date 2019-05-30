package net.meyki.skt.bean;

import java.io.Serializable;

public class PlaceList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2632127852546857224L;
	private int num;
	private String name;
	private String telephone;
	private PlaceLocation location;
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	private String address;
	private String street_id;
	private int detail;
	private String province;
	private String city;
	private String county;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private String uid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlaceLocation getLocation() {
		return location;
	}
	public void setLocation(PlaceLocation location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet_id() {
		return street_id;
	}
	public void setStreet_id(String street_id) {
		this.street_id = street_id;
	}
	public int getDetail() {
		return detail;
	}
	public void setDetail(int detail) {
		this.detail = detail;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}

	public String getCounty() {
		return county;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCounty(String county) {
		this.county = county;
	}
}
