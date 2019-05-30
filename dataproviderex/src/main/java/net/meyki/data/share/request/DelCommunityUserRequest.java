package net.meyki.data.share.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

public class DelCommunityUserRequest extends JavaCommonRequest{

	public String login_name;
	public String community_id;
	public List<String> person_list = new ArrayList<String>();
	public List<String> login_names = new ArrayList<String>();
	
	public DelCommunityUserRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/deleteCommunityUser");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("community_id", community_id);
		param.put("delete", person_list);
		param.put("login_names", login_names);
		return param;
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
