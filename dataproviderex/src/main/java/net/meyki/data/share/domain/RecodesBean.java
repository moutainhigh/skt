package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 响应的bean
 * 
 * @author hulei
 * 
 */
public class RecodesBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5270012146398615528L;
	private String money;
	private String message;
	private String createTime;
	private String id;
	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
