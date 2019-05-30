package net.meyki.data.client.domain;

import android.widget.ImageView;

/**
 * Created by meiqi on 2016/11/2.
 */

public class PanicBuyBean {
    private  String goods_img;
    private  String title;
    private  String detail;
    private  String price;
    private  String untils;
    private  String production;
    private  String remaind;
    private  String time;

    public PanicBuyBean(String goods_img, String detail, String title,String time,String remaind) {
        this.goods_img = goods_img;
        this.detail = detail;
        this.title = title;
        this.time = time;
        this.remaind = remaind;
    }

    public PanicBuyBean() {
    }

    public PanicBuyBean(String goods_img,String detail, String price, String production, String remaind, String time, String title, String untils) {
        this.goods_img = goods_img;
        this.detail = detail;
        this.price = price;
        this.production = production;
        this.remaind = remaind;
        this.time = time;
        this.title = title;
        this.untils = untils;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getRemaind() {
        return remaind;
    }

    public void setRemaind(String remaind) {
        this.remaind = remaind;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUntils() {
        return untils;
    }

    public void setUntils(String untils) {
        this.untils = untils;
    }
}
