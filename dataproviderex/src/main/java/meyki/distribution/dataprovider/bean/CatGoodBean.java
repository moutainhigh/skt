package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.List;

import meyki.distribution.dataprovider.domain.Category;
import meyki.distribution.dataprovider.domain.Goo;


/**
 * 分类商品业务类
 * @author liyingchao
 *
 */
public class CatGoodBean  implements Serializable{

	public Category cat = new Category();
	
	public List<Goo> goods;
	
	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public List<Goo> getGoods() {
		return goods;
	}

	public void setGoods(List<Goo> goods) {
		this.goods = goods;
	}
}
