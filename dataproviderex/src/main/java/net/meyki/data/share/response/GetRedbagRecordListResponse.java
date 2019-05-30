package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.GetRedBagRecord;
import net.meyki.data.share.domain.RedBagListItem;
/**
 * 
 * 获取红包领取记录响应结果
 * @author Administrator
 *
 */
public class GetRedbagRecordListResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 860402317584892438L;
	
	public String totalRecords;
	public String pages;
	public Boolean hasNext;
	public String extData;
	public List<RedBagListItem> list = new ArrayList<RedBagListItem>();	
}
