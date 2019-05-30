package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 判断环信电话状态
 * @author Administrator
 *
 */
public class HxCallRequest extends JavaCommonRequest {

	public String from;
	public String to;
	public String flag;
	/** 群组id */
	/**
	 * 使用构造器传入参数名称
	 */
	public HxCallRequest(){
		this.setMethodName("community/hxCall");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String, Object>();
		in.put("from", from);
		in.put("to", to);
		in.put("flag", flag);
		return 	in;
	}

}
