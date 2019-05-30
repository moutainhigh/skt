package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 用户登录请求
 * 
 * @author hulei
 * 
 */
public class SaveBankCardRequest extends JavaCommonRequest {
	public String bankUser;
	public String bankNo;
	public String bankName;
	public String logo;
	public String cityCode;
	public String provinceCode;
	public String adder;

	public SaveBankCardRequest() {
		this.setMethodName("user/saveBank");
		requestType = OkHttpUtil.RequestType.POST;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		in.put("bankUser", bankUser);
		in.put("bankNo", bankNo);
		in.put("bankName", bankName);
		in.put("cityCode", cityCode);
		in.put("provinceCode", provinceCode);
		in.put("logo", logo);
		in.put("adder", adder);
		return in;
	}

}
