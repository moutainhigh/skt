package net.meyki.data.share.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetCustomerResponse;

import java.util.HashMap;

/**
 * 判断环信电话状态
 * @author Administrator
 *
 */
public class GetCustomerRequest extends JavaCommonRequest {


	/** 群组id */
	/**
	 * 使用构造器传入参数名称
	 */
	public GetCustomerRequest(){
		this.setMethodName("v3/homepageItem/getESQ");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetCustomerResponse cr = new GetCustomerResponse();
		cr= JacksonUtil.readValue(json, GetCustomerResponse.class);
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String, Object>();
		return 	in;
	}

}
