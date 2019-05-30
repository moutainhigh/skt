package net.meyki.data.share.request;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.share.response.UserPayResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 用户支付时调用
 * Created by Administrator on 2016/5/5.
 */
public class UserPayRequest extends JavaCommonRequest{
    /** 支付方式： 1 支付宝 2 微信 3银联 */
    public String paytype;
    public String payMethod;
    /** 订单编号 */
    public String orderSn;
    /** 订单id  */
    public String orderId;
    /** 支付金额 */
    public String payMoney;

    public UserPayRequest(){
        this.setMethodName("superiorProducts/payment");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
        requestType = OkHttpUtil.RequestType.POST;
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = initHashMap();
        in.put("userId",userId);
        if(!TextUtils.isEmpty(paytype)){
            in.put("payType",paytype);
        }
        if(!TextUtils.isEmpty(payMethod)){
            in.put("payMethod",payMethod);
        }
        in.put("shopId",shopId);
        in.put("orderId",orderId);
        in.put("orderSn",orderSn);
        in.put("payMoney",payMoney);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        UserPayResponse upr = JSON.parseObject(json,UserPayResponse.class);
        return upr;
    }

}
