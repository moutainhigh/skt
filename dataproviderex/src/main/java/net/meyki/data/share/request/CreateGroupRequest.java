package net.meyki.data.share.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CommunityItem;
import net.meyki.data.share.response.CreateGroupResponse;
import net.meyki.data.utils.JacksonUtil;

public class CreateGroupRequest extends JavaCommonRequest {

	public String user_id;
	public String login_name;
	public List<String> add = new ArrayList<String>();
	public List<String> login_names = new ArrayList<String>();

	public CreateGroupRequest() {
		// TODO Auto-generated method stub
		setMethodName("community/createCommunity");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		CreateGroupResponse cr = new CreateGroupResponse();
		cr.mCommunityItem = (CommunityItem) JacksonUtil.readValue(paramStream,new TypeReference<CommunityItem>() {});
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", user_id);
		param.put("login_name", login_name);
		param.put("add", add);
		param.put("login_names", login_names);
		return param;
	}
}