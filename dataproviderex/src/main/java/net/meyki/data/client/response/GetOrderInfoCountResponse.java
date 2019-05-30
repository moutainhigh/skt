package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * 项目名称：net.meyki.data.client.response
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 9:34
 * 修改人：Daimhim
 * 修改时间：2017/6/28 9:34
 * 类描述：
 * 修改备注：
 */

public class GetOrderInfoCountResponse  extends JavaCommonResponse{

    private String logisticsCountDFK;  //	String	物流快递待付款数量
    private String logisticsCountDFH;  //	String	物流快递待发货数量
    private String logisticsCountDSH;  //	String	物流快递待收货数量
    private String logisticsCountTKSH;  //	String	物流快递退款/售后数量

    private String businessCountDFH;  //	String	商家配送待发货数量
    private String businessCountDSH;  //	String	商家配送待收货数量
    private String businessCountYWC;  //	String	商家配送已完成数量

    private String toShopCountDFK;  //	String	到店消费待付款数量
    private String toShopCountDXF;  //	String	到店消费待消费数量
    private String toShopCountYXF;  //	String	到店消费已消费数量
    private String toShopCountYQX;  //	String	到店消费已取消数量

    public String getLogisticsCountDFK() {
        return logisticsCountDFK;
    }

    public void setLogisticsCountDFK(String logisticsCountDFK) {
        this.logisticsCountDFK = logisticsCountDFK;
    }

    public String getLogisticsCountDFH() {
        return logisticsCountDFH;
    }

    public void setLogisticsCountDFH(String logisticsCountDFH) {
        this.logisticsCountDFH = logisticsCountDFH;
    }

    public String getLogisticsCountDSH() {
        return logisticsCountDSH;
    }

    public void setLogisticsCountDSH(String logisticsCountDSH) {
        this.logisticsCountDSH = logisticsCountDSH;
    }

    public String getLogisticsCountTKSH() {
        return logisticsCountTKSH;
    }

    public void setLogisticsCountTKSH(String logisticsCountTKSH) {
        this.logisticsCountTKSH = logisticsCountTKSH;
    }

    public String getBusinessCountDFH() {
        return businessCountDFH;
    }

    public void setBusinessCountDFH(String businessCountDFH) {
        this.businessCountDFH = businessCountDFH;
    }

    public String getBusinessCountDSH() {
        return businessCountDSH;
    }

    public void setBusinessCountDSH(String businessCountDSH) {
        this.businessCountDSH = businessCountDSH;
    }

    public String getBusinessCountYWC() {
        return businessCountYWC;
    }

    public void setBusinessCountYWC(String businessCountYWC) {
        this.businessCountYWC = businessCountYWC;
    }

    public String getToShopCountDFK() {
        return toShopCountDFK;
    }

    public void setToShopCountDFK(String toShopCountDFK) {
        this.toShopCountDFK = toShopCountDFK;
    }

    public String getToShopCountDXF() {
        return toShopCountDXF;
    }

    public void setToShopCountDXF(String toShopCountDXF) {
        this.toShopCountDXF = toShopCountDXF;
    }

    public String getToShopCountYXF() {
        return toShopCountYXF;
    }

    public void setToShopCountYXF(String toShopCountYXF) {
        this.toShopCountYXF = toShopCountYXF;
    }

    public String getToShopCountYQX() {
        return toShopCountYQX;
    }

    public void setToShopCountYQX(String toShopCountYQX) {
        this.toShopCountYQX = toShopCountYQX;
    }

    @Override
    public String toString() {
        return "GetOrderInfoCountResponse{" +
                "logisticsCountDFK='" + logisticsCountDFK + '\'' +
                ", logisticsCountDFH='" + logisticsCountDFH + '\'' +
                ", logisticsCountDSH='" + logisticsCountDSH + '\'' +
                ", logisticsCountTKSH='" + logisticsCountTKSH + '\'' +
                ", businessCountDFH='" + businessCountDFH + '\'' +
                ", businessCountDSH='" + businessCountDSH + '\'' +
                ", businessCountYWC='" + businessCountYWC + '\'' +
                ", toShopCountDFK='" + toShopCountDFK + '\'' +
                ", toShopCountDXF='" + toShopCountDXF + '\'' +
                ", toShopCountYXF='" + toShopCountYXF + '\'' +
                ", toShopCountYQX='" + toShopCountYQX + '\'' +
                '}';
    }
}
