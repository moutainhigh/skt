package net.meyki.data.client.domain;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class MyFootprintItemBean {
    private String userId;     //用户ID
    private String goodsId;     //商品ID
    private String goodsImg;     //商品图片
    private String goodsPrice;     //商品价格
    private String goodsName;     //商品名称
    private String isShelves;     //商品上下架, 1-本店上架; 2-本店下架;3-总店已下架 4-总店上架
    private String time;     //浏览日期
    private String shopId;     //商铺ID
    private String categoryId;     //	类目id
    private String categoryName;//类目名称
    private String shopType;     //tsg表示特产馆，其他普通店铺
    private String  orderSource;//	判断是否参加活动 0：否 1：是
    private String select;
    private String shopPrice;     //商品价格




    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }


    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getShopPrice() {
        return shopPrice;
    }
    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }


    public String getScanDate() {
        return time;
    }

    public void setScanDate(String scanDate) {
        this.time = scanDate;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }


    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getIs_shelves() {
        return isShelves;
    }

    public void setIs_shelves(String isShelves) {
        this.isShelves = isShelves;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getShop_type() {
        return shopType;
    }

    public void setShop_type(String shopType) {
        this.shopType = shopType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
