package meyki.distribution.dataprovider.bean;

import java.io.Serializable;

public class InfoResult  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5052776601836640768L;
	private String internal_id = "";
	private Integer type;
	private String result;
	private String message;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInternal_id() {
		return internal_id;
	}
	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
