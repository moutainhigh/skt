package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetFreeCustomerResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取当前空闲客服
 */
public class GetFreeCustomerRequest extends JavaCommonRequest {

    public String phone;

    public String customer_type;//申请类型 1=易家,2=易商,3=易农
    public String user_lv;//用户等级0=普通 没有先给0
    public String app_user_id;//用户ID
    public String app_chat_id;//环信用户账号
    public String app_user_account;//用户账号名称 用户手机号
    public String app_user_domain;//用户访问来源
    public String app_user_address;//用户访问地址 有地址给地址，无地址给定位定制


    public GetFreeCustomerRequest(){
        setMethodName("customerapi/v1/getCustomer");
    }

    @Override
    public HashMap<String, Object> getInputMap(){
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("customer_type",customer_type);
        param.put("user_lv",user_lv);
        param.put("app_user_id",app_user_id);
        param.put("app_chat_id",app_chat_id);
        param.put("app_chat_id",app_chat_id);
        param.put("app_user_account",app_user_account);
        param.put("app_user_domain",app_user_domain);
        param.put("app_user_address",app_user_address);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json){
        GetFreeCustomerResponse cr = new GetFreeCustomerResponse();
        cr = JacksonUtil.readValue(json, GetFreeCustomerResponse.class);
        return cr;
    }
}
