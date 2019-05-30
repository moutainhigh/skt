package meyki.distribution.dataprovider.domain;

public class ResultTemplate implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3242047924391309361L;
	private String result;
	private Object data;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
