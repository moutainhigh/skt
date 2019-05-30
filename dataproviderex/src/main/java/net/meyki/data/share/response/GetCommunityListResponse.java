package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CommunityItem;

public class GetCommunityListResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5039646556125648849L;

	public boolean hasNext;
	public String  totalRecords; 
	public String pages;	
	public String extData;	

	
	public List<CommunityItem> list = new ArrayList<CommunityItem>();
}