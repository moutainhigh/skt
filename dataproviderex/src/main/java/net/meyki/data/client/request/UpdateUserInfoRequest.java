package net.meyki.data.client.request;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.TransferConResponse;
import net.meyki.data.client.response.UpdateUserInfoReponse;
import net.meyki.data.client.response.UpdateUserPhotoReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.share.domain.UserLoginBean;
import net.meyki.data.share.response.UserLoginResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 2、保存用户昵称,性别,用户logo的接口
 * 
 * @author liyc
 * 
 */
public class UpdateUserInfoRequest extends JavaCommonRequest {

	public UpdateUserInfoRequest() {
		this.setMethodName("user/saveUserInfo");
//		this.request_method = JavaJsonNetwork.TYPE_POST_DATA;
	}

	private String userId;// 用户ID
	private String userPhoto;// 头像url"，
	private String userName;// 用户ID
	private String userSex;// 1/0, 0-女 ； 1-男 2- 保密

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> hashMap = initHashMap();
		hashMap.put("userId", userId);
		if (!TextUtils.isEmpty(userName)) {
			hashMap.put("nickName", userName);
		}
		if (!TextUtils.isEmpty(userSex)) {
			hashMap.put("sex", userSex);
		}
		return hashMap;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return JSON.parseObject(json, UpdateUserInfoReponse.class);
	}

}
