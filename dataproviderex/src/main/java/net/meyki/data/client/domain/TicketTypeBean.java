package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/8.
 */
public class TicketTypeBean implements Serializable {

    private String ticketName; //抵用券名称
    private String ticketType; //抵用券类型
    private String ticketId; //抵用券类型ID

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

}
