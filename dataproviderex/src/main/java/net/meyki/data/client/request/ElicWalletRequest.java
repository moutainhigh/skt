package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by hl on 2017/1/19.
 * 提币
 */
public class ElicWalletRequest extends JavaCommonRequest {

    public ElicWalletRequest() {
        this.setMethodName("v4/elicWallet/currency");
    }
    public String money;
    public String address;
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("userId", userId);
        param.put("money", money);
        param.put("address", address);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}
