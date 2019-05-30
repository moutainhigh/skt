package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.CommunityMemberItem;

public class GetFriendsListResponse extends JavaCommonResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5039646556125648849L;
	
	
	public List<CommunityMemberItem> list = new ArrayList<CommunityMemberItem>();

}