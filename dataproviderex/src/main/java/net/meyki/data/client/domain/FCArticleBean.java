package net.meyki.data.client.domain;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 文章列表
 * Created by lxy on 2017/6/7 0007.
 */
public class FCArticleBean implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 8123878232493371476L;
    public String articleId;//文章业务主键
    public List<FCArticleImgBean> coverList = new ArrayList<>();
    public String articleCoverH;//封面宽度
    public String articleCoverW;//封面长度
    public String articleType;//文章类型（1：普通文章，2：美齐实况）
    public String authour;//发布者
    public String title;//标题
    public String articleContent;//文章内容
    public String authorIcon;//发布者图标
    public String creater;//创建人
    public String createdTime;//创建时间
    public String articleTag;//文章标签主键
    public String seq;//排序
    public String isIndex;// 	是否推荐首页（0：否，1：是）
    public String likeCount;//点赞数量
    public String isLike;//是否点赞 0：没点；1：点了
    public String goodsNum;
}
