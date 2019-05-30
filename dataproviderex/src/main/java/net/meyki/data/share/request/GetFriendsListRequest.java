package net.meyki.data.share.request;

import java.util.HashMap;


import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetFriendsListResponse;
/***
 * 群组好友列表时请求
 * @author liyc
 *
 */
public class GetFriendsListRequest extends JavaCommonRequest {


	public GetFriendsListRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/getFriendsList");
	}


	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		GetFriendsListResponse cr = new GetFriendsListResponse();
		cr = JacksonUtil.readValue(paramStream, GetFriendsListResponse.class);		
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("user_id", userId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		return param;
	}

}
