package net.meyki.data.client.response;

import net.meyki.data.client.domain.ProvinceBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hl on 2017/4/17.
 * 特产管地址选择
 */
public class SelectAddressResponse extends JavaCommonResponse {
    private List<ProvinceBean> province = new ArrayList<>();

    public List<ProvinceBean> getProvince() {
        return province;
    }

    public void setProvince(List<ProvinceBean> province) {
        this.province = province;
    }
}
