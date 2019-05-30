package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetTransferInfoResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/8/30.
 */
public class GetTransferInfoRequest extends JavaCommonRequest {

    public String receiveUserId;

    public GetTransferInfoRequest(){
        setMethodName("v3/transfer/getTransferInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("tag", dev_tag);
        input.put("os", dev_os);
        input.put("payUserId", userId);
        input.put("receiveUserId", receiveUserId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetTransferInfoResponse cr = new GetTransferInfoResponse();
        cr = JacksonUtil.readValue(json, GetTransferInfoResponse.class);
        return cr;
    }
}
