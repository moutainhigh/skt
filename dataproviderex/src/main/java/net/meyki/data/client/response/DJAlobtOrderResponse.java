package net.meyki.data.client.response;

import net.meyki.data.client.domain.DJAlobtOrderBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 已消费消费卷订单
 * Created by lxy on 2017/4/7 0007.
 */
public class DJAlobtOrderResponse extends JavaCommonResponse {
    public String consumeAmount;//					out		String				OPTION		消费总金额
    public String goodsCount;//					out		String				OPTION		商品件数
    public String payMoney;//					out		String				OPTION		实际付款
    public String cashCouponAmount;//					out		String				OPTION			抵金券金额
    public List<DJAlobtOrderBean> list = new ArrayList<>();//					out		JSONArray


}
