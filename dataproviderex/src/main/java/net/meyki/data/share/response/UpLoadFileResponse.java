package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.UpLoadBean;
/**
 * 
 * @author 上传文件时响应
 *
 */
public class UpLoadFileResponse extends JavaCommonResponse {
	private UpLoadBean upload;

	public UpLoadBean getUpload() {
		return upload;
	}

	public void setUpload(UpLoadBean upload) {
		this.upload = upload;
	}
	

}
