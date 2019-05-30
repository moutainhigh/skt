package meyki.distribution.dataprovider.domain;


/**
 * OcUsers entity. @author MyEclipse Persistence Tools
 */

public class OcUsersPart implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -311763237086454010L;
	private Integer userId;
	private String loginName;

	private String userName;

	private String userPhoto;

	// Constructors

	/** default constructor */
	public OcUsersPart() {
	}

	/**
	 * returns
	 * */
	public OcUsersPart(Integer userId, String loginName, String userName,
			String userPhoto) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.userPhoto = userPhoto;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

}