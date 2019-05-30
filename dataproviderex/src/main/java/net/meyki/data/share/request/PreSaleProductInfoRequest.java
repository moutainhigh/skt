package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;


/**
 * 新品预售产品列表请求
 * @author liyc
 *
 */
public class PreSaleProductInfoRequest extends JavaCommonRequest {

	public PreSaleProductInfoRequest() {
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
