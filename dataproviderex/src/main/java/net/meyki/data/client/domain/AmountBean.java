package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/28.
 */
public class AmountBean implements Serializable {
    public String fkTicketId	;			//out		String								YES		消费券种类ID
    public String ticketCategory;			//													消费券种类
    public String ticketName	;			//												消费券名称
    public String ticketLogo	;			//												消费券logo
    public String totalAmount	;			//												消费券总金额(大唐消费券总金额or美齐消费券总金额)

    @Override
    public String toString() {
        return "AmountBean{" +
                "fkTicketId='" + fkTicketId + '\'' +
                ", ticketCategory='" + ticketCategory + '\'' +
                ", ticketName='" + ticketName + '\'' +
                ", ticketLogo='" + ticketLogo + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                '}';
    }
}
