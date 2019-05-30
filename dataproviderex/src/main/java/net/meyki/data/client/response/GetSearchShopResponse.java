package net.meyki.data.client.response;

import net.meyki.data.client.domain.ShopSearchNearbyItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 1.45 获取附近店铺列表
 */

public class GetSearchShopResponse extends JavaCommonResponse {

   /* public String extData;
    public String totalRecords;
    public String pages;
    public boolean hasNext;

    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public ArrayList<ShopNearbyItem> getList() {
        return list;
    }

    public void setList(ArrayList<ShopNearbyItem> list) {
        this.list = list;
    }*/

    public ArrayList<ShopSearchNearbyItem> shopList = new ArrayList<ShopSearchNearbyItem>();

    public ArrayList<ShopSearchNearbyItem> getShopList() {
        return shopList;
    }

    public void setShopList(ArrayList<ShopSearchNearbyItem> shopList) {
        this.shopList = shopList;
    }
}
