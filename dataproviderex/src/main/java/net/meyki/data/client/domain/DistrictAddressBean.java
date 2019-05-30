package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 项目名称：user-4.5.2
 * 类描述：特产馆城市列表
 * 创建人：xyp
 * 创建时间：2017/6/17 14:44
 * 修改人：meyki-bear
 * 修改时间：2017/6/17 14:44
 * 修改备注：
 */

public class DistrictAddressBean implements Serializable{
    private String codeName; //区域编码
    private String code; //区域名称

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
}
