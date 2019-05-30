package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class keywordGoodsItem implements Serializable {
    public String goodsName;
    public String shopPrice;
    public String goodsUnit;
    public List<keywordGoodsItem> keywordGoods;

    public List<keywordGoodsItem> getKeywordGoods() {
        return keywordGoods;
    }

    public void setKeywordGoods(List<keywordGoodsItem> keywordGoods) {
        this.keywordGoods = keywordGoods;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }
}
