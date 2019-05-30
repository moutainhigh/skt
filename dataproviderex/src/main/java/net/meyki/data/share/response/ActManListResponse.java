package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.ActListItem;
import net.meyki.data.share.domain.ActManListItem;

import java.util.ArrayList;

/**
 * 会员活动接口响应回来的数据
 * @author Administrator
 *
 */
public class ActManListResponse extends JavaCommonResponse {


	public String extData;
	public String totalRecords;
	public String pages;
	public boolean hasNext;

	public String getExtData() {
		return extData;
	}

	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(String totalRecords) {
		this.totalRecords = totalRecords;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public ArrayList<ActManListItem> getList() {
		return List;
	}

	public void setList(ArrayList<ActManListItem> list) {
		List = list;
	}

	public ArrayList<ActManListItem> List= new ArrayList<ActManListItem>();
}
