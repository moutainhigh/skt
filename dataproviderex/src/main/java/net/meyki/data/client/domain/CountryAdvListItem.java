package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 乡味幻灯片
 * Created by Administrator on 2016/5/18.
 */
public class CountryAdvListItem implements Serializable{
    public String image;
    public String galleryId;

    public CountryAdvListItem(){

    }
    public CountryAdvListItem(String image){
        this.image = image;
    }
}
