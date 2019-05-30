package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TransferAccountsReceiveRequest extends JavaCommonRequest {

    public String transferId;

    public TransferAccountsReceiveRequest(){
        setMethodName("v3/transfer/affirmReceipt");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("tag", dev_tag);
        input.put("os", dev_os);
        input.put("userId", userId);
        input.put("transferId", transferId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}
