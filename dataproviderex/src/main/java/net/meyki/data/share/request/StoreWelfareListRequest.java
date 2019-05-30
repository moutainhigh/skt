package net.meyki.data.share.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.StoreWelfareListResponse;

import java.util.HashMap;

/**
 * 125 获取更多 免费福利
 * 
 * @author liyc
 * 
 */
public class StoreWelfareListRequest extends JavaCommonRequest {

	public StoreWelfareListRequest(){
		setMethodName("index/getFreeClient");// 这里需要传入请求的action
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("pageSize", pageSize);
		params.put("shopId", shopId);
		params.put("pageNo", pageNo);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		if (null == paramStream) {
			return null;
		}
		StoreWelfareListResponse swlr = JacksonUtil.readValue(paramStream, new TypeReference<StoreWelfareListResponse>() {
		});
		return swlr;
	}

}
