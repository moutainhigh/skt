package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
@Deprecated
public class ChatItem implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3823332401694427105L;
	private Long id;
    private String fromUserName;
    private String fromUserId;
    private String message;
    private Short messageContentType;
    private String position;
    private Short userType;
    private String fromAvatar;
    private String sentTime;
    private Long questionAndAnswerId;
	private String username;
    private String thumb;//图片的缩略图
    private String url;//用户发送的url地址
    
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public Short getMessageContentType() {
        return this.messageContentType;
    }

    public void setMessageContentType(Short messageContentType) {
        this.messageContentType = messageContentType;
    }

    public String toString() {
        return CommUtils.addtoString(this);
    }
}
