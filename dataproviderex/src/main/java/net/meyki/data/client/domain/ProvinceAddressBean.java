package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 项目名称：user-4.5.2
 * 类描述：特产馆省份列表
 * 创建人：xyp
 * 创建时间：2017/6/17 14:44
 * 修改人：meyki-bear
 * 修改时间：2017/6/17 14:44
 * 修改备注：
 */

public class ProvinceAddressBean implements Serializable{
    private String codeName; //省编码
    private String code; //省名称
    private ArrayList<CityAddressBean> cityCodeModel;//市信息

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<CityAddressBean> getCityCodeModel() {
        return cityCodeModel;
    }

    public void setCityCodeModel(ArrayList<CityAddressBean> cityCodeModel) {
        this.cityCodeModel = cityCodeModel;
    }
}
