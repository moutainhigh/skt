package net.meyki.data.client.domain;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class QueryQcHistoryItemBean {
    private String userId;     //用户ID
    private String goodsId;     //商品ID
    private String qcCodeHistoryId;     //扫描历史二维码
    private String goodsImg;     //商品图片
    private String shopPrice;     //商品价格
    private String goodsName;     //商品名称
    private String isShelves;     //商品上下架, 1-本店上架; 2-本店下架;3-总店已下架 4-总店上架
    private String scanDate;     //扫描日期
    private String  orderSource;//	判断是否参加活动 0：否 1：是

    private String select;

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

    public String getQcCodeHistoryId() {
        return qcCodeHistoryId;
    }

    public void setQcCodeHistoryId(String qcCodeHistoryId) {
        this.qcCodeHistoryId = qcCodeHistoryId;
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

    public String getIsShelves() {
        return isShelves;
    }

    public void setIsShelves(String isShelves) {
        this.isShelves = isShelves;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }
}
