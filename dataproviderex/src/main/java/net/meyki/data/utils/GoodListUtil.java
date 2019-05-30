package net.meyki.data.utils;



import java.util.ArrayList;
import java.util.List;

import meyki.distribution.dataprovider.domain.Good;


/**
 * 处理list集合数据的工具类
 * @author liyc
 */
public class GoodListUtil {
	
	public static List<Good> castRepate(List<Good> list1,List<Good> list2){
		List<Good> list = new ArrayList<Good>();
		//先将第一个集合添加到数据中去 
		for (int i = 0; i < list1.size(); i++) {
			list.add(list.get(i));
		}
		boolean flag = true;
		//添加第二个集合中的数据到第一个集合中
		for (int i = 0; i < list2.size(); i++) {
			//将第二个集合中的每一个元素都拿出来与之前存储的list集合进行比较，一旦
			for (int j = 0; j < list.size(); j++) {
				if(list2.get(i).getId()== list.get(j).getId()){
					flag = false;
					break;
				}
			}
			//判断标识，如果判断
			if(flag){
				list.add(list2.get(i));
			}
		}
		return list;
	}
	
}
