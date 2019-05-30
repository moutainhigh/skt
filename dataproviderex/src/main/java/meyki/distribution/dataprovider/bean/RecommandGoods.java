package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 资讯首页实体类
 * @author zhaoli
 */
public class RecommandGoods extends InfoResult implements Serializable{

	private static final long serialVersionUID = 1L;
	public String page ;
	public String nextpage ;
	public String cate ;
	@Override
	public String toString() {
		return "RecommandGoods [infolist size=" + mess.size()+ "]";
	}
	public ArrayList<Item> colum= new ArrayList<Item>();
	public ArrayList<Item> mess= new ArrayList<Item>();
	//public ArrayList<Category> cat = new ArrayList<Category>();
	//public HashMap<Ineger,> items
	
}
