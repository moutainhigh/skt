package net.meyki.data.share.domain;

import java.io.Serializable;
/**
 * 上传图片对应的实体bean
 * @author liyc
 *
 */
public class UpLoadBean implements Serializable {
	/**
	 * 上传图片对应的url路径
	 * */
	public String url;
	/** 上传图片的缩略图url */
	public String urlthumb;
}
