package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 响应的bean
 * 
 * @author hulei
 * 
 */
public class AddBankCardBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8123878232493371476L;
	private String realName;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	
}
