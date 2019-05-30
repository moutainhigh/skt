package net.meyki.data.share.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.ZxingCodeInfoBean;
import net.meyki.data.share.response.GetZxingCodeInfoResponse;

import java.util.HashMap;

/**
 * 付款  请求二维码
 * 
 * @author
 * 
 */
public class GetZxingCodeInfoRequest extends JavaCommonRequest {
	public GetZxingCodeInfoRequest() {
		this.setMethodName("user/getUserQrInfo");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
//		GetZxingCodeInfoResponse er = 	JSON.parseObject(json, GetZxingCodeInfoResponse.class);
		GetZxingCodeInfoResponse er = new GetZxingCodeInfoResponse();
		er.zxingCode = JSON.parseObject(json, ZxingCodeInfoBean.class);
		return er;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		return in;
	}

}
