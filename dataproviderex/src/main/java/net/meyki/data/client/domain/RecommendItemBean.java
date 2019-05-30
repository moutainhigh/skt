package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendItemBean implements Serializable{
    private String recommendCategoryName;
    private String recommendCategoryId;
    private String sortOrder;
    public boolean isChoose;

    public String getRecommendCategoryId() {
        return recommendCategoryId;
    }

    public void setRecommendCategoryId(String recommendCategoryId) {
        this.recommendCategoryId = recommendCategoryId;
    }

    public String getRecommendCategoryName() {
        return recommendCategoryName;
    }

    public void setRecommendCategoryName(String recommendCategoryName) {
        this.recommendCategoryName = recommendCategoryName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
