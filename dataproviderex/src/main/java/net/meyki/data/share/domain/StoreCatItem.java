package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/7.
 */
public class StoreCatItem implements Serializable{
    public String shopTypeId;//店铺分类ID
    public int cate;//分类ID					1：优质商铺，2，休闲度假
    public String typeName;//分类名称
    public String typeSrc;// 分类图片
    public boolean isShow;//是否旋转
}
