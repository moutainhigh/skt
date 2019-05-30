package net.meyki.data.client.response;

import net.meyki.data.client.domain.CountrySearchGoodsBean;
import net.meyki.data.client.domain.CountrySearchShopBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 项目名称：user-4.5.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/20 15:19
 * 修改人：meyki-bear
 * 修改时间：2017/6/20 15:19
 * 修改备注：
 */

public class SearchCountryResponse extends JavaCommonResponse {
    private String proxyId; //YES 特产馆id
    private String shopName; //YES	店铺名称
    private String shopId; //YES	店铺ID
    private String shopImg; //YES	店铺图片
    private String shopDesc; //YES	店铺简介
    private ArrayList<CountrySearchGoodsBean> goodsList; //商品列表
    private ArrayList<CountrySearchShopBean> shopList; //特产管列表

    public SearchCountryResponse() {
        goodsList = new ArrayList<>();
        shopList = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public ArrayList<CountrySearchGoodsBean> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<CountrySearchGoodsBean> goodsList) {
        this.goodsList = goodsList;
    }

    public ArrayList<CountrySearchShopBean> getShopList() {
        return shopList;
    }

    public void setShopList(ArrayList<CountrySearchShopBean> shopList) {
        this.shopList = shopList;
    }

    public void updateResponse(SearchCountryResponse response) {
        this.shopList.clear();
        this.shopList.addAll(response.shopList);
        this.goodsList.clear();
        this.goodsList.addAll(response.goodsList);

        this.shopId = response.shopId;
        this.shopDesc = response.shopDesc;
        this.shopImg = response.shopImg;
        this.shopName = response.shopName;
        this.proxyId = response.proxyId;
    }
}
