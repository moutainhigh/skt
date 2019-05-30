package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 项目名称：user-4.5.2
 * 类描述：特产馆城市列表
 * 创建人：xyp
 * 创建时间：2017/6/17 14:44
 * 修改人：meyki-bear
 * 修改时间：2017/6/17 14:44
 * 修改备注：
 */

public class CityAddressBean implements Serializable{
    private String codeName; //城市编码
    private String code; //城市名称
    private ArrayList<DistrictAddressBean>  areaCodeModel; //区信息

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

    public ArrayList<DistrictAddressBean> getAreaCodeModel() {
        return areaCodeModel;
    }

    public void setAreaCodeModel(ArrayList<DistrictAddressBean> areaCodeModel) {
        this.areaCodeModel = areaCodeModel;
    }
}
