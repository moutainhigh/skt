package net.meyki.data.client.domain;

/**
 * 项目名称：4.3.0
 * 类描述：美奇头条实体信息
 * 创建人：xyp
 * 创建时间：2017/4/18 11:31
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 11:31
 * 修改备注：
 */

public class HearNewsBean {
    private String headContent; //		头条内容
    private String mediaLinkObject; //		头条链接
    private String mediaLinkType; //		链接方式，0-无关联 1-静态页面 2-店铺 3-商品,默认值为0
    private String meykiTypeName; //		"【无关联】：标签显示为【动态】【无关联】：标签显示为【动态】【静态页面】：标签显示为【热评】 【店铺】：标签显示为【商铺】            【商品】：标签显示为【精品】
    private String dataFrom; //		链接数据来源,0-特产馆 1-综合商城 ，当“链接方式”等于2,3时有效
    private String seq; //		排序
    private String createTime; //		创建时间
    private String objectName; //链媒体链接方式为2时，为店铺名称；媒体链接方式为3时，为商品名称
    private String orderSource; // 当链接方式为3时，显示：1为活动商品，0为普通商品
    public String getHeadContent() {
        return headContent;
    }

    public void setHeadContent(String headContent) {
        this.headContent = headContent;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getMediaLinkObject() {
        return mediaLinkObject;
    }

    public void setMediaLinkObject(String mediaLinkObject) {
        this.mediaLinkObject = mediaLinkObject;
    }

    public String getMediaLinkType() {
        return mediaLinkType;
    }

    public void setMediaLinkType(String mediaLinkType) {
        this.mediaLinkType = mediaLinkType;
    }

    public String getMeykiTypeName() {
        return meykiTypeName;
    }

    public void setMeykiTypeName(String meykiTypeName) {
        this.meykiTypeName = meykiTypeName;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "HearNewsBean{" +
                "headContent='" + headContent + '\'' +
                ", mediaLinkObject='" + mediaLinkObject + '\'' +
                ", mediaLinkType='" + mediaLinkType + '\'' +
                ", meykiTypeName='" + meykiTypeName + '\'' +
                ", dataFrom='" + dataFrom + '\'' +
                ", seq='" + seq + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
