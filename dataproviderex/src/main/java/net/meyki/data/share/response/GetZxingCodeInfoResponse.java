package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.PaymentBean;
import net.meyki.data.share.domain.ZxingCodeInfoBean;

public class GetZxingCodeInfoResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144997302908227530L;
	/**
	 * 
	 */
	public ZxingCodeInfoBean zxingCode = new ZxingCodeInfoBean();
}
