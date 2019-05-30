package meyki.distribution.dataprovider.domain;

import java.util.Arrays;
import java.util.List;

/**
 * 商品实体类
 * @author liyc
 *
 */
public class Good extends Goo {
	//public String goodCateId;
	public String name;
	public String goodId;
	public String goodsName;
	public String goodsDesc;
	public String goodsStock;
	public String marketPrice;
	public int goodsCats;
	public String goodsUnit;
	public List<Img> img;
	public boolean isChecked = false;

	public class Img{
		public String goodsImg;
		public String id;
	}
	//	public List<String> goodsImgs; 
	public String goodsImg;

	@Override
	public String toString() {
		return "Good [goodId=" + goodId + ", goodsName=" + goodsName
				+ ", goodsDesc=" + goodsDesc+ ", goodsStock=" 
				+ goodsStock + ", goodsImgs=" + goodsImg
				+ "]";
	}

	//	/** 序列化编号接口*/
	//	private static final long serialVersionUID = 1749362304808569611L;
	//	/** 商品主键id */
	//	private int id ;
	//	/** 商品名称  */
	//	private String name;
	//	/** 商品价格  */
	//	private double price;
	//	/** 商品佣金，如 5%  */
	//	private String money;
	/** 商品操作 ：1表示未上架 2 表示已上架 */
	private int status;
	/** 促销商品 */
	private int is_hot;
	//	/** 在商品列表页面商品主图url */
	//	private String image;
	//	
	//	private int good_id;
	//	private int goods_id;

	//	public int getGoods_id() {
	//		return goods_id;
	//	}
	//
	//	public void setGoods_id(int goods_id) {
	//		this.goods_id = goods_id;
	//	}

	private String describe;

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	//	public int getGood_id() {
	//		return good_id;
	//	}
	//
	//	public void setGood_id(int good_id) {
	//		this.good_id = good_id;
	//	}

	/** 无参数的构造方法 */
	public Good(){};

	public Good(int id,String name){
		this.id = id ;
		this.name = name;
	};
	public Good(String[] imgUrl, String name, double price, String money,
			int status) {
		this.name = name;
		this.price = price;
		this.money = money;
		this.status = status;
	}
	public int getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}

	//	public String getImage() {
	//		return image;
	//	}
	//
	//	public void setImage(String image) {
	//		this.image = image;
	//	}

	private String[] detailPic;

	//	public int getId() {
	//		return id;
	//	}
	//
	//	public void setId(int id) {
	//		this.id = id;
	//	}

	//	public String getName() {
	//		return name;
	//	}
	//
	//	public void setName(String name) {
	//		this.name = name;
	//	}

	//	public double getPrice() {
	//		return price;
	//	}
	//
	//	public void setPrice(double price) {
	//		this.price = price;
	//	}

	public String[] getDetailPic() {
		return detailPic;
	}

	public void setDetailPic(String[] detailPic) {
		this.detailPic = detailPic;
	}

	//	public String getMoney() {
	//		return money;
	//	}

	//	public void setMoney(String money) {
	//		this.money = money;
	//	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getGoodId() {
		return goodId;
	}

	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(String goodsStock) {
		this.goodsStock = goodsStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoodsCats() {
		return goodsCats;
	}

	public void setGoodsCats(int goodsCats) {
		this.goodsCats = goodsCats;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

}