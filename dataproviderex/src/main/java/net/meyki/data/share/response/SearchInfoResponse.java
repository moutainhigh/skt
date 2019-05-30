package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.SearchInfo;

import java.util.ArrayList;
import java.util.List;

public class SearchInfoResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144997302908227530L;
	/**
	 * 
	 */
	public List<SearchInfo> list = new ArrayList<SearchInfo>();
}
