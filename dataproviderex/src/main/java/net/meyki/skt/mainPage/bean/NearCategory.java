package net.meyki.skt.mainPage.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/18.
 */
public class NearCategory implements Serializable {
    private static final long serialVersionUID = -3497923902408644451L;
    private int catId;
    private int drable;
    private String image;
    private boolean isOpen;
    private String name;
    private String isChoose;//判断是否选中
    private int color;//ico顏色

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public NearCategory(){

    }
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public NearCategory(int catId, int drable) {
        this.catId = catId;
        this.drable = drable;
    }

    public NearCategory(int cat_id, int drable, String image,String isChoose) {
        this.catId = cat_id;
        this.drable = drable;
        this.name = image;
        this.isChoose = isChoose;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setId(int cat_id) {
        this.catId = cat_id;
    }

    public String getIsChoose() {
        return isChoose;
    }
    public void setIsChoose(String isChoose) {
        this.isChoose = isChoose;
    }
    public int getDrable() {
        return drable;
    }
    public void settDrable(int drable) {
        this.drable = drable;
    }
//	@Override
//	public String toString() {
//		return "Category [cat_id=" + catId + ", name=" + catName + ", image="
//				+ image +  ", isChoose=" + isChoose + "]";
//	}
}
