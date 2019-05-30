package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.GetRedBagRecord;
/**
 * 领取红包时服务器响应结果
 * @author Administrator
 */
public class GetRedBagResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5973077466520705595L;
	private GetRedBagRecord record;

	public GetRedBagRecord getRecord() {
		return record;
	}

	public void setRecord(GetRedBagRecord record) {
		this.record = record;
	}
}
