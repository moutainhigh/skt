package net.meyki.data.distributon.request;

import java.util.HashMap;

import android.text.TextUtils;
import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.distributon.domain.StoreBean;
import net.meyki.data.distributon.response.GetShopInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
/**
 * 获取店铺信息数据请求
 * @author liyc
 * @version 2016.4.26
 *
 */
public class GetStoreInfoRequest extends JavaCommonRequest {
	
	public GetStoreInfoRequest(){
		this.setMethodName("shop/getShop");
	}
	

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		GetShopInfoResponse glr = new GetShopInfoResponse();
//		String data = super.ansyisCommonResponseNew(glr, json);
		if(!TextUtils.isEmpty(json)){
			glr.store = JacksonUtil.readValue(json, StoreBean.class);
		}
		return glr;
	}

	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String,Object> in   = new HashMap<String,Object>();
		in.put("shopId", userId);
		in.put("tag", this.dev_tag);
		in.put("os", this.dev_os);
		return in;
	}

}
