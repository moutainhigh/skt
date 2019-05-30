package net.meyki.data.share.domain;

import java.io.Serializable;

public class WelfareListItem  implements Serializable {

	//
	// [id] => 1
	// [name] => ceshi 活动名称
	// [src] => 1 图片地址
	// [nums] => 123 数量
	// [info] => 234234 描述
	// [startTime] => 1970.01.01 开始时间
	// [endTime] => 01.01 结束时间
	// [status] => 1 1正在活动，2 已取消活动
	// [isGet]=> 是否被领取 1:已领取 2： 未领取
	private String freeId;
	private String name;
	private String type;
	private int isGet;
	public int getIsGet() {
		return isGet;
	}
	public void setIsGet(int isGet) {
		this.isGet = isGet;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String imgSrc;
	private Integer nums;
	private Integer lessNums;

	public String getFreeId() {
		return freeId;
	}

	public void setFreeId(String freeId) {
		this.freeId = freeId;
	}

	public Integer getLessNums() {
		return lessNums;
	}

	public void setLessNums(Integer lessNums) {
		this.lessNums = lessNums;
	}

	private String info;
	private String desc;
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private String startTime;
	private String endTime;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
