package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

import meyki.data.json.bean.BankMoneyBean;

/**
 * 获取银行卡列表实体类
 * 
 * @author Administrator
 * 
 */
public class BankMoneyResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787734915509974039L;
	/** 获取银行卡列表实体类bean */
	public List<BankMoneyBean> list = new ArrayList<BankMoneyBean>();
	public int totalRecords;
	public int pages;
	public boolean hasNext;
	public String extData = new String();
}
