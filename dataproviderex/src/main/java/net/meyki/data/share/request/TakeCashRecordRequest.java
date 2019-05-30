package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.TakeCashRecodeResponse;
import net.meyki.data.utils.JacksonUtil;

/**
 * 用户登录请求
 * 
 * @author liyc
 * 
 */
public class TakeCashRecordRequest extends JavaCommonRequest {
	public String bankId;
	public String bankNo;
	public String pageNo;
	public String pageSize;

	public TakeCashRecordRequest() {
		this.setMethodName("user/getMoneyLogList");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		TakeCashRecodeResponse br = new TakeCashRecodeResponse();
		br = JacksonUtil.readValue(json, TakeCashRecodeResponse.class);
		return br;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("pageNo", pageNo);
		in.put("userId", userId);
		in.put("pageSize", pageSize);
		return in;
	}

}
