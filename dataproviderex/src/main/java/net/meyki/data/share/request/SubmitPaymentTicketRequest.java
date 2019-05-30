package net.meyki.data.share.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.share.request
 * 项目版本：user-4.5.2
 * 创建人：Daimhim
 * 创建时间：2017/6/16 17:12
 * 修改人：Daimhim
 * 修改时间：2017/6/16 17:12
 * 类描述：
 * 修改备注：
 */

public class SubmitPaymentTicketRequest extends JavaCommonRequest {
    public String userId;   //	YES	String	付款方user_id 当前用户ID
    public String receiveUserId;   //	YES	String	收款方user_id 商铺主人userId
    public String amount;   //	YES	String	支付抵金券金额

    public SubmitPaymentTicketRequest() {
        setMethodName("v4/ticket/submitPaymentTicket");
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId", userId);
        hashMap.put("receiveUserId", receiveUserId);
        hashMap.put("amount", amount);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return null;
    }
}
