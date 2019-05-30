package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.SaveCustomerChatMsgResponse;

import java.util.HashMap;

/**
 * 获取保存当前聊天内容(在跟客服聊天发消息之前调用，之后把返回值作为文字消息通过环信发送给客服)
 */
public class SaveCustomerChatMsgRequest extends JavaCommonRequest {

    public String phone;

    public String csOrderNo;//是	string	客服处理工单
    public String fromUser;//是	string	发送消息环信账号 userId
    public String toUser;//否	string	接收消息环信账号客服账号
    public String chatMsgType;	//否	string	消息类型(txt=文本,img=图片)
    public String chatMsg;//否	string	消息内容
    public String creater;//否	string	创建人


    public SaveCustomerChatMsgRequest(){
        setMethodName("customerapi/v1/insertChatMsg");
    }

    @Override
    public HashMap<String, Object> getInputMap(){
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("csOrderNo",csOrderNo);
        param.put("fromUser",fromUser);
        param.put("toUser",toUser);
        param.put("chatMsgType",chatMsgType);
        param.put("chatMsg",chatMsg);
        param.put("creater",creater);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json){
        SaveCustomerChatMsgResponse cr = new SaveCustomerChatMsgResponse();
//        cr = JacksonUtil.readValue(json, SaveCustomerChatMsgResponse.class);
        cr.data=json;
        return cr;
    }
}
