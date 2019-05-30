package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 1、提交发货信息
 * 
 * @author liyc
 * 
 */
public class UpdateReturnGoodsInfoRequest extends JavaCommonRequest {
	public String orderId; //订单id
	public String refondId; //退款单id
	public String shopName; //名称
	public String shopTel; //电话
	public String address; //详细地址
	public String postCode; //邮编
	public String logisticNum; //物流编号
	public String logisticsCompany; //物流公司
	public String img1; //退款申请凭证图片
	public String img2; //退款申请凭证图片
	public String img3; //退款申请凭证图片

	public UpdateReturnGoodsInfoRequest() {
		this.setMethodName("v4/v409refond/commitLogistic");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("orderId",orderId);
		params.put("userId",userId);
		params.put("refondId",refondId);
		params.put("shopName",shopName);
		params.put("shopTel",shopTel);
		params.put("address",address);
		params.put("postCode",postCode);
		params.put("logisticNum",logisticNum);
		params.put("logisticsCompany",logisticsCompany);
		params.put("img1",img1);
		params.put("img2",img2);
		params.put("img3",img3);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
