package meyki.distribution.dataprovider.domain;


/**
 * 商品实体类
 * @author liyc
 *
 */
public class GoodEx extends Goo{
	

	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", price=" + price
				+ ", money=" + money + ", status=" + status + ", is_hot="
				+  ", image=" + image + ", good_id=" + good_id
				+ ", goods_id=" + goodsId + ", describe=" +  ", detailPic=" +  "]";
	}


	/** 商品操作 ：1表示未上架 2 表示已上架 */
	private String status;


	/** 无参数的构造方法 */
	public GoodEx(){};
	
	public GoodEx(int id,String name){
		this.id = id ;
		this.name = name;
	};
	public GoodEx(String[] imgUrl, String name, double price, String money,
			String status) {
		this.name = name;
		this.price = price;
		this.money = money;
		this.status = status;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
