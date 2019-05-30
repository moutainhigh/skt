package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetShopTypeListResponse;

public class GetShopTypeListRequest extends JavaCommonRequest {
	public int defaulty;
	public int tag;
	public GetShopTypeListRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("shop/getShopTypes");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		GetShopTypeListResponse cr = new GetShopTypeListResponse();
//		String data = ansyisCommonArrayResponse(cr, paramStream).toString();
//		Object obj = JSON.parseObject(paramStream).get("list");
//				if(obj!=null){
//					
//				}
//				.toString();
//		String data = ansyisCommonArrayResponse(cr, paramStream).toString();
//		if(!TextUtils.isEmpty(list)){
		cr = JacksonUtil.readValue(paramStream,GetShopTypeListResponse.class);
//		}
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("default", defaulty);
		param.put("tag", tag);
		return param;
	}

}
