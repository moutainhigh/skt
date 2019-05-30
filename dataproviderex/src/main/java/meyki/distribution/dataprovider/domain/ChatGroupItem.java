package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class ChatGroupItem implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3823332401694427105L;
	private Long id;
	private String username;
	private String userphoto;
	private String addtime;
	private String fromGroupId;
	private Short messageContentType;
	private String fromUserId;
    private String fromUserName;
    private Short userType;
    private String message;
    private String position;
    private String fromAvatar;
    private Long questionAndAnswerId;
    private String thumb;//图片的缩略图
    private String url;//用户发送的url地址
    private String redpacketId;
    private boolean redpacketNone = false;
    
    
	public boolean isRedpacketNone() {
		return redpacketNone;
	}
	public void setRedpacketNone(boolean redpacketNone) {
		this.redpacketNone = redpacketNone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRedpacketId() {
		return redpacketId;
	}
	public void setRedpacketId(String redpacketId) {
		this.redpacketId = redpacketId;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getFromGroupId() {
		return fromGroupId;
	}
	public void setFromGroupId(String fromGroupId) {
		this.fromGroupId = fromGroupId;
	}
	public int getMessageContentType() {
		return messageContentType;
	}
	public void setMessageContentType(Short messageContentType) {
		this.messageContentType = messageContentType;
	}
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public Short getUserType() {
		return userType;
	}
	public void setUserType(Short userType) {
		this.userType = userType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFromAvatar() {
		return fromAvatar;
	}
	public void setFromAvatar(String fromAvatar) {
		this.fromAvatar = fromAvatar;
	}
	public Long getQuestionAndAnswerId() {
		return questionAndAnswerId;
	}
	public void setQuestionAndAnswerId(Long questionAndAnswerId) {
		this.questionAndAnswerId = questionAndAnswerId;
	}
    
    
}
