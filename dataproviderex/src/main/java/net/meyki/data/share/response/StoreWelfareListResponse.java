package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.WelfareListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * 店铺免费福利列表响应回来的数据
 * @author liyc
 *
 */
public class StoreWelfareListResponse extends JavaCommonResponse {
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

	public List<WelfareListItem> getList() {
		return list;
	}

	public void setList(List<WelfareListItem> list) {
		this.list = list;
	}

	public List<WelfareListItem> list  = new ArrayList<WelfareListItem>();//免费福利列表数据
}
