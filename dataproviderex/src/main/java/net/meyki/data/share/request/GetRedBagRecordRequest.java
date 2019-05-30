package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetRedbagRecordListResponse;
import net.meyki.data.utils.JacksonUtil;


/**
 * 获取红包领取记录时请求
 * @author liyc
 */
public class GetRedBagRecordRequest extends JavaCommonRequest {

	public String redId;
	
	public GetRedBagRecordRequest(){
		this.setMethodName("community/getRedPacketList");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetRedbagRecordListResponse grr = new GetRedbagRecordListResponse();
		grr = JacksonUtil.readValue(json, GetRedbagRecordListResponse.class);
		return grr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("user_id", userId);
		in.put("tag", dev_tag);
		in.put("os", dev_os);
		in.put("red_packet_id", redId);
		in.put("pageNo", pageNo);
		in.put("pageSize", pageSize);
		return in;
	}
}
