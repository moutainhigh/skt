package net.meyki.data.concoupon.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Knight on 2017/3/30.
 */

public class QueryConMoneyAmountResponse extends JavaCommonResponse {
       private String data =new String();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
