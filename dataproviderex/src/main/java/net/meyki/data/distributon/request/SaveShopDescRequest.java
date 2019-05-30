/**
 * 
 */
package net.meyki.data.distributon.request;

import java.util.HashMap;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月27日 下午6:39:53 
 * 类说明  保存店铺简介请求
 */

public class SaveShopDescRequest extends JavaCommonRequest {
	
	public String shopDesc;
	
	public SaveShopDescRequest(){
		this.setMethodName("shop/saveShopDesc");
	}
	
	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("shopId", shopId);
		in.put("shopDesc", shopDesc);
		in.put("tag", dev_tag);
		in.put("os", dev_os);
		return in;
	}
	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}

}
