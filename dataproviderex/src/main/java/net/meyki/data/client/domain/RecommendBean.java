package net.meyki.data.client.domain;

/**
 * 项目名称：4.3.0
 * 类描述：首页推荐类目实体类
 * 创建人：xyp
 * 创建时间：2017/4/18 10:33
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 10:33
 * 修改备注：
 */

public class RecommendBean {
    private String recommendCategoryName; //推荐类目名称
    private String recommendCategoryId;//推荐类目ID
    private String recommendCategoryDesc;//推荐类目描述
    private String recommendCategoryImg;//推荐类目图片
    private String sortOrder; //排序

    public String getRecommendCategoryName() {
        return recommendCategoryName;
    }

    public void setRecommendCategoryName(String recommendCategoryName) {
        this.recommendCategoryName = recommendCategoryName;
    }

    public String getRecommendCategoryId() {
        return recommendCategoryId;
    }

    public void setRecommendCategoryId(String recommendCategoryId) {
        this.recommendCategoryId = recommendCategoryId;
    }

    public String getRecommendCategoryDesc() {
        return recommendCategoryDesc;
    }

    public void setRecommendCategoryDesc(String recommendCategoryDesc) {
        this.recommendCategoryDesc = recommendCategoryDesc;
    }

    public String getRecommendCategoryImg() {
        return recommendCategoryImg;
    }

    public void setRecommendCategoryImg(String recommendCategoryImg) {
        this.recommendCategoryImg = recommendCategoryImg;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
