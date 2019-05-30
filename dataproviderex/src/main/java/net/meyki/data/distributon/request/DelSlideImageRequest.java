/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月27日 下午7:17:51 
 * 类说明  删除幻灯片时请求
 */
public class DelSlideImageRequest extends JavaCommonRequest {

	public String slideImageId;
	
	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> in = new HashMap<String,Object>();
		in.put("slideImageId", slideImageId);
		in.put("tag", this.dev_tag);
		in.put("os", this.dev_os);
		return in;
	}

	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getOutputResponse(java.lang.String)
	 */
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}

}
