package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.IncomeDetailResponse;
import net.meyki.data.share.response.TakeCashRecodeResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 收支明细
 * 
 * @author liyc
 * 
 */
public class InComeDetailRequest extends JavaCommonRequest {
	public String bankId;
	public String bankNo;
	public String pageNo;
	public String pageSize;

	public InComeDetailRequest() {
		this.setMethodName("user/getMoneyLogList");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		IncomeDetailResponse br = new IncomeDetailResponse();
		br = JacksonUtil.readValue(json, IncomeDetailResponse.class);
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
