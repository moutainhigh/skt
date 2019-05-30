package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/5.
 */
public class ArticleFollowRequest extends JavaCommonRequest{

    public String status;
    public String goodsId;
    public String type;

    public ArticleFollowRequest(){
        setMethodName("v3/disc/likeArtical");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in =initHashMap();
        in.put("userId",userId);
        in.put("status",status);
        in.put("goodsId", goodsId);
        in.put("type",type);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}
