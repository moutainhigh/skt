/**
 * 
 */
package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.Bonus;
import net.meyki.data.share.domain.DiscountListItem;
import net.meyki.data.share.domain.NewGoodsListItem;
import net.meyki.data.share.domain.WelfareListItem;
/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2016年4月28日 上午11:17:39 
 * 类说明 
 */

public class StoreDetatilResponse extends JavaCommonResponse {

	/**
	 *
	 */
	private static final long serialVersionUID = 7507299478232169279L;

	public String shopInfo;// 店铺介绍
	public String shopname;// 店铺名字
	public String shopaddress;// 店铺地址
	public String shopphone;// 店铺电话
	public int isCollect;// 是否收藏
	public String lat;// 经纬度
	public String lng;// 经纬度
	public String loginName;
	public List<String> shopImg = new ArrayList<String>();// 幻灯片
	public List<WelfareListItem> welfares = new ArrayList<WelfareListItem>();// 福利
	public List<Bonus> bonus = new ArrayList<Bonus>();// 优惠券
	public List<NewGoodsListItem> newshops = new ArrayList<NewGoodsListItem>();// 新品推荐
	public List<DiscountListItem> discounts = new ArrayList<DiscountListItem>();// 折扣商品

	public boolean hasMoreShops = false;

	public boolean hasMoreDiscount = false;

	public boolean hasMoreBouns = false;

	public boolean hasMoreWelfare = false;

	public boolean hasManAct = false;

	public boolean hasUserAct = false;
}
