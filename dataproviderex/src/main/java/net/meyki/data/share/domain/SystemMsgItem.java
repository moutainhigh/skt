package net.meyki.data.share.domain;

import java.io.Serializable;

public class SystemMsgItem implements Serializable {
    /**
	 *
	 */
	private static final long serialVersionUID = -3823332401694427105L;
    public String message;
    public long id;
    public String type;
    public String tag;
    public String title;
    public String avator;
    public String userId;
    public String nickName;
    public String loginName;
    public String msg_type;
    public String remarks;
    public long time;
    public String systemId;
    public String isSelect;
}
