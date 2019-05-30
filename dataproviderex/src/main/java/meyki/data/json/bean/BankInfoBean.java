package meyki.data.json.bean;

import java.io.Serializable;

/**
 * 响应的bean
 * 
 * @author hulei
 * 
 */
public class BankInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 911841564793235974L;
	private String logo;
	private String name;
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
