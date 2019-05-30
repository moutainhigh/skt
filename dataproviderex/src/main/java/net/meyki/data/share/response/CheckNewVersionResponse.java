package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.NewVersionBean;

public class CheckNewVersionResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8827129752251099645L;
	public NewVersionBean version = new NewVersionBean();
}
