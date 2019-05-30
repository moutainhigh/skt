package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/16.
 */
public class CountryListItem implements Serializable {
    /**
     * 区域id
     */
    public String operatorsId;
    /**
     * 区域logo
     */
    public String districtLogo;

    public String county;
    public boolean isShowTop; //是否是正在显示置顶 按钮
    public boolean isTop; //是否是置顶状态，这个状态本地控制，不走网络请求
    public String specialty;
    public String templateUrl;


    public CountryListItem() {

    }

    public CountryListItem(String districtLogo) {
        this.districtLogo = districtLogo;
    }
}
