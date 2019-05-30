package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.Map;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.RedBagInfo;
import net.meyki.data.share.response.GetRedBagDetailResponse;
import net.meyki.data.utils.JacksonUtil;
/**
 * 获取红包详细页面
 * @author liyc
 *
 */
public class GetRedBagDetailRequest extends JavaCommonRequest {

	public String redId;
	
	public GetRedBagDetailRequest(){
		this.setMethodName("community/getRedpacketDetail");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String, Object>();
		in.put("user_id", userId);
		in.put("tag", dev_tag);
		in.put("os", dev_os);
		in.put("red_packet_id", redId);
		return in;
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetRedBagDetailResponse gbr = new GetRedBagDetailResponse();
		gbr.redBag = JacksonUtil.readValue(json, RedBagInfo.class);
		return gbr;
	}
}
