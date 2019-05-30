package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 商友和粉丝聊天页面
 * @author Administrator
 *
 */
public class SendMessageChatRequest extends JavaCommonRequest {
	
	/**  发送人的登录名 ： 如ys-13609113306/yj-13609113306 */
	public String loginname_from;
	/** 接收人的登录名 */
	public String loginname_to;
	/**   */
	public String content;

	public SendMessageChatRequest(){
		setMethodName("community/sendPointToPointMessage");
	}

	@Override
	public HashMap<String,Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("login_name_from", loginname_from);
		param.put("login_name_to", loginname_to);
		param.put("content", content);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}

}
