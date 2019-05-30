package net.meyki.skt.bean;

import java.io.Serializable;
/**
 * 优品中商品列表
 * @author Administrator
 *
 */
public class ProductBean implements Serializable {
	public int id;//产品id
	public String image;//产品图片
	public double price;//价格
	public String title;//产品标题
	public String introduction;//产品介绍
	public int zanNumber;//点赞数
	public boolean isZan;//是否点赞
}
