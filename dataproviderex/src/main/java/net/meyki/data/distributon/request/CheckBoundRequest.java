/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import net.meyki.data.distributon.response.CheckBoundResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者: liyc
 * @version 创建时间：2016年4月26日 上午11:57:55 
 * 类说明  验证优惠券
 */
public class CheckBoundRequest extends JavaCommonRequest {
	
	/** 店铺id */
	private String shopId;
	/** 用户id */
	private String userId;
	/** 优惠券号码  */
	private String bonusNo;
	
	public CheckBoundRequest(){
		this.setMethodName("user/checkBonus");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		CheckBoundResponse cbr = new CheckBoundResponse();
//		String data = super.ansyisCommonResponseNew(cbr, json);
//		if(!TextUtils.isEmpty(data)){
//			cbr.setBonusName(JSON.parseObject(data).getString("bonusName")); 
//			cbr.setPrice(JSON.parseObject(data).getString("price"));
//		}
		return cbr;
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("shopId", shopId);
		in.put("userId",userId);
		in.put("bonusNo", bonusNo);
		in.put("os", dev_tag);
		in.put("tag",dev_tag);
		return in;
	}

}
