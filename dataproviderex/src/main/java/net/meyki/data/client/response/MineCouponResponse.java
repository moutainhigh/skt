package net.meyki.data.client.response;

import net.meyki.data.client.domain.MinCouponBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/28.
 */
public class MineCouponResponse extends JavaCommonResponse {
    public String totalAmount;		//				String								YES		消费券总金额
    public List<MinCouponBean> list = new ArrayList<>();		//		JSONArray								YES

//
}
