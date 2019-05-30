package net.meyki.data.client.response;

import net.meyki.data.client.domain.TradeInfoBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/19.
 */

public class QueryTradeInfoResponse extends JavaCommonResponse {
    public List<TradeInfoBean> list = new ArrayList<>(); //交易记录 0:充值(提现)记录 1：提币记录；2：充币记录
}
