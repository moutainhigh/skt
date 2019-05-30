package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.StoreCatItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/7.
 */
public class GetStoreCatResponse extends JavaCommonResponse{

    public List<StoreCatItem> list = new ArrayList<StoreCatItem>();
}
