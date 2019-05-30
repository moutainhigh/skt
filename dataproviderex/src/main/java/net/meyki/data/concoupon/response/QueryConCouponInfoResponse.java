package net.meyki.data.concoupon.response;

import net.meyki.data.concoupon.domain.SendConCouponInfoBean;
import net.meyki.data.json.JavaCommonResponse;

/**
 * 我的-派券管理-派券首页信息
 * Created by Knight on 2017/3/23.
 */

public class QueryConCouponInfoResponse extends JavaCommonResponse{

    public SendConCouponInfoBean data = new SendConCouponInfoBean();
}
