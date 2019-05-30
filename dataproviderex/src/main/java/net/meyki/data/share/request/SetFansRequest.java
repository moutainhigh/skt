package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;


/**
 *  添加好友，关注店铺
 *
 */
public class SetFansRequest extends JavaCommonRequest {

	public  String ownerId;
	public String ownerTag;
	public String handle;

	public SetFansRequest(){
		setMethodName("shop/setFans");
		this.requestType = OkHttpUtil.RequestType.POST;
		this.request_method = JavaJsonNetwork.TYPE_POST_DATA;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params =initHashMap();
		params.put("userId", userId);
		params.put("ownerId", ownerId);
		params.put("ownerTag", ownerTag);
		params.put("handle", handle);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
