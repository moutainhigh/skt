package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.List;

public class StoreLogo implements Serializable{
	@Override
	public String toString() {
		return "StoreLogo [result=" + result + ", data=" + data + ", message="
				+ message + "]";
	}

	private String result;
	public  Data data;
	private String message;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static class Data{
		
		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		private String url;
	}
}
