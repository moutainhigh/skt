package net.meyki.data.client.response;

import net.meyki.data.client.domain.BrandChainBean;
import net.meyki.data.json.JavaCommonResponse;

import org.json.JSONArray;

import java.util.List;

/**
 * Created by Administrator on 2016/7/28 0028.
 */
public class BrendChainReponse extends JavaCommonResponse {
    public String extData;
    public int totalRecords;//					out		String								YES		总记录数
    public int pages;//					out		String								YES		总页数
    public boolean hasNext;//					out		boolean								YES		是否有下一页,true:有下一页，false：无下一页
    public List<BrandChainBean> list;//					out		JSONArray								YES		店铺列表

}
