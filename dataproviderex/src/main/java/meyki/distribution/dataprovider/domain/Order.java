package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
/**
 * 订单实体类
 * @author liyc
 */
public class Order implements Serializable {

	private static final long serialVersionUID = 1343392788843510323L;

	private long order_id;
	private String createtime;
	private String total_amount;
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", createtime=" + createtime
				+ ", total_amount=" + total_amount + "]";
	}
	
}
