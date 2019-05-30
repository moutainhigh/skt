package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.TransferAccountsDetailResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TransferAccountsDetailRequest extends JavaCommonRequest {

    public String transferId;

    public TransferAccountsDetailRequest(){
        setMethodName("v3/transfer/viewTransfer");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("userId", userId);
        input.put("tag", dev_tag);
        input.put("os", dev_os);
        input.put("transferId", transferId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        TransferAccountsDetailResponse cr = new TransferAccountsDetailResponse();
        cr = JacksonUtil.readValue(json, TransferAccountsDetailResponse.class);
        return cr;
    }
}
