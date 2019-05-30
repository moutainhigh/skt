package meyki.distribution.dataprovider.domain;

/**
 * 对应服务器端xml的实体类
 * @author Administrator
 *
 */
public class UpdataInfo {
	/** 版本信息 */
	private String version;
	/**服务端的url地址i*/
	private String url;
	/** 描述 */
	private String description;
	/** 服务端的url地址 */
	private String url_server;
	
	public String getUrl_server() {

		return url_server;

	}

	public void setUrl_server(String url_server) {

		this.url_server = url_server;

	}

	public String getVersion() {

		return version;

	}

	public void setVersion(String version) {

		this.version = version;

	}

	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {

		this.url = url;

	}

	public String getDescription() {

		return description;

	}

	public void setDescription(String description) {

		this.description = description;

	}

}
