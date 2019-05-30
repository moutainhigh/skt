package net.meyki.skt.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 项目名称：4.4.6
 * 类描述：发现界面首页推荐的实体类
 * 创建人：xyp
 * 创建时间：2017/6/2 14:19
 * 修改人：meyki-bear
 * 修改时间：2017/6/2 14:19
 * 修改备注：
 */

public class DisRecommendBean implements Serializable{
    private String tagId;//标题id

    private String tagName;//标题名
    private List<EssayBean> articleList; //文章列表

    public DisRecommendBean() {
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<EssayBean> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<EssayBean> articleList) {
        this.articleList = articleList;
    }
}
