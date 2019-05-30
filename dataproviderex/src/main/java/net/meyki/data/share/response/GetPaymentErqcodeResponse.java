package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.PaymentBean;

public class GetPaymentErqcodeResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144997302908227530L;
	/**
	 * 
	 */
	public PaymentBean payment = new PaymentBean();
}
