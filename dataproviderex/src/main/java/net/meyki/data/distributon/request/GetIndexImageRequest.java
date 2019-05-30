/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.distributon.response.GetIndexImageResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月26日 下午4:40:18 
 * 类说明   获取店铺幻灯片信息
 */

public class GetIndexImageRequest extends JavaCommonRequest {
	
	
	public GetIndexImageRequest(){
		this.setMethodName("shop/getIndexImgs");
	}
	

	/* (non-Javadoc)
	 * @see net.meyki.app.data.json.JavaCommonRequest#getOutputResponse(java.lang.String)
	 */
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetIndexImageResponse gir = new GetIndexImageResponse();
		JacksonUtil.readValue(json,GetIndexImageResponse.class);
//		gir.list  = JacksonUtil.readValue(json, new  TypeReference<List<Slide>>() {});
		return gir;
	}


	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("shopId", shopId);
		in.put("tag", dev_tag);
		in.put("os", this.dev_os);
		return in; 
	}

}
