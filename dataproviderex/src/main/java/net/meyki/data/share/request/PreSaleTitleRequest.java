package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;


/**
 * 新品预售轮播图图片列表请求
 * @author 许玉鹏 2016/11/4
 *
 */
public class PreSaleTitleRequest extends JavaCommonRequest {

	public PreSaleTitleRequest() {
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
