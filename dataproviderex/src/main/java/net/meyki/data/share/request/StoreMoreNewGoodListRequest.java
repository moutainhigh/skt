package net.meyki.data.share.request;
import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.share.response.StoreMoreNewGoodListResponse;

import java.util.HashMap;

/**
 * 128 更多列表(新品)
 * 
 */
public class StoreMoreNewGoodListRequest extends JavaCommonRequest {




	public StoreMoreNewGoodListRequest(){
		setMethodName("index/getNewShopsClient");// 这里需要传入请求的action
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("pageSize", pageSize);
		params.put("shopId", shopId);
		params.put("pageNo", pageNo);
		return params;
	}

	@Override
	public net.meyki.data.json.JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		if (null == paramStream) {
			return null;
		}
		StoreMoreNewGoodListResponse alr = JacksonUtil.readValue(paramStream, new TypeReference<StoreMoreNewGoodListResponse>() {
		});
		return alr;
	}

}
