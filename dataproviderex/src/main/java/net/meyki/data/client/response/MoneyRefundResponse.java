package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2017/1/13.
 */
public class MoneyRefundResponse extends JavaCommonResponse {
    public String refondFee;
    public String refondTime;
    public String refondCount;
    public String coupon; //易家支付的金额
    public String payUnionType; //混合支付方式 2 支付宝与代金券 3微信与代金券 4 银联与代金券
    public String cash;//第三方支付金额（非代金券）
    public String phone;//买家账号
    public String orderBackNo;//退款编号
}
