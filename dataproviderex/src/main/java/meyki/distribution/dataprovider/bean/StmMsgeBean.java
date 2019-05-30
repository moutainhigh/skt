package meyki.distribution.dataprovider.bean;

/**
 * Created by Administrator on 2016/8/17.
 */
public class StmMsgeBean {
    public StmMsgeBean() {
    }
    public StmMsgeBean(String id, String isRead, String msgDetail, String msgTitle, String msg_type) {
        this.id = id;
        this.isRead = isRead;
        this.msgDetail = msgDetail;
        this.msgTitle = msgTitle;
        this.msg_type = msg_type;
    }
    public String id;          //id
    public String isRead;      //tag
    public String msgDetail;   //remarks
    public String msgTitle;   //title
    public String msg_type;   //msg_type

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

    @Override
    public String toString() {
        return "StmMsgeBean{" +
                "id='" + id + '\'' +
                ", isRead='" + isRead + '\'' +
                ", msgDetail='" + msgDetail + '\'' +
                ", msgTitle='" + msgTitle + '\'' +
                ", msg_type='" + msg_type + '\'' +
                '}';
    }
}
