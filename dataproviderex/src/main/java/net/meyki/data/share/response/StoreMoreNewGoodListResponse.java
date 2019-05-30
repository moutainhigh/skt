package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.DiscountListItem;
import net.meyki.data.share.domain.NewGoodsListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * 店铺免费福利列表响应回来的数据
 * @author liyc
 *
 */
public class StoreMoreNewGoodListResponse extends JavaCommonResponse {
	public String extData;
	public String totalRecords;
	public String pages;
	public boolean hasNext;
	public List<NewGoodsListItem> list  = new ArrayList<NewGoodsListItem>();//免费福利列表数据
}
