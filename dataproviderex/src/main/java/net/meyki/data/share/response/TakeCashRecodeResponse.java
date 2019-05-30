package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.RecodesBean;

/**
 * 获取银行卡列表实体类
 * 
 * @author Administrator
 * 
 */
public class TakeCashRecodeResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787734915509974039L;
	/** 获取银行卡列表实体类bean */
	public List<RecodesBean> list = new ArrayList<RecodesBean>();
	public String totalRecords;
	public String pages;
	public boolean hasNext;
	public Object extData = new Object();
}
