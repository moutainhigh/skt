package net.meyki.data.client.response;

import net.meyki.data.client.domain.GalleryItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 店铺详细页面对应的实体类
 * 
 * @author liyingchao
 * 
 */
public class GoodsDetatilResponse extends JavaCommonResponse {
	/**
	 *  [goodsName] => 测试    //商品名称
            [price] => 98762.40    // 销售价 或者是折后价
            [goodsDesc] => 123456   // 商品详情
            [marketPrice] => 123453.00  // 市场价
            [is_discount] => 1
             //is_discount 1 表示无折扣，2 是折后价
            [image] => Array   //幻灯片
            (
                [0] => stdClass Object
                (
                    [goodsImg] => Public/shopimages/8c55ae0d65633e26c24b78717aa4a002.png
                )

            )
	 */
	private static final long serialVersionUID = 7507299478232169279L;
	public String goodsId;
	public String shopId;
	public String attrCatId;
	public String catName;
	public String goodsName;//商品名称
	public String price;// 销售价 或者是折后价
	public String goodsDesc;// 商品详情
	public String goodsUnit;
	public Double shopPrice;// 市场价
	public int is_discount;// is_discount 1 表示无折扣，2 是折后价
	public List<GalleryItem> gallerys = new ArrayList<GalleryItem>();// 幻灯片

	public Double getShopPrice() {
		return shopPrice;
	}

	public void setShopPrice(Double shopPrice) {
		this.shopPrice = shopPrice;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getAttrCatId() {
		return attrCatId;
	}

	public void setAttrCatId(String attrCatId) {
		this.attrCatId = attrCatId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}



	public int getIs_discount() {
		return is_discount;
	}

	public void setIs_discount(int is_discount) {
		this.is_discount = is_discount;
	}

	public List<GalleryItem> getGallerys() {
		return gallerys;
	}

	public void setGallerys(List<GalleryItem> gallerys) {
		this.gallerys = gallerys;
	}
}
