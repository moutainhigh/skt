package net.meyki.skt.utils;

import java.text.DecimalFormat;

/**
 * 数字工具类
 * */
public class NumberUtil {

	/**
	 * 将double型数字保留2位小数
	 * @param number 需要转化的小数
	 * @return 转换结果
	 */
	public static String number2str(double number){
		DecimalFormat df = new DecimalFormat("#.00");  
		return df.format(number);
		
	}
}
