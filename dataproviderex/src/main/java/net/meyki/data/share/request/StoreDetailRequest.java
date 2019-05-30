package net.meyki.data.share.request;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.Bonus;
import net.meyki.data.share.domain.DiscountListItem;
import net.meyki.data.share.domain.NewGoodsListItem;
import net.meyki.data.share.domain.WelfareListItem;
import net.meyki.data.share.response.StoreDetatilResponse;

import java.util.HashMap;

/**
 * 1.47 店铺浏览
 * */
public class StoreDetailRequest extends JavaCommonRequest {

	/** 店铺id	*/
	public String shopId;
	/** 用户UUID*/
	public String userId;
	/**店铺浏览来源，点击广告浏览店铺必填：1*/
	public String type;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 初始化 设置接口名称
	 * */
	public StoreDetailRequest() {
		this.setMethodName("shop/browseShop");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("shopId", shopId);
		param.put("userId", userId);
		if(!TextUtils.isEmpty(type)){
			param.put("type", type);
		}

		return param;
	}


	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		if (null == json) {
			return null;
		}
		StoreDetatilResponse sdr = new StoreDetatilResponse();
		JSONObject jsono = JSON.parseObject(json);
		if (null != jsono) {
			JSONObject shop = jsono
					.getJSONObject("shopInfo");
			if (shop != null) {
				sdr.shopInfo = shop.getString("shopDesc");
				sdr.isCollect = shop.getIntValue("isCollect");
				try {
					//
					sdr.shopaddress = shop.getString("shopAddress");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					//
					sdr.shopname = shop.getString("shopName");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					sdr.shopphone = shop.getString("shopTel");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					sdr.lat = shop.getString("latitude");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					sdr.loginName = shop.getString("loginName");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					sdr.lng = shop.getString("longitude");
				} catch (Exception e) {
					e.printStackTrace();
				}
				//
				// 店铺幻灯片
				com.alibaba.fastjson.JSONArray imgs = jsono
						.getJSONArray("slideImgs");
				if(null != imgs) {
					for (Object object : imgs) {
						if (object != null) {
							JSONObject img = (JSONObject) object;
							sdr.shopImg.add(img.getString("imgSrc"));
						}
					}
				}
				if (jsono.getIntValue("isMemberActive") == 1) {
					sdr.hasUserAct = true;
				}
				if (jsono.getIntValue("isFullcutActive") == 1) {
					sdr.hasManAct = true;
				}
				// 免费福利
				// com.alibaba.fastjson.JSONArray welfares = jsono
				// .getJSONArray("free_active");
				try {
					// com.alibaba.fastjson.JSONObject obje = jsono
					// .getJSONObject("free_active");
					String free = jsono.getString("free_active");
					if (!TextUtils.isEmpty(free) && !"{}".equals(free)) {
						JSONObject obj = JSON.parseObject(free);
						if (obj != null) {
							if (1 == jsono.getIntValue("free_active_more")) {
								sdr.hasMoreWelfare = true;
							}
							JSONObject wel = (JSONObject) obj;
							WelfareListItem welItem = new WelfareListItem();
							welItem.setFreeId(wel.getString("freeId"));
							welItem.setName(wel.getString("name"));
							welItem.setImgSrc(wel.getString("imgSrc"));
							welItem.setNums(wel.getIntValue("nums"));
							welItem.setLessNums(wel.getIntValue("lessNums"));
							welItem.setStartTime(wel.getString("startTime"));
							welItem.setEndTime(wel.getString("endTime"));
							welItem.setInfo(wel.getString("info"));
							sdr.welfares.add(welItem);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 优惠券
				com.alibaba.fastjson.JSONArray bouns = jsono
						.getJSONArray("bonus");
				if (bouns != null) {
					if (1 == jsono.getIntValue("bonus_more")) {
						sdr.hasMoreBouns = true;
					}
					for (Object object : bouns) {
						if (object != null) {
							JSONObject obj = (JSONObject) object;
							Bonus boun = new Bonus();
							boun.bonusId = obj.getString("bonusId");
							boun.name = obj.getString("name");
							boun.price = obj.getString("price");
							sdr.bonus.add(boun);
						}
					}
				}
				// 新品上市
				com.alibaba.fastjson.JSONArray news = jsono
						.getJSONArray("newGoods");
				if (news != null) {
					if (1 == jsono.getIntValue("newGoodsMore")) {
						sdr.hasMoreShops = true;
					}
					for (Object object : news) {
						if (object != null) {
							JSONObject obj = (JSONObject) object;
							NewGoodsListItem welItem = new NewGoodsListItem();
							welItem.setGoodsName(obj.getString("goodsName"));
							welItem.setGoodsImg(obj.getString("goodsImg"));
							welItem.setShopPrice(obj.getString("shopPrice"));
							welItem.setGoodsDesc(obj.getString("goodsDesc"));
							welItem.setGoodsUnit(obj.getString("goodsUnit"));
							welItem.setGoodId(obj.getString("goodsId"));
							sdr.newshops.add(welItem);
						}
					}
				}

				// 折扣商品
				com.alibaba.fastjson.JSONArray dis = jsono
						.getJSONArray("discounts");
				if (dis != null) {
					if (1 == jsono.getIntValue("discounts_more")) {
						sdr.hasMoreDiscount = true;
					}
					for (Object object : dis) {
						if (object != null) {
							JSONObject obj = (JSONObject) object;
							DiscountListItem welItem = new DiscountListItem();
							welItem.setGoodsName(obj.getString("goodsName"));
							welItem.setGoodsImg(obj.getString("goodsImg"));
							welItem.setMarketPrice(obj.getString("marketPrice"));
							welItem.setGoodsUnit(obj.getString("goodsUnit"));
							welItem.setGoodsDesc(obj.getString("goodsDesc"));
							welItem.setDsctName(obj.getString("dsctName"));
							welItem.setShopPrice(obj.getString("shopPrice"));
							welItem.setDsctType(obj.getString("dsctType"));
							welItem.setDiscount(obj.getString("discount"));
							welItem.setStartTime(obj.getString("startTime"));
							welItem.setEndTime(obj.getString("endTime"));
							welItem.setGoodId(obj.getString("goodsId"));
							sdr.discounts.add(welItem);
						}
					}
				}
			}

		}
		sdr.RequestSequenceId = RequestSequenceId;
		return sdr;
	}
}
