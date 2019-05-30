package meyki.data.json.bean;

import java.io.Serializable;

/**
 * 响应的bean
 * 
 * @author hulei
 * 
 */
public class BankMoneyBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5270012146398615528L;
	private String money;
	private String message;
	private String addtime;

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
}
