package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 易家用户退群请求
 * Created by Administrator on 2016/5/26.
 */
public class ExitCommunityRequest extends JavaCommonRequest {


    public String login_name;
    public String community_id;

    public ExitCommunityRequest(){
        this.setMethodName("community/signOutCommunity");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("user_id",userId);
        in.put("login_name",login_name);
        in.put("community_id",community_id);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}
