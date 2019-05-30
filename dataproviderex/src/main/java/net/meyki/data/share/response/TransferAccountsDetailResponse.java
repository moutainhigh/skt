package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TransferAccountsDetailResponse extends JavaCommonResponse {
    public String payUserId;
    public String receiveUserId;
    public double money;
    public String status;
    public String transferTime;
    public String receiveTime;
    public String overTime;
}
