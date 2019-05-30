package net.meyki.data.concoupon.response;

import net.meyki.data.concoupon.domain.PhoneCodeBean;
import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Knight on 2017/3/30.
 */

public class QueryPhoneCodeResponse extends JavaCommonResponse {
        private PhoneCodeBean data ;

    public PhoneCodeBean getData() {
        return data;
    }

    public void setData(PhoneCodeBean data) {
        this.data = data;
    }
}
