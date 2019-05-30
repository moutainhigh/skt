package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.data.client.response.QueryTradeInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/19.
 */

public class TradeInfoRequest extends JavaCommonRequest {
    public String type; //YES		0:交易记录 1：提币记录；2：充币记录
    public String userId; //YES		用户id

    public TradeInfoRequest() {
        setMethodName("v4/elicWallet/queryTradeInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("type", type);
        params.put("userId", userId);
        return params;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        QueryTradeInfoResponse qtir = new QueryTradeInfoResponse();
        if (!TextUtils.isEmpty(json)) {
            qtir = JacksonUtil.readValue(json, QueryTradeInfoResponse.class);
        }
        return qtir;
    }
}
