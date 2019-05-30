package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 项目名称：net.meyki.data.client.domain
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 11:29
 * 修改人：Daimhim
 * 修改时间：2017/6/5 11:29
 * 类描述：
 * 修改备注：
 */

public class DiscTagArticleListBean implements Serializable {

    private String articleId;    //		String	YES	文章业务主键
    private String coverId;    //		String	YES	封面id
    private List<CoverSrcBean> coverList;    //		JSONArray	YES	封面地址列表
    private String articleCoverH;    //		String	YES	封面宽度
    private String articleCoverW;    //		String	YES	封面长度
    private String articleType;    //		String	YES	文章类型（1：普通文章，2：美齐实况）
    private String authour;    //		String	YES	发布者
    private String title;    //		String	YES	标题
    private String articleContent;    //		String	YES	文章内容
    private String authorIcon;    //		String	YES	发布者图标
    private String creater;    //		String	YES	创建人
    private String createdTime;    //		String	YES	创建时间
    private String modifier;    //		String	YES	修改人
    private String modifyTime;    //		String	YES	修改时间
    private String province;    //		String	YES	省
    private String city;    //		String	YES	市
    private String district;    //		String	YES	区
    private String provinceCode;    //		String	YES	省编码
    private String cityCode;    //		String	YES	市编码
    private String districtCode;    //		String	YES	区编码
    private String articleTag;    //		String	YES	文章标签主键
    private String seq;    //		String	YES	排序
    private String isIndex;    //		String	YES	是否推荐首页（0：否，1：是）
    private String likeCount;    //		String	YES	点赞数量
    private String isLike;    //		String	YES	是否点赞 0：没点；1：点了
    private String goodsNum;

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public class CoverSrcBean {
        private String coverSrc;//String	YES	封面地址

        public String getCoverSrc() {
            return coverSrc;
        }

        public void setCoverSrc(String coverSrc) {
            this.coverSrc = coverSrc;
        }

        @Override
        public String toString() {
            return "CoverSrc{" +
                    "coverSrc='" + coverSrc + '\'' +
                    '}';
        }
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCoverId() {
        return coverId;
    }

    public void setCoverId(String coverId) {
        this.coverId = coverId;
    }

    public List<CoverSrcBean> getCoverList() {
        return coverList;
    }

    public void setCoverList(List<CoverSrcBean> coverList) {
        this.coverList = coverList;
    }

    public String getArticleCoverH() {
        return articleCoverH;
    }

    public void setArticleCoverH(String articleCoverH) {
        this.articleCoverH = articleCoverH;
    }

    public String getArticleCoverW() {
        return articleCoverW;
    }

    public void setArticleCoverW(String articleCoverW) {
        this.articleCoverW = articleCoverW;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(String isIndex) {
        this.isIndex = isIndex;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getIsLike() {
        return isLike;
    }

    public void setIsLike(String isLike) {
        this.isLike = isLike;
    }

    @Override
    public String toString() {
        return "DiscTagArticleListBean{" +
                "articleId='" + articleId + '\'' +
                ", coverId='" + coverId + '\'' +
                ", coverList=" + coverList +
                ", articleCoverH='" + articleCoverH + '\'' +
                ", articleCoverW='" + articleCoverW + '\'' +
                ", articleType='" + articleType + '\'' +
                ", authour='" + authour + '\'' +
                ", title='" + title + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", authorIcon='" + authorIcon + '\'' +
                ", creater='" + creater + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", modifier='" + modifier + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", articleTag='" + articleTag + '\'' +
                ", seq='" + seq + '\'' +
                ", isIndex='" + isIndex + '\'' +
                ", likeCount='" + likeCount + '\'' +
                ", isLike='" + isLike + '\'' +
                '}';
    }
}
