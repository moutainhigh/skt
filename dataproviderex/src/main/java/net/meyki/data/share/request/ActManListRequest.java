package net.meyki.data.share.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.ActManListResponse;

import java.util.HashMap;

/**
 * 130 更多列表(满减)
 *
 */
public class ActManListRequest extends JavaCommonRequest {

	public ActManListRequest() {
		this.setMethodName("index/getFullcutClient");
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
		if (null == paramStream) {
			return null;
		}
		ActManListResponse alr = JacksonUtil.readValue(paramStream, new TypeReference<ActManListResponse>() {
		});
		return alr;
	}
}
