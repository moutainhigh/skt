package net.meyki.skt.bean;

import java.io.Serializable;

/**
 * 项目名称：4.4.6
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/2 14:26
 * 修改人：meyki-bear
 * 修改时间：2017/6/2 14:26
 * 修改备注：
 */

public class EssayBean implements Serializable {
    private String articleId;//文章id
    private String coverId;//封面id(暂时无用)
    private String coverSrc;//封面地址
    private String articleCoverH;//封面高
    private String articleCoverW;//封面宽
    private String articleType;//文章类型（1：普通文章，2：美齐实况）
    private String authour;//发布者
    private String title;//标题
    private String articleContent;//文章内容
    private String authorIcon;//发布者图标
    private String likeCount;//点赞数量
    private String isLike;//是否点赞 0：没点；1：点了

    //暂时无用字段
    private String creater;//创建人
    private String createdTime;//创建时间
    private String modifier;//修改人
    private String modifyTime;//修改时间
    private String province;//省
    private String city;//市
    private String district;//区
    private String provinceCode;//省编码
    private String cityCode;//市编码
    private String districtCode;//区编码
    private String articleTag;//文章标签主键
    private String seq;//排序
    private String isIndex;//是否推荐首页（0：否，1：是）

    private String goodsNum;


    public EssayBean() {
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

    public String getCoverSrc() {
        return coverSrc;
    }

    public void setCoverSrc(String coverSrc) {
        this.coverSrc = coverSrc;
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

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }
}
