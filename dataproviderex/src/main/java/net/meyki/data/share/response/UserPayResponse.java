package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * 用户支付响应
 * Created by Administrator on 2016/5/5.
 */
public class UserPayResponse extends JavaCommonResponse {

    /** paytype 为4的时候，tn有值，其他情况无值 */
    public String tn;
    /** 充值单号 */
    public String bn;
    public String signInfo;//支付宝和微信调起客户端的字符串


}
