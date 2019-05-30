package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetCommunityListResponse;
import net.meyki.data.utils.JacksonUtil;


/**
 * 获取用户群列表请求
 * @author 
 */
public class GetCommunityListRequest extends JavaCommonRequest {


	public  GetCommunityListRequest() {
		setMethodName("community/getCommunityList");
	}


	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		GetCommunityListResponse cr = new GetCommunityListResponse();
		cr = JacksonUtil.readValue(paramStream, GetCommunityListResponse.class);
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("pageNo", pageNo);
		param.put("pageSize", pageSize);
		return param;
	}
}