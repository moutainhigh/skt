package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.Map;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.BuildRedBagResponse;
import net.meyki.data.utils.JacksonUtil;
/**
 * 群组中发一个红包时调用
 * @author Administrator
 *
 */
public class BuildRedBagRequest extends JavaCommonRequest {
	
	/** 设置红包金额  */
	public String money;
	 /** 红包数量 */
	public String count;  
	/** 推送json消息内容  */
	public String content;
	/** 群组id */
	public String community_id;
	
	public String login_name;
	
	/**
	 * 使用构造器传入参数名称
	 */
	public BuildRedBagRequest(){
		this.setMethodName("community/createRedPacket");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		BuildRedBagResponse rs = new BuildRedBagResponse();
		rs = JacksonUtil.readValue(json, BuildRedBagResponse.class);
		return rs;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String, Object>();
		in.put("user_id", userId);
		in.put("total_money", money);
		in.put("count", count);
		in.put("content", content);
		in.put("community_id", community_id);
		in.put("login_name", login_name);
		return 	in;
	}

}
