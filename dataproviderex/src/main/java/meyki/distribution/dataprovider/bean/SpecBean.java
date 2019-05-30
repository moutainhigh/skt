package meyki.distribution.dataprovider.bean;

import java.io.Serializable;

/**
 * 修改商品佣金时，响应回来的商品规格对应实体Bean
 * @author liyc
 *
 */
public class SpecBean implements Serializable{

	private static final long serialVersionUID = -7029240554041922102L;
	/** 产品id */
	private int product_id;
	/** 规格的value值 */
	private String spec_value;
	/** 商品分销佣金的最大比例 */
	private String top;
	/** 上次修改的值，首次与top值一样 */
	private String price;
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getSpec_value() {
		return spec_value;
	}
	public void setSpec_value(String spec_value) {
		this.spec_value = spec_value;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SpecBean [product_id=" + product_id + ", spec_value="
				+ spec_value + ", top=" + top + ", price=" + price + "]";
	}
	
}
