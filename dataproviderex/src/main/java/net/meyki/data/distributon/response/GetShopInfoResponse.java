package net.meyki.data.distributon.response;

import net.meyki.data.distributon.domain.StoreBean;
import net.meyki.data.json.JavaCommonResponse;
/**
 * 获取店铺信息响应
 * @author liyc
 * @version 2016.4.26 
 */
public class GetShopInfoResponse extends JavaCommonResponse {
	
	public StoreBean store = new StoreBean();
	
}
