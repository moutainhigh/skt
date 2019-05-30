package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.SearchInfo;
import net.meyki.data.share.response.SearchInfoResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 用户登录请求
 * 
 * @author hulei
 * 
 */
public class SearchInfoRequest extends JavaCommonRequest {
	public String mobile;
	public String flag;
	public SearchInfoRequest() {
		this.setMethodName("community/querySearchInfo");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		SearchInfoResponse sr = new SearchInfoResponse();
		sr = JacksonUtil.readValue(json, SearchInfoResponse.class);
		return sr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("os", dev_os);
		in.put("tag", dev_tag);
		in.put("flag", flag);
		in.put("mobile", mobile);
		in.put("userId",userId);
		return in;
	}

}
