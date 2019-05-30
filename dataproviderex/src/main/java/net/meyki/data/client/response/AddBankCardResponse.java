package net.meyki.data.client.response;


import net.meyki.data.client.domain.AddBankCardBean;
import net.meyki.data.json.JavaCommonResponse;

/**
 * 获取银行卡列表实体类
 * @author Administrator
 *
 */
public class AddBankCardResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787734915509974039L;
	/**  获取银行卡列表实体类bean */
	public AddBankCardBean addBank = new AddBankCardBean();
}
