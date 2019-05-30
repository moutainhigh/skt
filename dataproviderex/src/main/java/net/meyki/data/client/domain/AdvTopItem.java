package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/28.
 */
public class AdvTopItem implements Serializable {

    public String adsBannerId;   //广告类bannerID,业务ID
    public String mediaType;  //媒体类型 0-图片 1-视频
    public String mediaUrl;   //图片URL，当媒体类型media_type为视频时，此字段为视频的封面图
    public String videoUrl;  //视频,媒体类型media_type为1时有效
    public String mediaLinkType; //链接方式，0-无 1-静态页面 2-店铺模版 3-商品模版,4-文章详情 默认值为0,
    public String dataFrom;  //链接数据来源,0-特产馆 1-综合商城 ，当“链接方式”等于2,3时有效
    public String mediaLinkObject; //链接对象，链接方式为0时，为空；媒体链接方式为1时，为静态页面URL；媒体链接方式为2时，为店铺ID；媒体链接方式为3时，为商品ID
    //媒体链接方式为4时，为文章ID
    public String positionId; //位置ID
    public String positionName;//位置名称\
    public String objectName;//2:店铺名称3：商品名称
    public String orderSource;//

    @Override
    public String toString() {
        return "AdvTopItem{" +
                "adsBannerId='" + adsBannerId + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", mediaLinkType='" + mediaLinkType + '\'' +
                ", dataFrom='" + dataFrom + '\'' +
                ", mediaLinkObject='" + mediaLinkObject + '\'' +
                ", positionId='" + positionId + '\'' +
                ", positionName='" + positionName + '\'' +
                ", objectName='" + objectName + '\'' +
                ", orderSource='" + orderSource + '\'' +
                '}';
    }
}
