package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

public class FreeBenefitDetailResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5694976515230445260L;
	
	/**
	 * 免费福利id
	 * */
	public String id;
	
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
	public String nums;
	
	/**
	 * 免费福利剩余数量
	 * */
	public String lessnums;
	
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
	public String status;

}
