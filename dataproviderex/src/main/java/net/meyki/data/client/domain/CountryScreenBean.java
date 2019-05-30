package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 项目名称：4.2.2
 * 类描述：特产馆列表的过滤实体类
 * 创建人：meyki-bear
 * 创建时间：2017/3/3 10:39
 * 修改人：meyki-bear
 * 修改时间：2017/3/3 10:39
 * 修改备注：
 */

public class CountryScreenBean implements Serializable{
    private String code; //调用查询结构时需要的code
    private String value; // 要显示的文字
    public boolean isChecked; //是否被选中
    private String icon; //要显示的图片

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
