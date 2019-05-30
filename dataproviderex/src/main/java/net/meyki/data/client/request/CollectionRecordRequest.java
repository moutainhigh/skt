package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 添加银行卡
 *
 * @author hulei
 */
public class CollectionRecordRequest extends JavaCommonRequest {

    public CollectionRecordRequest() {
        setMethodName("v4/supplier/addBankInfo");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> in = initHashMap();
        in.put("userId", userId);
        return in;
    }

}
