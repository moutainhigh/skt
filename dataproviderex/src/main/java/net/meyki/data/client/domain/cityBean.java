package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public class cityBean implements Serializable {
    private List<DistrictBean> district = new ArrayList<>();
    private  String name;//市名称

    public cityBean() {
    }

    public cityBean(List<DistrictBean> district, String name) {
        this.district = district;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DistrictBean> getDistrict() {
        return district;
    }

    public void setDistrict(List<DistrictBean> district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "cityBean{" +
                "district=" + district +
                ", name='" + name + '\'' +
                '}';
    }
}
