package net.meyki.skt.bean;

/**
 * Created by Administrator on 2016/8/17.
 */
public class StmMsgeBean {

    public String id;          //id
    public String isRead;      //tag
    public String msgDetail;   //remarks
    public String msgTitle;   //title
    public String msg_type;   //msg_type
    public String order_id; //orderId
    public String consumption_type;
    public String order_type;

    public StmMsgeBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getMsgDetail() {
        return msgDetail;
    }

    public void setMsgDetail(String msgDetail) {
        this.msgDetail = msgDetail;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getConsumption_type() {
        return consumption_type;
    }

    public void setConsumption_type(String consumption_type) {
        this.consumption_type = consumption_type;
    }

    @Override
    public String toString() {
        return "StmMsgeBean{" +
                "id='" + id + '\'' +
                ", isRead='" + isRead + '\'' +
                ", msgDetail='" + msgDetail + '\'' +
                ", msgTitle='" + msgTitle + '\'' +
                ", msg_type='" + msg_type + '\'' +
                ", order_id='" + order_id + '\'' +
                ", consumption_type='" + consumption_type + '\'' +
                '}';
    }
}
