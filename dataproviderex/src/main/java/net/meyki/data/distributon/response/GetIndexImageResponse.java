/**
 * 
 */
package net.meyki.data.distributon.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.distributon.domain.Slide;
import net.meyki.data.json.JavaCommonResponse;

/** 
 * @author 作者 E-mail: liyc
 * @version 创建时间：2016年4月26日 下午5:12:10 
 * 类说明    获取店铺换灯片列表响应
 */

public class GetIndexImageResponse extends JavaCommonResponse {
	
	public List<Slide> list = new ArrayList<Slide>();
}
