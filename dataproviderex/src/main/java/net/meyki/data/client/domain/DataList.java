package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 易家首页面对应的部分
 */
public class DataList implements Serializable {
    public String dataId;
    public String dataName;
    public String dataImage;
    public String dataDesc;
    public String isDefault;
    public String dataType;
}
