package meyki.distribution.dataprovider.domain;

import java.util.List;

/**
 * 向服务器发起一个响应
 * @author liyc
 *
 */
public class GsonResult {
	
	/** 响应结果*/
	private Result result;
	/** 加密以后的字符串*/
	private String code;
	/** 操作失败的留言信息，主要是操作失败时输出，方便调试 */
	private String message;
	/** code值对应的domain实体 */
	public Result res;
	
	private GsonCode gsoncode;
	
	
	public Result getRes() {
		return res;
	}

	public void setRes(Result res) {
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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
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
