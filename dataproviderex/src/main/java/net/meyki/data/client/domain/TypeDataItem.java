package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 易家首页面对应的部分
 */
public class TypeDataItem implements Serializable {
    public String typeId;
    public String typeName;
    public String typeImage;
    public String typeDesc;
    public String typeCate;
    public String typeNameImg;
    public List<DataList> dataList = new ArrayList<DataList>();
    public String isDefault;

}
