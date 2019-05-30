package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;

/**
 * 优摇一摇功能数据响应
 * @author liyc
 *
 */
public class BoundShackResponse extends JavaCommonResponse {

 	/************* 摇一摇功能响应   ***************/
 	public int id;
 	public String  shopImg;//店铺logo
 	public String shopCompany;//店铺名称
 	public String startTime;//开始时间 时间戳 以秒为单位处理
 	public String endTime;//结束时间 时间戳 以秒为单位处理
 	public String total;//优惠券金额
 	public String tid;//领取优惠券时传递
 	public String play;//用户是否还有剩余次数 ：continue :可以继续摇   over:游戏结束了
 	public int nums;//游戏剩余次数
}
