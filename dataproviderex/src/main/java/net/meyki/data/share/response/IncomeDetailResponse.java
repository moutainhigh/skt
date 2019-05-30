package net.meyki.data.share.response;

import net.meyki.data.client.domain.IncomeDetailGroupBean;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.RecodesBean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * @author Administrator
 * 
 */
public class IncomeDetailResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787734915509974039L;

	public List<IncomeDetailGroupBean> list = new ArrayList<IncomeDetailGroupBean>();
	public String totalRecords;
	public String pages;
	public boolean hasNext;
	public Object extData = new Object();
}
