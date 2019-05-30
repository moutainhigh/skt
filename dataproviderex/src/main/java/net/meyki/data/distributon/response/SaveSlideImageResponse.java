/**
 * 
 */
package net.meyki.data.distributon.response;

import net.meyki.data.distributon.domain.Slide;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * 保存幻灯片响应
 * @author 作者 E-mail: liyc
 * @version 创建时间：2016年4月27日 下午2:26:03 
 * 类说明 
 */

public class SaveSlideImageResponse extends JavaCommonResponse {
	/** 上传幻灯片url*/
	public Slide slide = new Slide();
}
