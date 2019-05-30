package net.meyki.data.client.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.ActChargeItem;

import java.util.ArrayList;
import java.util.List;

public class ActGetChargeDetailResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4688960317750664268L;
	
	public String type;
	public String startTime;
	public String endTime;
	public List<ActChargeItem> amountArray = new ArrayList<ActChargeItem>();// 充值信息
	public String amount;
	public String activesName;
	public String descs;
	public String activesId;
	public String status;
}
