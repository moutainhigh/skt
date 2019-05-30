package net.meyki.data.share.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
/**
 * 
 * 添加群成员
 * @author Administrator
 *
 */
public class AddUserToCommunityRequest extends JavaCommonRequest{

	public String community_id;
	public List<String> person_list = new ArrayList<String>();
	public List<String> login_names = new ArrayList<String>();
	
	public AddUserToCommunityRequest() {
		setMethodName("community/addUserToCommunity");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		return null;
	}

	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("community_id", community_id);
		param.put("add", person_list);
		param.put("login_names", login_names);
		return param;
	}
}