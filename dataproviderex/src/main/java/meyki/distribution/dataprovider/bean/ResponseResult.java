package meyki.distribution.dataprovider.bean;
/**
 * 服务端响应的结果格式对应的实体
 * 
 * 格式——  result :"" ,Message :""
 * @author Administrator
 *
 */
public class ResponseResult {
	/** 响应结果 */
	private String result;
	/** 响应的信息内容 */
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
	@Override
	public String toString() {
		return "ResponseResult [result=" + result + ", message=" + message
				+ "]";
	}
	
}
