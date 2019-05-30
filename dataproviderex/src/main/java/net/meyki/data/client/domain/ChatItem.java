package net.meyki.data.client.domain;



import com.hyphenate.chat.EMMessage;

import java.io.Serializable;
import net.meyki.data.utils.CommUtils;

public class ChatItem implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3823332401694427105L;
	private long id;

    private String fromUserName;
    private String fromUserId;
    private String fromAvatar;
    private String fromloginname;

    private boolean isDeleted;
    private String message;
    private int specialTextType;
    private int messageContentType;
    private String position;
    private Short userType;

    private String sentTime;
    private Long questionAndAnswerId;

    private String username;
    private String userphoto;//用户头像

    private String thumb;//图片的缩略图
    private String url;//用户发送的url地址
    private String unreadNum;//未读消息数量
    private String usertag;//表示跟自己聊天用户的标识 易商 ： 1 易家： 0

    private String fileName;
    private String fileSize;
    private String filePath;

    private String voiceFilePath;
    private int voiceTimeLength;
    private boolean voiceUnreadFlag;

    private String billId;//转账账单id
    private String billMoney;//转账金额
    private String billDesc;//转账说明

    private String giveTicketId; //消费券转赠id
    private String ticketType; //消费券类型id 0美齐 1大唐


    /** 接收方的userId */
    private String touserId;
    /** 接收方的昵称 */
    private String touserName;
    /** 接收方的登录名 */
    private String tologinname;
    /** 接收方的tag标识 （易商：shop 易家 ：user） */
    private String toTag;
    /** 接收方的用户头像（易商为店铺头像） */
    private String toUserphoto;

    private EMMessage emMessage;


    public String getTouserId() {
        return touserId;
    }

    public void setTouserId(String touserId) {
        this.touserId = touserId;
    }

    public String getTouserName() {
        return touserName;
    }

    public void setTouserName(String touserName) {
        this.touserName = touserName;
    }

    public String getTologinname() {
        return tologinname;
    }

    public void setTologinname(String tologinname) {
        this.tologinname = tologinname;
    }

    public String getToUserphoto() {
        return toUserphoto;
    }

    public void setToUserphoto(String toUserphoto) {
        this.toUserphoto = toUserphoto;
    }

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    public String getFromloginname() {
        return fromloginname;
    }

    public void setFromloginname(String fromloginname) {
        this.fromloginname = fromloginname;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    public String getUsertag() {
        return usertag;
    }

    public void setUsertag(String usertag) {
        this.usertag = usertag;
    }

    public String getUnreadNum() {
        return unreadNum;
    }

    public void setUnreadNum(String unreadNum) {
        this.unreadNum = unreadNum;
    }

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ChatItem() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Short getUserType() {
        return this.userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public String getFromAvatar() {
        return this.fromAvatar;
    }

    public void setFromAvatar(String fromAvatar) {
        this.fromAvatar = fromAvatar;
    }

    public String getFromUserId() {
        return this.fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUserName() {
        return this.fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getSentTime() {
        return this.sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public Long getQuestionAndAnswerId() {
        return this.questionAndAnswerId;
    }

    public void setQuestionAndAnswerId(Long questionAndAnswerId) {
        this.questionAndAnswerId = questionAndAnswerId;
    }

    public int getMessageContentType() {
        return this.messageContentType;
    }

    public void setMessageContentType(int messageContentType) {
        this.messageContentType = messageContentType;
    }

    public String toString() {
        return CommUtils.addtoString(this);
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(String billMoney) {
        this.billMoney = billMoney;
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    public boolean isDeleted() {return isDeleted;}

    public void setDeleted(boolean deleted) {isDeleted = deleted;}

    public String getVoiceFilePath() {
        return voiceFilePath;
    }

    public void setVoiceFilePath(String voiceFilePath) {
        this.voiceFilePath = voiceFilePath;
    }

    public int getVoiceTimeLength() {
        return voiceTimeLength;
    }

    public void setVoiceTimeLength(int voiceTimeLength) {
        this.voiceTimeLength = voiceTimeLength;
    }

    public boolean getVoiceUnreadFlag() {
        return voiceUnreadFlag;
    }

    public void setVoiceUnreadFlag(boolean voiceUnreadFlag) {
        this.voiceUnreadFlag = voiceUnreadFlag;
    }

    public EMMessage getEmMessage() {
        return emMessage;
    }

    public void setEmMessage(EMMessage emMessage) {
        this.emMessage = emMessage;
    }

    public int getSpecialTextType() {
        return specialTextType;
    }

    public void setSpecialTextType(int specialTextType) {
        this.specialTextType = specialTextType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getGiveTicketId() {
        return giveTicketId;
    }

    public void setGiveTicketId(String giveTicketId) {
        this.giveTicketId = giveTicketId;
    }
}
