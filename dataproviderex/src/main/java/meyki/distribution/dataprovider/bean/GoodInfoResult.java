package meyki.distribution.dataprovider.bean;

import java.io.Serializable;

import meyki.distribution.dataprovider.domain.Result;


public class GoodInfoResult implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GoodBean data;
	
	private String message;
	
	private Result result;

	public GoodBean getData() {
		return data;
	}

	public void setData(GoodBean data) {
		this.data = data;
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

	@Override
	public String toString() {
		return "GoodInfoResult [data=" + data + ", message=" + message
				+ ", result=" + result + "]";
	}

}
