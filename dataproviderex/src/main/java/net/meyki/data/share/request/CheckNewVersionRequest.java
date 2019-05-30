package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.NewVersionBean;
import net.meyki.data.share.response.CheckNewVersionResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class CheckNewVersionRequest extends JavaCommonRequest {

	public String versionCode;

	public CheckNewVersionRequest() {
		setMethodName("index/verifyAppVersion");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		CheckNewVersionResponse cc = new CheckNewVersionResponse();
		cc.version = JacksonUtil.readValue(paramStream, NewVersionBean.class);
		return cc;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("versionCode", versionCode);
		return in;
	}

}
