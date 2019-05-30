package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;


/**
 * 会员打折、会员赠品
 *
 */
public class NewSetFansRequest extends JavaCommonRequest {
		public NewSetFansRequest(){
			setMethodName("community/setFanBySearch");
		}
	public  String ownerId;
	public String ownerTag;
	public String handle;
	public String remarks;

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		params.put("ownerId", ownerId);
		params.put("ownerTag", ownerTag);
		params.put("handle", handle);
		params.put("remarks",remarks);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
