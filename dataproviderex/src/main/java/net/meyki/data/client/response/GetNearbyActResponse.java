package net.meyki.data.client.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.client.domain.NearActListItem;
import net.meyki.data.json.JavaCommonResponse;

public class GetNearbyActResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8827129752251099645L;
	public List<NearActListItem> list= new ArrayList<NearActListItem>();
	public String totalRecords;
	public String pages;
	public boolean hasNext;
	public String extData;

	public String getExtData() {
		return extData;
	}

	public void setExtData(String extData) {
		this.extData = extData;
	}


	public List<NearActListItem> getList() {
		return list;
	}

	public void setList(List<NearActListItem> list) {
		this.list = list;
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
}
