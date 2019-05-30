package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.BroundBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 优惠券列表详细数据响应
 * @author liyc
 *
 */
public class BoundResponse extends JavaCommonResponse {
	public String extData;
	public String totalRecords;
	public String pages;
	public boolean hasNext;
	/************* 我的优惠券列表  ***************/
 	public List<BroundBean> list = new ArrayList<BroundBean>();//列表时用到
}
