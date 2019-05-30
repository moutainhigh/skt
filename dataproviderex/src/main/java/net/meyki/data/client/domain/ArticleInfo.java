package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/1.
 */
public class ArticleInfo implements Serializable{
    //文章id
    public String articalId;
    //文章标题
    public String title;
    //文章图片
    public String articalSrc;
    //文章内容
    public String articalContent;
    //点赞数量
    public String likeCount;
    //是否被点赞
    public String isLike;
    //文章作者
    public String authour;
    //作者头像
    public String articalIcon;

    public String photoList;

    public String isCare;

    public String articalImgLength; //图片的高
    public String articalImgWidth; //图片的宽

    public String getArticalId() {
        return articalId;
    }

    public void setArticalId(String articalId) {
        this.articalId = articalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticalSrc() {
        return articalSrc;
    }

    public void setArticalSrc(String articalSrc) {
        this.articalSrc = articalSrc;
    }

    public String getArticalContent() {
        return articalContent;
    }

    public void setArticalContent(String articalContent) {
        this.articalContent = articalContent;
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

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public String getArticalIcon() {
        return articalIcon;
    }

    public void setArticalIcon(String articalIcon) {
        this.articalIcon = articalIcon;
    }

    public String getPhotoList() {
        return photoList;
    }

    public void setPhotoList(String photoList) {
        this.photoList = photoList;
    }

    public String getIsCare() {
        return isCare;
    }

    public void setIsCare(String isCare) {
        this.isCare = isCare;
    }

    @Override
    public String toString() {
        return "ArticleInfo{" +
                "articalId='" + articalId + '\'' +
                ", title='" + title + '\'' +
                ", articalSrc='" + articalSrc + '\'' +
                ", articalContent='" + articalContent + '\'' +
                ", likeCount='" + likeCount + '\'' +
                ", isLike='" + isLike + '\'' +
                ", authour='" + authour + '\'' +
                ", articalIcon='" + articalIcon + '\'' +
                ", photoList='" + photoList + '\'' +
                ", isCare='" + isCare + '\'' +
                '}';
    }
}
