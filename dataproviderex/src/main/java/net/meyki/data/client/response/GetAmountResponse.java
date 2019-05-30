package net.meyki.data.client.response;

import net.meyki.data.client.domain.AmountBean;
import net.meyki.data.client.domain.ImageItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

public class GetAmountResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2561290964247180613L;

	public List<AmountBean> list = new ArrayList<>()			;			//	JSONArray
	public String amountTotal	;			//	out		String								YES		消费券总金额
	public String getAmountTotal;			//		out		String								YES		消费券领取总金额
	public String amountUse		;			//out		String								YES		消费券消费总金额
}
