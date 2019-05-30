package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.List;


/**
 * 商城首页对应的商品解析实体对象
 * @author liyc
 */
public class ShopGoodBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "ShopGoodBean [image=" + image + ", name=" + name + ", goods="
				+ shop + "]";
	}
	private List<Image>  image;
	
	public List<Image> getImage() {
		return image;
	}
	public void setImage(List<Image> image) {
		this.image = image;
	}
	public static class Image{
		private int id;
		private String src;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSrc() {
			return src;
		}
		public void setSrc(String src) {
			this.src = src;
		}
	}
	private Name name;
	public static class Name{
		private String name;
		private String url;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		@Override
		public String toString() {
			return "Name [name=" + name + ", url=" + url + "]";
		}
	};

	private List<Shop> shop;
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public List<Shop> getShop() {
		return shop;
	}
	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}
	public static class Shop {
		private String cat_name;
		private List<PartGood> goods;
		
		
		@Override
		public String toString() {
			return "Shop [cat_name=" + cat_name + ", goods=" + goods + "]";
		}


		public String getCat_name() {
			return cat_name;
		}


		public void setCat_name(String cat_name) {
			this.cat_name = cat_name;
		}


		public List<PartGood> getGoods() {
			return goods;
		}


		public void setGoods(List<PartGood> goods) {
			this.goods = goods;
		}


		public static class PartGood{
			private String image;
			public String getImage() {
				return image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			private String goods_id;
			private String name;
			private String price;
			
			public String getGoods_id() {
				return goods_id;
			}

			public void setGoods_id(String goods_id) {
				this.goods_id = goods_id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPrice() {
				return price;
			}

			public void setPrice(String price) {
				this.price = price;
			}

			@Override
			public String toString() {
				return "PartGood [goods_id=" + goods_id + ", name=" + name
						+ ", price=" + price + "]";
			}
			
		}
	
	}
}
