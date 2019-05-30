package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.TransferAccountsResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/8/26.
 */
public class TransferAccountsRequest extends JavaCommonRequest {

    public String receiveUserId;
    public String desc;
    public String money;

    public TransferAccountsRequest(){
        setMethodName("v3/transfer/affirmTransfer");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("tag", dev_tag);
        input.put("os", dev_os);
        input.put("payUserId", userId);
        input.put("receiveUserId", receiveUserId);
        input.put("money", money);
        input.put("desc", desc);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        TransferAccountsResponse rs = new TransferAccountsResponse();
        rs = JacksonUtil.readValue(json, TransferAccountsResponse.class);
        return rs;
    }
}
