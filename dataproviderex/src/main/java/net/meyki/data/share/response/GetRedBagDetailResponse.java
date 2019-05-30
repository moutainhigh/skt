package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.RedBagInfo;

/**
 * 红包详细页面响应
 * @author Administrator
 */
public class GetRedBagDetailResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8247405788190618142L;
	
	public RedBagInfo redBag;
}
