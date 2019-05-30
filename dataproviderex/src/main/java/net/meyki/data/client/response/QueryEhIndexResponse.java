package net.meyki.data.client.response;


import net.meyki.data.client.domain.itemListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

public class QueryEhIndexResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4688960317750664268L;
	
	public List<itemListBean> itemList = new ArrayList<itemListBean>();

	public String imgDomain;

	public String apiHttpDomain;
}
