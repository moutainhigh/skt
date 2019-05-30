package net.meyki.data.client.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.GoodsDetatilResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;


/**
 * 1.20 获取商品信息（修改时用）
 * */
public class GoodsDetailRequest extends JavaCommonRequest {

	/**	*/
	public String goodsId;

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 初始化 设置接口名称
	 * */
	public GoodsDetailRequest() {
		this.setMethodName("goods/queryGoodsInfo");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("goodsId", goodsId);
		return  param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		if (null == json) {
			return null;
		}
		GoodsDetatilResponse gdr = JacksonUtil.readValue(json, new TypeReference<GoodsDetatilResponse>() {
		});
		return gdr;
	}


}
