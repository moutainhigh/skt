package net.meyki.data.share.request;

import java.util.HashMap;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.UpLoadBean;
import net.meyki.data.share.response.UpLoadFileResponse;
/**
 * 上传文件时调用
 * @author liyc
 *
 */
public class UpLoadFileRequest extends JavaCommonRequest {

	
	public UpLoadFileRequest(){
		this.setMethodName("community/uploadphoto");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		UpLoadFileResponse ufr = new UpLoadFileResponse();
		ufr.setUpload(JacksonUtil.readValue(json, UpLoadBean.class));
		return ufr;
	}
	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getMapdata()
	 */

	/* (non-Javadoc)
	 * @see net.meyki.data.json.JavaCommonRequest#getInputMap()
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String,Object> in= new HashMap<String,Object>();
		in.put("user_id",userId);
		in.put("tag", dev_tag);
		in.put("os",dev_os);
		return in;
	}


}
