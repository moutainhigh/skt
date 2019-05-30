/**
 * 免费福利请求
 * */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.distributon.response.FreeBenefitListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

public class FreeBenefitListRequest extends JavaCommonRequest {

	public String user_id;
	public String page;
	public String status;

	public FreeBenefitListRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("Free/getFreeIndex");
	}

	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", user_id);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("page", page);
		param.put("status", status);
		return param;
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		FreeBenefitListResponse rs = new FreeBenefitListResponse();
		rs = JacksonUtil.readValue(paramStream, new TypeReference<FreeBenefitListResponse>(){});
		return rs;
	}
}
