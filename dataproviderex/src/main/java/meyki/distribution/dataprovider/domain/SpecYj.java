package meyki.distribution.dataprovider.domain;
/**
 * 商品分销规格和佣金实体
 * @author Meyki
 *
 */
public class SpecYj {
	private int product_id;
	
	private String spec_value;
	
	private String top;
	
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
		return "SpecYj [product_id=" + product_id + ", spec_value="
				+ spec_value + ", top=" + top + ", price=" + price + "]";
	}
}
