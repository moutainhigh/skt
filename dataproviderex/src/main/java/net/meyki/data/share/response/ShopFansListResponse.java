package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CommunityMemberItem;
import net.meyki.data.share.domain.ShopFansListItem;

public class ShopFansListResponse extends JavaCommonResponse{

	public String extData;
	public int totalRecords;
	public int pages;
	public boolean hasNext;
	
	public List<ShopFansListItem> list = new ArrayList<ShopFansListItem>();
		
}
