/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * 获取店铺信息时请求
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月28日 上午11:02:43 
 * 类说明 
 */

public class GetStoreDetailRequest extends JavaCommonRequest {

	private String shopId;
	
	private String userId;
	
	
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetStoreDetailRequest(){
		this.setMethodName("shop/browseShop");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in  = new HashMap<String,Object>();
		in.put("shopId",shopId);
		in.put("userId", userId);
		in.put("tag",dev_tag);
		in.put("os", dev_os);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		///StoreDetatilResponse sdr = new StoreDetatilResponse();
		
//		sdr.
		return null;
	}

}
