package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 实体bean
 * 
 * @author hulei
 * 
 */
public class NewVersionBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8405557167774760942L;
	public int versionCode;
	public String versionName;
	public String des;
	public String history;
	public String download;
	public String updateTime;

	public int getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
