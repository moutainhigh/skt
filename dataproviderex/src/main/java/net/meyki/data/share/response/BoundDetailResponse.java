package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.BroundBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 优惠券详细数据响应
 * @author liyc
 *
 */
public class BoundDetailResponse extends JavaCommonResponse {
 	
 	/************* 我的 优惠券详细   ***************/
 	public String bonusNo;//优惠券数字
 	public String shopImg;//优惠券店铺logo
 	public String url;//优惠券二维码图片
 	public String shopName;//店铺名称
 	public int isCheck;//表示用户认证状态1.未认证2.已认证3.审核中-1.审核失败

}
