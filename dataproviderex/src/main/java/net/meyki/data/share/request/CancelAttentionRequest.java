/**
 * 
 */
package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年5月5日 下午7:37:31 
 * 类说明  取消用户关注
 */

public class CancelAttentionRequest extends JavaCommonRequest {
	public CancelAttentionRequest(){
		this.setMethodName("shop/setFans");
	}
	public String ownerId;
	
	public String ownerTag;
	
	public String handle;
	
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("userId", userId);
		in.put("ownerId", ownerId);
		in.put("ownerTag", ownerTag);
		in.put("handle", handle);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}

}
