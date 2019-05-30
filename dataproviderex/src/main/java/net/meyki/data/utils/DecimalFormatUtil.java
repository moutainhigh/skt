package net.meyki.data.utils;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 格式化数字工具类
 * 
 * @author liyingchao
 * 
 */
public class DecimalFormatUtil {
	/**
	 * 将传入的数字格式化为保留两位数字
	 * 
	 * @param nubmer
	 *            需要格式化的数字
	 * @return 格式化好的数字
	 */
	public static String formatNumber2Decimal(double nubmer) {
		if (nubmer == 0) {
			return "0.00";
		} else {
			DecimalFormat df = new DecimalFormat("0.00");
			return df.format(nubmer);
		}
	}

	/**
	 * 将传入的字符串类型的数字格式化为保留两位小数
	 * 
	 * @param nubmer
	 *            需要格式化的字符串
	 * @return 格式化好的数字
	 */
	public static String formatNumber2Decimal(String nubmer) {
		String str = "0.00";
		try {
			double num = Double.valueOf(nubmer);
			str = formatNumber2Decimal(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 保留数字，去掉其中的小数部分，只保留整数部分
	 * 
	 * @return
	 */
	public static String formatNumberForInt(double number) {
		return Integer.valueOf(number + "") + "";
	}

	public static String formatNumberForInt(String number) {
		number = number.substring(0, number.lastIndexOf("."));
		return number;
	}

	/**
	 * 将传入的字符串类型转换成有效的字符串格式，如5.10 转换成5.1 ，5.0 转换成 5
	 * 
	 * @param str
	 * @return
	 */
	public static String convertValidStr(String str) {
		switch (isDecimals(str)) {
		case 0:// 整数0
		case 1:// 整形
		case 3:// 字符串
			break;
		case 2:// 小数
			if (str.indexOf(".") > 0) {
				// 正则表达
				str = str.replaceAll("0+?$", "");// 去掉后面无用的零
				str = str.replaceAll("[.]$", "");// 如小数点后面全是零则去掉小数点
			}
			break;
		}

		return str;
	}

	/**
	 * 判断是否为小数或者整数
	 * 
	 * @param str
	 * @return 0： 整数0 1:整数 2： 小数 3 ： 字符串
	 */
	public static int isDecimals(String str) {
		if ("0".equals(str)) {
			return 0;
		}
		Pattern pattern = Pattern.compile("^-?[1-9]\\d*$");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			// System.out.println("整形");
			return 1;
		} else if (Pattern
				.compile("^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$")
				.matcher(str).find()) {
			System.out.println("浮点型");
			return 2;
		} else {
			System.out.println("字符型");
			return 3;
		}
	}
}
