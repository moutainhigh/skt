package net.meyki.data.client.domain;

/**
 * 项目名称：net.meyki.data.client.domain
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 18:33
 * 修改人：Daimhim
 * 修改时间：2017/6/28 18:33
 * 类描述：
 * 修改备注：
 */

public class GetNewOrderPageListBean {
    private String orderId; //	String	订单ID
    private String orderType; //	String	0：物流快递，3：商家配送，1：到店消费
    private String orderDate; //	String	最新订单状态时间
    private String statusCode; //	String	订单状态 2:待发货；3:待收货；14:待消费；15：已消费
    private String goodsName; //	String	商品名称
    private String specImg; //	String	规格图片（如果没有规格图片则显示商品图片）
    private String goodsImg; //	String	商品图片
    private String certificate; //	String	到店消费验证码
    private String orderSn; //	String	订单编号
    private String logisticsCompany; //	String	物流公司
    private String logisticsNumber; //	String	物流单号

    @Override
    public String toString() {
        return "GetNewOrderPageListBean{" +
                "orderId='" + orderId + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", specImg='" + specImg + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", certificate='" + certificate + '\'' +
                ", orderSn='" + orderSn + '\'' +
                ", logisticsCompany='" + logisticsCompany + '\'' +
                ", logisticsNumber='" + logisticsNumber + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpecImg() {
        return specImg;
    }

    public void setSpecImg(String specImg) {
        this.specImg = specImg;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }
}
