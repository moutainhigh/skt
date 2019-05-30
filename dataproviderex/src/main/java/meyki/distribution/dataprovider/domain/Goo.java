package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 商品实体类
 * @author liyc
 *
 */
public class Goo implements Serializable {
	

	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", price=" + price
				+ ", money=" + money + ",  + "+ ", image=" + image + ", good_id=" + good_id
				+ ", goods_id=" + goodsId + ", detailPic=" + "]";
	}

	/** 序列化编号接口*/
	public static final long serialVersionUID = 1749362304808569611L;
	/** 商品主键id */
	public int id ;
	/** 商品名称  */
	public String name;
	/** 商品价格  */
	public double price;
	/** 商品佣金，如 5%  */
	public String money;
//	/** 商品操作 ：1表示未上架 2 表示已上架 */
//	private int status;
//	/** 促销商品 */
//	private int is_hot;
	/** 在商品列表页面商品主图url */
	public String image;
	
	public int good_id;
	public int goodsId;
	

//	private String describe;
//	
//	public String getDescribe() {
//		return describe;
//	}
//
//	public void setDescribe(String describe) {
//		this.describe = describe;
//	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getGood_id() {
		return good_id;
	}

	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}

	/** 无参数的构造方法 */
	public Goo(){};
	
	public Goo(int id,String name){
		this.id = id ;
		this.name = name;
	};
	public Goo(String[] imgUrl, String name, double price, String money) {
		this.name = name;
		this.price = price;
		this.money = money;
	}

//	public int getIs_hot() {
//		return is_hot;
//	}
//
//	public void setIs_hot(int is_hot) {
//		this.is_hot = is_hot;
//	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	//private String[] detailPic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public String[] getDetailPic() {
//		return detailPic;
//	}
//
//	public void setDetailPic(String[] detailPic) {
//		this.detailPic = detailPic;
//	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	private String aid;
	private String images;
//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

}
