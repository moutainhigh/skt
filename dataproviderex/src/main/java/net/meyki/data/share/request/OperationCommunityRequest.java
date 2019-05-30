package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

public class OperationCommunityRequest extends JavaCommonRequest{

	public String login_name;
	public String community_id;
	public String touser_id;
	
	public OperationCommunityRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/transferCommunity");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String , Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("login_name", login_name);
		param.put("community_id", community_id);
		param.put("touser_id", touser_id);
		return param;
	}

}
