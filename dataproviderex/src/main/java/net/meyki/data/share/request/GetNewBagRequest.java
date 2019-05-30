package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.Map;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.GetRedBagRecord;
import net.meyki.data.share.response.GetRedBagResponse;
import net.meyki.data.utils.JacksonUtil;
/**
 * 社群中领取一个红包时
 * @author Administrator
 *
 */
public class GetNewBagRequest extends JavaCommonRequest {

	public String redId;
	public String message;
	
	public GetNewBagRequest(){
		this.setMethodName("community/pullRedPacket");
	}	
		
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String, Object>();
		in.put("user_id", userId);
		in.put("tag", dev_tag);
		in.put("os", dev_os);
		in.put("red_packet_id",redId);
		in.put("message", message);
		return in;
	}
	
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetRedBagResponse gbr = new GetRedBagResponse();		
		gbr.setRecord(JacksonUtil.readValue(json, GetRedBagRecord.class));
		return gbr;
	}

}
