package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;


/**
 * 时令抢鲜产品列表请求
 * @author liyc
 *
 */
public class FreshSaleProductInfoRequest extends JavaCommonRequest {

	public FreshSaleProductInfoRequest() {
		this.setMethodName("v3/user/login");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		return null;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}
}
