package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CheckPaymentStatusBean;

public class CheckPaymentStatusResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144997302908227530L;
	/**
	 * 
	 */
	public CheckPaymentStatusBean status = new CheckPaymentStatusBean();
}
