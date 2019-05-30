package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;


public class ModifyCommunityInfoRequest extends JavaCommonRequest{

	public String login_name;
	public String community_id;
	public String project_key;
	public String project_value;
	public static final String cname_key = "cname";
	public static final String cintroduce_key = "cintroduce";
	public static final String caddress_key = "caddress";
	public static final String clat_key = "clat";
	public static final String clng_key = "clng";
	public static final String cphoto_key = "cphoto";
	
	
	public ModifyCommunityInfoRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/modifyCommunityInfo");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("login_name", login_name);
		param.put("community_id", community_id);		
		param.put(project_key, project_value);		
		return param;
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
