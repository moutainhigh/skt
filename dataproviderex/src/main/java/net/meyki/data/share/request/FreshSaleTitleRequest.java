package net.meyki.data.share.request;

import android.text.TextUtils;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.UserLoginBean;
import net.meyki.data.share.response.UserLoginResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;


/**
 * 时令抢鲜轮播图图片列表请求
 * @author 许玉鹏 2016/11/4
 *
 */
public class FreshSaleTitleRequest extends JavaCommonRequest {

	public FreshSaleTitleRequest() {
		this.setMethodName("v3/user/login");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		return null;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}
}
