package net.meyki.skt.mainPage.bean;

import net.meyki.data.client.domain.GalleryItem;

import java.io.Serializable;
import java.util.List;

/**
 * 用来与进行交互的商品实体类
 * @author liyc
 */
public class GoodBean implements Serializable{
	private String id;
	private String name;
	private String price;
	private String cat;
	private String status;//1 我要代理 2 取消代理
	private String share_money;
	private Bonus bonus;
	private String intro;
	private String intro1;
	private List<GalleryItem> image;
	private Spec spec;
	private String marketPrice;
	
	
	
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public List<GalleryItem> getImage() {
		return image;
	}
	public void setImage(List<GalleryItem> image) {
		this.image = image;
	}
	public String getIntro1() {
		return intro1;
	}
	public void setIntro1(String intro1) {
		this.intro1 = intro1;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShare_money() {
		return share_money;
	}
	public void setShare_money(String share_money) {
		this.share_money = share_money;
	}
	public Bonus getBonus() {
		return bonus;
	}
	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}
	
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
//	public List<Image> getImage() {
//		return image;
//	}
//	public void setImage(List<Image> image) {
//		this.image = image;
//	}
	public Spec getSpec() {
		return spec;
	}
	public void setSpec(Spec spec) {
		this.spec = spec;
	}
	public static class Bonus implements Serializable{
		private String result;
		private String message;
		@Override
		public String toString() {
			return "Bonus [result=" + result + ", message=" + message + "]";
		}
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
		
	}
	
	
	
//	public static class Image implements Serializable{
//		@Override
//		public String toString() {
//			return "Image [url=" + url + "]";
//		}
//
//		private String url;
//
//		public String getUrl() {
//			return url;
//		}
//
//		public void setUrl(String url) {
//			this.url = url;
//		}
//	}
	public static class Spec implements Serializable{
		public String result;
		public List<Mess> mess;
		@Override
		public String toString() {
			return "Spec [result=" + result + ", mess=" + mess + "]";
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public List<Mess> getMess() {
			return mess;
		}
		public void setMess(List<Mess> mess) {
			this.mess = mess;
		}
	}
	@Override
	public String toString() {
		return "GoodBean [id=" + id + ", name=" + name + ", price=" + price
				+ ", cat=" + cat + ", status=" + status + ", share_money="
				+ share_money + ", bonus=" + bonus + ", intro=" + intro
				+ ", image=" + image + ", spec=" + spec + "]";
	}
	
}
