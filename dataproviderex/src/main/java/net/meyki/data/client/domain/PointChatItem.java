package net.meyki.data.client.domain;


import java.io.Serializable;


/**
 * 点对点聊天记录对应实体，存储在本地数据库，点对点聊天记录表中存储的Object
 * Created by Administrator on 2016/5/23.
 */
public class PointChatItem implements Serializable{

    public long id;
    /** 用户 易商/易家 标识 */
    public String tag;
    /** 发送人的登录名 */
    public String fromloginname;

    public String tologinname;

    public String key;

    public String from_to;

    public ChatItem chatitem;

}
