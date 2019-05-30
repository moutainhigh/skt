package meyki.distribution.dataprovider.bean;

import java.io.Serializable;

public class Mess implements Serializable{
	@Override
	public String toString() {
		return "Mess [title=" + title + ", info=" + info + "]";
	}
	private String title;
	private String info;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
