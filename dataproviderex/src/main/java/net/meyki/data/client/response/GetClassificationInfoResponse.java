package net.meyki.data.client.response;

import net.meyki.data.client.domain.CountryScreenBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/18.
 */
public class GetClassificationInfoResponse extends JavaCommonResponse{
    public List<CountryScreenBean> listInfo  = new ArrayList<CountryScreenBean>();
}
