package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2017/3/28.
 */
public class TransferConResponse extends JavaCommonResponse {

    private String giveTicketId;
    private Object content;

    public String getGiveTicketId() {
        return giveTicketId;
    }

    public void setGiveTicketId(String giveTicketId) {
        this.giveTicketId = giveTicketId;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
