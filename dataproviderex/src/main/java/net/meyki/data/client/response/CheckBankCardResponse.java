package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

import meyki.data.json.bean.BankInfoBean;

/**
 * 获取银行卡列表实体类
 * @author Administrator
 *
 */
public class CheckBankCardResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787734915509974039L;
	/**  获取银行卡列表实体类bean */
	public List<BankInfoBean> all = new ArrayList<BankInfoBean>();
}
