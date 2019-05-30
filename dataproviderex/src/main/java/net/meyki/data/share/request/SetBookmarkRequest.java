package net.meyki.data.share.request;

import android.text.TextUtils;

import com.google.gson.Gson;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;
import java.util.Map;

public class SetBookmarkRequest extends JavaCommonRequest {
	public SetBookmarkRequest() {
		this.setMethodName("shop/setFans");
		request_method = JavaJsonNetwork.TYPE_POST_DATA;
	}

	/**
	 * 参数说明：'handle'=>'add' 收藏，'handle'=>'cancel' 取消收藏
	 * */
	private String ownerId;//粉丝UUID
	private String ownerTag;
	private String handle;

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerTag() {
		return ownerTag;
	}

	public void setOwnerTag(String ownerTag) {
		this.ownerTag = ownerTag;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", this.userId);
		params.put("ownerId", this.ownerId);
		params.put("ownerTag", this.ownerTag);
		params.put("handle", this.handle);
		params.put("tag", "shop");
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		JavaCommonResponse cr = new JavaCommonResponse();
		cr.RequestSequenceId = RequestSequenceId;
		return cr;
	}

}
