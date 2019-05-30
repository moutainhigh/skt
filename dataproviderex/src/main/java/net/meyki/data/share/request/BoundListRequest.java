package net.meyki.data.share.request;

import android.text.TextUtils;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.BoundResponse;
import java.util.HashMap;

public class BoundListRequest extends JavaCommonRequest {
	public BoundListRequest() {
		this.setMethodName("user/getBonusListClient");
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", this.userId);
		if (!TextUtils.isEmpty(status)) {
			params.put("status", status);
		}
		if (!TextUtils.isEmpty(pageNo)) {
			params.put("pageNo", pageNo);
		}
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		if (null == paramStream) {
			return null;
		}
		BoundResponse br = JacksonUtil.readValue(paramStream, new TypeReference<BoundResponse>() {
		});
		return br;
	}

}
