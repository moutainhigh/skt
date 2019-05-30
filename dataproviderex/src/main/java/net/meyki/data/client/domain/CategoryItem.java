package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 易家首页面对应的部分
 */
public class CategoryItem implements Serializable {
    public String itemId;
    public String itemName;
    public String itemIco;
    public List<TypeDataItem> typeList = new ArrayList<TypeDataItem>();
}
