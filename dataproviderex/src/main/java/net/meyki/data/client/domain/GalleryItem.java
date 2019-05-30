package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/3.
 */
public class GalleryItem  implements Serializable {
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String goodsImg;

}
