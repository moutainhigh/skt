package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2017/4/8.
 */
public class GetTicketAmountResponse extends JavaCommonResponse {

    private String lastAmount;


    public String getLastAmount() {
        return lastAmount;
    }

    public void setLastAmount(String lastAmount) {
        this.lastAmount = lastAmount;
    }

}
