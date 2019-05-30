package net.meyki.data.share.request;

import java.util.HashMap;
import org.codehaus.jackson.type.TypeReference;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CommunityDetailInfo;
import net.meyki.data.share.response.GetCommunityDetailResponse;
import net.meyki.data.utils.JacksonUtil;

public class GetCommunityDetailRequest extends JavaCommonRequest{

	public String community_id;
	
	public GetCommunityDetailRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/getCommunityDetail");
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		GetCommunityDetailResponse cr = new GetCommunityDetailResponse();
		cr.mCommunityDetailInfo = JacksonUtil.readValue(paramStream, new TypeReference<CommunityDetailInfo>(){});
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
