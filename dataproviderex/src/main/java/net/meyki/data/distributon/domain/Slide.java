package net.meyki.data.distributon.domain;
/**
 * 幻灯片对应的实体类
 * @author liyc
 */
public class Slide {
	/** 幻灯片id */
	private String slideImageId;
	/** 幻灯片对应的url路径 */
	private String imgSrc;
	public String getSlideImageId() {
		return slideImageId;
	}
	public void setSlideImageId(String slideImageId) {
		this.slideImageId = slideImageId;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	
}
