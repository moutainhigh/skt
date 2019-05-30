package net.meyki.data.client.request;

import android.text.TextUtils;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 优惠券领取
 * 
 * @author liyc
 * 
 */
public class GetBoundRequest extends JavaCommonRequest {

	public GetBoundRequest() {
		setMethodName("user/getBonusClient");// 这里填写的请求的action
	}

	/***
	 * 摇一摇领取优惠券时使用
	 */
	public String tid;

	public String getBonusId() {
		return bonusId;
	}

	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}

	public String bonusId;
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}


	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		if(!TextUtils.isEmpty(bonusId)){
			params.put("bonusId", bonusId);
		}
		if(!TextUtils.isEmpty(tid)){
			params.put("tid", tid);
		}
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
