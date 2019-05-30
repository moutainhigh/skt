package net.meyki.skt.bean;

import java.io.Serializable;

import com.lidroid.xutils.db.annotation.Column;


public class PlaceLocation implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -3862569253956553394L;
    @Column(column = "lat")
    private Double lat;
    @Column(column = "lng")
    private Double lng;
    @Column(column = "province")
    private String province;
    @Column(column = "city")
    private String city;
    @Column(column = "county")
    private String county;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
