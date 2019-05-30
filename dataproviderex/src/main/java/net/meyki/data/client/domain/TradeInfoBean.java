package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/19.
 */

public class TradeInfoBean implements Serializable{
    public String trdeType;//YES		交易类型
    public String trdeTime;//YES		交易时间
    public String money;//YES		金额
    public String tradeStatus;//YES		交易状态0：处理中1 ：成功；2：失败
    public String targetAccount;//YES		对方地址
    public String balance;//YES		余额
    public String tradeSn;//YES		交易编号

    @Override
    public String toString() {
        return "TradeInfoBean{" +
                "trdeType='" + trdeType + '\'' +
                ", trdeTime='" + trdeTime + '\'' +
                ", money='" + money + '\'' +
                ", tradeStatus='" + tradeStatus + '\'' +
                ", targetAccount='" + targetAccount + '\'' +
                ", balance='" + balance + '\'' +
                ", tradeSn='" + tradeSn + '\'' +
                '}';
    }
}
