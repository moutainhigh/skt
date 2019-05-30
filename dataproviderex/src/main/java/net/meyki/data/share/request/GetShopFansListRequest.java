/**
 * 
 */
package net.meyki.data.share.request;

import java.util.HashMap;


import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.ShopFansListResponse;
import net.meyki.data.utils.JacksonUtil;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年5月5日 下午6:42:28 
 * 类说明  获取粉丝和商友列表时请求
 */
public class GetShopFansListRequest extends JavaCommonRequest {
	public GetShopFansListRequest(){
		this.setMethodName("shop/getFollowers");
	}
	public String userTag; 
	
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("userId", userId);
		in.put("userTag", userTag);
		in.put("pageNo", pageNo);
		in.put("pageSize",pageSize);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		ShopFansListResponse slr = JacksonUtil.readValue(json, ShopFansListResponse.class);
		if(slr == null){
			slr = new ShopFansListResponse();
		}
		return slr;
	}

}
