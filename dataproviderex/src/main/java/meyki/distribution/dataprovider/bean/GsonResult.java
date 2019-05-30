package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.List;

import meyki.distribution.dataprovider.domain.Result;


/**
 * 向服务器发起一个响应
 * @author liyc
 *
 */
public class GsonResult implements Serializable{
	private static final long serialVersionUID = -6629400357128848593L;
	/** 响应结果*/
	private String result;
	/** 加密以后的字符串*/
	private String code;
	/** 操作失败的留言信息，主要是操作失败时输出，方便调试 */
	private String message;
	/** code值对应的domain实体 */
	public String res;
	
	private GsonCode gsoncode;
	
	
	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	/** 响应回来的数据*/
	public GsonCode getGsoncode() {
		return gsoncode;
	}

	public void setGsoncode(GsonCode gsoncode) {
		this.gsoncode = gsoncode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "GsonResult [result=" + result + ", code=" + code + ", message="
				+ message + ", res=" + res + ", gsoncode=" + gsoncode + "]";
	}



}
