/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;
import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.distributon.domain.Slide;
import net.meyki.data.distributon.response.SaveSlideImageResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: liyc
 * @version 创建时间：2016年4月27日 下午2:14:00 
 * 类说明  保存幻灯片接口请求
 */

public class SaveSlideImageRequest extends JavaCommonRequest {
	
	private String userId;
	
	private String shopId;
	
	public SaveSlideImageRequest(){
		this.setMethodName("shop/saveIndexImage");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("shopId", shopId);
		in.put("userId", userId);
		in.put("tag", userId);
		in.put("os", dev_os);
		return in;
	}


	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getOutputResponse(java.lang.String)
	 */
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		SaveSlideImageResponse  sar = new SaveSlideImageResponse();
		sar.slide = JacksonUtil.readValue(json, Slide.class);
		return sar;
	}

}
