package net.meyki.data.share.request;

import android.text.TextUtils;
import org.codehaus.jackson.type.TypeReference;
import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.BoundDetailResponse;
import java.util.HashMap;


/**
 *优惠劵详情
 * */
public class BoundDetailRequest extends JavaCommonRequest {

	private String bonus_id;

	public String getBonus_id() {
		return bonus_id;
	}

	public void setBonus_id(String bonus_id) {
		this.bonus_id = bonus_id;
	}

	public BoundDetailRequest() {
		this.setMethodName("user/getBonusInfoClient");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", this.userId);
		if (!TextUtils.isEmpty(bonus_id)) {
			params.put("bonusNo", bonus_id);
		}
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		if (null == paramStream) {
			return null;
		}
		BoundDetailResponse br = JacksonUtil.readValue(paramStream, new TypeReference<BoundDetailResponse>() {
		});
		return br;
	}

}
