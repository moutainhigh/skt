/**
 * 免费福利列表实体类
 * */
package net.meyki.data.distributon.domain;

import java.io.Serializable;

public class FreeBenefitListItem implements Serializable{

	private static final long serialVersionUID = -8576040238348986584L;
	
	/**
	 * 免费福利id
	 * */
	public int id;
	
	/**
	 * 免费福利名字
	 * */
	public String name;
	
	/**
	 * 免费福利图片url
	 * */
	public String src;
	
	/**
	 * 免费福利总数量
	 * */
	public int nums;
	
	/**
	 * 免费福利剩余数量
	 * */
	public int lessnums;
	
	/**
	 * 免费福利描述
	 * */
	public String info;
	
	/**
	 * 免费福利startTime
	 * */
	public String startTime;
	
	/**
	 * 免费福利endTime
	 * */
	public String endTime;
	
	/**
	 * 免费福利状态
	 * 1正在活动，2 已取消活动
	 * */
	public int status;
}
