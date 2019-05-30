package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2017/1/19.
 */
public class QueryChargeVrcodeInfoRespone extends JavaCommonResponse {
    public String address;	//当前用户对应的地址信息
    public String vrcodeURL;	//二维码地址

}
