package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

public class SendCommunityNewsRequest extends JavaCommonRequest {
	
	public String community_id;
	public String content;
	public String login_name;

	public SendCommunityNewsRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/sendToBroadcast");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub		
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("community_id", community_id);
		param.put("content", content);
		param.put("login_name", login_name);
		return param;
	}

}
