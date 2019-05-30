package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.PaymentBean;
import net.meyki.data.share.domain.PaymentCountBean;
import net.meyki.data.share.domain.ZxingCodeInfoBean;

public class GetBillsInfoResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6269379060172824910L;
	public PaymentCountBean payCount = new PaymentCountBean();
}
