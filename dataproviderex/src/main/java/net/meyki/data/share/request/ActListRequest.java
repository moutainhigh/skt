package net.meyki.data.share.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.ActListResponse;

import java.util.HashMap;


/**
 * 会员打折、会员赠品
 *
 */
public class ActListRequest extends JavaCommonRequest {
		public ActListRequest(){
			setMethodName("index/memberActivesClient");
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("pageSize", pageSize);
		params.put("shopId", shopId);
		params.put("type", type);
		params.put("pageNo", pageNo);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		if (null == paramStream) {
			return null;
		}
		ActListResponse alr = JacksonUtil.readValue(paramStream, new TypeReference<ActListResponse>() {
		});
		return alr;
	}

}
