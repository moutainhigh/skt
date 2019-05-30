package net.meyki.data.client.request;

import java.util.HashMap;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.GetNearbyActResponse;

/**
 * 1.117 获取周边活动
 * */
public class GetNearbyActRequest extends JavaCommonRequest {
	public int locateType;
	public String longitude;
	public String latitude;
	public String city;
	public String radius;
	public int pageNo;
	public int pageSize;
	public String keyword;//关键字检索
	public int tag;
	public String act;//检索类别

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getLocateType() {
		return locateType;
	}

	public void setLocateType(int locateType) {
		this.locateType = locateType;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public GetNearbyActRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("index/getActives");
		pageSize=10;
		radius="10000";
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("locateType", locateType);
		param.put("longitude", longitude);
		param.put("latitude", latitude);
		param.put("city", city);
		param.put("radius", radius);
		param.put("pageNo", pageNo);
		param.put("pageSize", pageSize);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		GetNearbyActResponse cr = JacksonUtil.readValue(paramStream,new TypeReference<GetNearbyActResponse>(){});
		return cr;
	}

}
