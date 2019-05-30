package net.meyki.data.share.domain;

import java.io.Serializable;
/**
 * 店铺类型实体bean
 * @author Administrator
 */
public class ShopTypeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5183883346122767740L;
	/** 店铺分类UUID */
	public String shopTypeId;
	/** 分类名称 */
	public String typeName;
	/** 分类图片 */
	public String typeSrc;

}
