package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

import meyki.distribution.dataprovider.bean.GoodBean;


/**
 * 商品详情页面对应的实体类
 * @author liyc
 */
public class GoodInfo  implements Serializable{
	private String result;
	private String message;
	private GoodBean data;
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
	public GoodBean getData() {
		return data;
	}
	public void setData(GoodBean data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "GoodInfo [result=" + result + ", message=" + message
				+ ", data=" + data + "]";
	}
}
