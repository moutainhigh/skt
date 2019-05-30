package net.meyki.data.client.domain;

import java.io.Serializable;

public class CityItem   implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7425744969398779566L;
	String region_name;//城市名称
	String region_jw;//经纬度 
	String region_index;//
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getRegion_jw() {
		return region_jw;
	}
	public void setRegion_jw(String region_jw) {
		this.region_jw = region_jw;
	}
	public String getRegion_index() {
		return region_index;
	}
	public void setRegion_index(String region_index) {
		this.region_index = region_index;
	}
}
