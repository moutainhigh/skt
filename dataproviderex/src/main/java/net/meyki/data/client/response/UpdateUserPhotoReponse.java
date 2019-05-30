package net.meyki.data.client.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.BroundBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户头像上传
 * @author liyc
 *
 */
public class UpdateUserPhotoReponse extends JavaCommonResponse {
	public String impsrc;

	public String getImg() {
		return impsrc;
	}

	public void setImg(String img) {
		this.impsrc = img;
	}
}
