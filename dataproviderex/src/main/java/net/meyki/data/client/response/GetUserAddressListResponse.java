package net.meyki.data.client.response;

import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
public class GetUserAddressListResponse  extends JavaCommonResponse{
    public int totalRecords;
    public int pages;
    public boolean hasNext;
    public String extData;
    public List<UserAddressItem> list  = new ArrayList<UserAddressItem>();
}
