package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/17.
 */
public class DistrictBean implements Serializable {
    private String name;
    private String proxyId;
    private boolean isChoose;

    public DistrictBean() {
    }

    public DistrictBean(String name, String proxyId) {
        this.name = name;
        this.proxyId = proxyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }

    @Override
    public String toString() {
        return "DistrictBean{" +
                "name='" + name + '\'' +
                ", proxyId='" + proxyId + '\'' +
                ", isChoose=" + isChoose +
                '}';
    }
}
