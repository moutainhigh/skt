/**
 * 
 */
package net.meyki.data.distributon.response;

import net.meyki.data.json.JavaCommonResponse;


/** 
 * @author 作者 E-mail: liyc
 * @version 创建时间：2016年4月26日 下午1:36:37 
 * 类说明  ：验证优惠券
 */

public class CheckBoundResponse extends JavaCommonResponse {
	private String bonusName;
	private String price;
	public String getBonusName() {
		return bonusName;
	}
	public void setBonusName(String bonusName) {
		this.bonusName = bonusName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
