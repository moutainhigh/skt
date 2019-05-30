package net.meyki.data.client.domain;

/**
 * @version $Rev
 * @time 2017/5/9 10:51
 * @updateAuthor $Author
 * @updateDate 2017/5/9
 * @updateDes ${TODO}
 * <p>
 * Created by Daimhim on 2017/5/9.
 */

public class MyConcernListItemBean {
    private String id;		//物理ID
    private String shopId;		//店铺ID
    private String userId;		//店主ID
    private String shopName;		//店铺名称
    private String shopImg;		//店铺logo
    private String shopDesc;		//店铺描述
    private String shopAddress;		//店铺地址
    private String shopCate;		//店铺类型
    //文章id
    private String articalId;
    //文章标题
    private String title;
    //文章图片
    private String articalSrc;
    //文章内容
    private String articalContent;
    //点赞数量
    private String likeCount;
    //是否被点赞
    private String isLike;
    //文章作者
    private String authour;
    //作者头像
    private String articalIcon;

    private String photoList;

    private String isCare;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopAddres() {
        return shopAddress;
    }

    public void setShopAddres(String shopAddres) {
        shopAddress = shopAddres;
    }

    public String getShopCate() {
        return shopCate;
    }

    public void setShopCate(String shopCate) {
        this.shopCate = shopCate;
    }

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
        return "MyConcernListItemBean{" +
                "id='" + id + '\'' +
                ", shopId='" + shopId + '\'' +
                ", userId='" + userId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopImg='" + shopImg + '\'' +
                ", shopDesc='" + shopDesc + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopCate='" + shopCate + '\'' +
                ", articalId='" + articalId + '\'' +
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
