package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
/**
 * 商品 规格类 
 * @see 在处理服务端返回商品详细信息时用到
 * 
 */
public class Spec implements Serializable{

	/** 规格标题 */
	private String title;
	
	private String info;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
