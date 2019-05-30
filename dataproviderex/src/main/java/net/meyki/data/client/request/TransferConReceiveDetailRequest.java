package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/7.
 */
public class TransferConReceiveDetailRequest extends JavaCommonRequest {

    public TransferConReceiveDetailRequest(){
        setMethodName("v4/luckybag/userapp/getLuckybag");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        return null;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        return null;
    }

}
