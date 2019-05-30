package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public class ProvinceBean implements Serializable {
    private List<cityBean> city = new ArrayList<>();
    private String name;//省名称

    public ProvinceBean() {
    }

    public ProvinceBean(List<cityBean> city, String name) {
        this.city = city;
        this.name = name;
    }

    public List<cityBean> getCity() {
        return city;
    }

    public void setCity(List<cityBean> city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProvinceBean{" +
                "city=" + city +
                ", name='" + name + '\'' +
                '}';
    }
}
