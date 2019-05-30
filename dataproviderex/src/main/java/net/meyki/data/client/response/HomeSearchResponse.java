package net.meyki.data.client.response;

import net.meyki.data.client.domain.HomeSearchBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

public class HomeSearchResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2561290964247180613L;
	
	public List<HomeSearchBean> list = new ArrayList<>() ;
	public boolean hasNext; // 是否有下一页
	public String totalRecords;//总记录条数
	public String pages;//当前返回页数
}
