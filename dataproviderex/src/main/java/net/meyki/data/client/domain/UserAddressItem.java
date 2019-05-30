package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 用户地址列表item
 * Created by Administrator on 2016/5/4.
 */
public class UserAddressItem implements Serializable {

    public String deliveryAddressId;
    public String addressName;
    public String phone;
    public String province;
    public String city;
    public String county;
    public String address;
    public int isDefault;
    public String postCode;
}
