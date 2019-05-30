package net.meyki.data.client.request;

import net.meyki.data.client.response.ApplyForReturnResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 1、申请退货
 *
 * @author liyc
 */
public class ApplyForReturnRequest extends JavaCommonRequest {
    public String isReceived; //是否收到货物0:是1：否
    public String backApplyType; //退货申请类型:0:退款；1：退货退款
    public String orderId; //当前订单id
    public String backCause; //退货原因
    public String backDesc; //退货说明
    public String backTotal; //退款申请金额
    public String img1; //退款申请凭证图片
    public String img2; //退款申请凭证图片
    public String img3; //退款申请凭证图片

    public ApplyForReturnRequest() {
        this.setMethodName("v4/v409refond/refondApply");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("isReceived", isReceived);
        params.put("backApplyType", backApplyType);
        params.put("orderId", orderId);
        params.put("backCause", backCause);
        params.put("backDesc", backDesc);
        params.put("backTotal", backTotal);
        params.put("img1", img1);
        params.put("img2", img2);
        params.put("img3", img3);
        return params;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String paramStream) {
        ApplyForReturnResponse ar = null;
        ar = FastJsonUtil.getObjectTFromJson(paramStream, ApplyForReturnResponse.class);
        return ar;
    }

}
