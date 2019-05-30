package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetCommunityMemberListResponse;

public class GetCommunityMemberListRequest extends JavaCommonRequest{
	
	public String community_id;
	
	public GetCommunityMemberListRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/getCommunityMemberList");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		GetCommunityMemberListResponse cr = new GetCommunityMemberListResponse();
		cr = JacksonUtil.readValue(paramStream, GetCommunityMemberListResponse.class);
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("community_id", community_id);
		return param;
	}
}
