package net.meyki.data.client.domain;

import java.io.Serializable;

public class ImageItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1314433000361436355L;
	
	public String id;//图片保存服务器端传回的id
	public String url;//图片地址 
}
