package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.BankCardListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/19.
 */

public class ExchangePageResponse extends JavaCommonResponse {
    /**
     *
     */
    private static final long serialVersionUID = -3787734915509974039L;
    /**  获取银行卡列表实体类bean */
    public List<BankCardListBean> list = new ArrayList<BankCardListBean>();
    public String money;
    public String radio;
}
