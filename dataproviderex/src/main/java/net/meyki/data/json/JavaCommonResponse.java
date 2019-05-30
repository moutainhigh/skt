package net.meyki.data.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.meyki.skt.bean.PlaceList;

public class JavaCommonResponse implements Serializable {
	private static final long serialVersionUID = -5179413731080922863L;	
	/** 返回请求id */
	public String Response_id;
	/** 请求序列编号 */
	public int RequestSequenceId;
	/** 0:1(成功：失败) */
	public int result;
	/** 错误信息 */
	public String ErrMsg;
	/** 错误信息码 */
	public String ErrCode;
	public String token=null;

	private List<PlaceList> results = new ArrayList<PlaceList>();
	
	public List<PlaceList> getObj() {
		// TODO Auto-generated method stub
		return results;
	}	
	
	public void setObj(List<PlaceList> results) {
		// TODO Auto-generated method stub
		this.results = results;
	}	
}