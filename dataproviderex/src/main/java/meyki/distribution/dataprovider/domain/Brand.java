package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

/**
 * 品牌列表item对应实体
 * @author liyc
 */
public class Brand extends Bran{
	private static final long serialVersionUID = 9066262261634251113L;
	private String id; 
	private String name;
	private String logo;
	private String app_mess;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getApp_mess() {
		return app_mess;
	}
	public void setApp_mess(String app_mess) {
		this.app_mess = app_mess;
	}

}
