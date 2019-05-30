package net.meyki.skt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;


/**
 * 时间工具类
 * 
 * @author liyc
 */
public class TimeUtil {
	
	public static final String DATE_FORMAT = "yyyy.MM.dd HH:mm:ss";
	public static final String DATE_FORMAT_H_M = "yyyy.MM.dd HH:mm";
	public static final String DATE_FORMAT_Y_M_D = "yyyy.MM.dd";
	public static final String DATE_FORMAT_Y_M_D_2 = "yyyy年MM月dd日";
	
	public static final String RED_DATE_FORMAT = "HH:mm yyyy.MM.dd";
	// 年月日小时分格式
	public static final String FORMAT_MINUS_SECOND_DATE = "yyyy-MM-dd HH:mm";

	public static String getDateToMinusSecond(long time) {
		return new SimpleDateFormat(FORMAT_MINUS_SECOND_DATE).format(new Date(
				time));
	}

	/**
	 * 将字符串格式的时间戳转换成自定义的日期格式
	 * 
	 * @param timeStampString
	 *            需要转换的字符串格式的时间戳
	 * @param format
	 *            指定转换的格式
	 * @return 转换好的日期格式
	 */
	public static String timeStamp2Date(String timeStampString, String format) {
		String date = null;
		try {
			Long timestamp = Long.parseLong(timeStampString+"000");
			date = new SimpleDateFormat(format).format(new Date(timestamp));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 将带毫秒字符串的时间戳改成日期字符串
	 * @param timeStampString
	 * @param format
	 * @return
	 */
	public static String timeStamp2DateEx(String timeStampString, String format) {
		String date = null;
		try {
			Long timestamp = Long.parseLong(timeStampString);
			date = new SimpleDateFormat(format).format(new Date(timestamp));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	public static String timeStamp2DateEx2(String timeStampString, String format) {
		String date = null;
		try {
			Long timestamp = Long.parseLong(timeStampString);
			date = new SimpleDateFormat(format).format(new Date(timestamp*1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	public static String timeStamp2DateEx3(String data, String format) {
		String str = null;
		Date d;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d = sdf.parse(data);
			String date = new SimpleDateFormat(format).format(d);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}
	public static String timeStamp2DateEx4(String data, String format) {
		//format = "HH:mm:ss"
		SimpleDateFormat formatter = new SimpleDateFormat(format);//初始化Formatter的转换格式。\
		Date date=new Date(Long.parseLong(data));
		data = formatter.format(date);
		return data;

	}
	/**
	 * 获取当前日期的时间戳字符串(精确到秒)
	 * @return
	 */
	public static String getTime(String data) {
		String str = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d;
		try {
			d = sdf.parse(data);
			long l = d.getTime()/1000;
			str = String.valueOf(l);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * 验证时间的有效性
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @return 验证结果
	 * 验证条件 开始时间不小于当前时间，结束时间不小于当前时间
	 */
	public static boolean checkStartAndEndTime(String startTime,String endTime){
		if(TextUtils.isEmpty(startTime)|| TextUtils.isEmpty(endTime)){//开始时间或结束时间为空时
			return false;
		}
		long now = System.currentTimeMillis()/1000;//当前时间时间戳,精确到秒
		if(Long.valueOf(TimeUtil.getTime(startTime + " 00:00:01"))> now
				&&Long.valueOf(TimeUtil.getTime(endTime + " 23:59:59"))> now //结束时间大于当前时间
				&& Long.valueOf(TimeUtil.getTime(endTime+ " 23:59:59"))> //结束时间大于开始时间
			Long.valueOf(TimeUtil.getTime(startTime + " 00:00:01"))){    
			return true;
		}
		return false;
	}
	
	public static String getTimeDisitance(String startTime, String endTime)
			throws ParseException {
		// TODO Auto-generated method stub
		if (!TextUtils.isEmpty(startTime) && !TextUtils.isEmpty(endTime)) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// java.util.Date now = df.parse(endTime);
			// java.util.Date date = df.parse(startTime);
			java.util.Date now = new Date(Long.parseLong(endTime));
			java.util.Date date = new Date(Long.parseLong(startTime));
			long l = now.getTime() - date.getTime();
			long day = l / (24 * 60 * 60 * 1000);
			long hour = (l / (60 * 60 * 1000) - day * 24);
			long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
			long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			System.out.println("" + day + "天" + hour + "小时" + min + "分" + s
					+ "秒");
			return "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
		}
		return "";
	}
	public static String getTimeDisitance(long startTime, String endTime)
			throws ParseException {
		// TODO Auto-generated method stub
		if (!TextUtils.isEmpty(endTime)) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// java.util.Date now = df.parse(endTime);
			// java.util.Date date = df.parse(startTime);
			java.util.Date now = new Date(Long.parseLong(endTime));
			//java.util.Date date = new Date(Long.parseLong(startTime));
			long l = now.getTime() - startTime;
			long day = l / (24 * 60 * 60);
			long hour = (l / (60 * 60 ) - day * 24);
			long min = ((l / (60 )) - day * 24 * 60 - hour * 60);
			long s = (l  - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			System.out.println("" + day + "天" + hour + "小时" + min + "分" + s
					+ "秒");
			return "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
		}
		return "";
	}
	/**
	 * 倒计时效果
	 * @param endTime 距离结束时间的时间戳
	 * @return   2:10:56
	 * @throws ParseException
	 */
	public static String getTimeDisitance(long endTime)
			throws ParseException {
		// TODO Auto-generated method stub
			// java.util.Date now = df.parse(endTime);
			// java.util.Date date = df.parse(startTime);
		if(endTime!= 0){
			long l = endTime;
			long day = l / (24 * 60 * 60);
			long hour = (l / (60 * 60) - day * 24);
			long min = ((l / (60)) - day * 24 * 60 - hour * 60);
			long s = (l- day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			System.out.println("" + day + "天" + hour + "小时" + min + "分" + s
					+ "秒");
			String h = "";
			String m = "";
			String ss = "";
					
			if(hour<10){
				 h = "0"+hour;
			}else{
				h = ""+hour;
			}
			if(min<10){
				m ="0"+ min;
			}else{
				m = ""+min;
			}
			if(s<10){
				ss ="0"+ s;
			}else{
				ss = ""+s;
			}
			return  h + ":" + m + ":" + ss;
		}
		return "";
	}
	
	/**
	 * 隐藏软键盘
	 */
	public static void hideSoftKeybroad(Activity context) {
		/* 隐藏软键盘 */
		InputMethodManager inputMethodManager = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		if (null != inputMethodManager && inputMethodManager.isActive()) {
			inputMethodManager.hideSoftInputFromWindow(context.getCurrentFocus().getWindowToken(), 0);
		}
	}
	/**
	 * 验证时间的有效性
	 * @param startTime 开始时间
	 * @param
	 * @return 验证结果
	 * 验证条件 开始时间不小于当前时间，结束时间不小于当前时间
	 */
	public static boolean checkStartTime(String startTime){
		if(TextUtils.isEmpty(startTime)){//开始时间或结束时间为空时
			return false;
		}

		if(Long.valueOf(TimeUtil.getTime(startTime+ " 23:59:59"))> System.currentTimeMillis()/1000)
		{  
			return true;
		}

		return false;
	}

	/**
	 * 验证时间的有效性
	 * @param
	 * @param endTime 结束时间
	 * @return 验证结果
	 * 验证条件 开始时间不小于当前时间，结束时间不小于当前时间
	 */
	public static boolean checkEndTime(String endTime){
		if(TextUtils.isEmpty(endTime)){//开始时间或结束时间为空时
			return false;
		}

		if(Long.valueOf(TimeUtil.getTime(endTime+ " 23:59:59"))> System.currentTimeMillis()/1000)
		{  
			return true;
		}

		return false;
	}
	/**
	 * 验证时间的有效性
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @return 验证结果
	 * 验证条件 开始时间不小于当前时间，结束时间不小于当前时间
	 */
	public static boolean checkStartEnd(String startTime,String endTime){			
		long now = System.currentTimeMillis()/1000;//当前时间时间戳,精确到秒
		if(
				(!TextUtils.isEmpty(startTime)) &&
				(!TextUtils.isEmpty(endTime)) &&
				(Long.parseLong(TimeUtil.getTime(startTime + " 00:00:00"))>now) && 
				(Long.parseLong(TimeUtil.getTime(endTime + " 23:59:59"))>now) &&
				(Long.parseLong(TimeUtil.getTime(startTime+ " 00:00:00"))<Long.valueOf(TimeUtil.getTime(endTime + " 23:59:59"))))
		{
			return true;
		}
		
		return false;
	}

	public static String getTimeDisitance2(String currentTime, String endTime)
			throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(!TextUtils.isEmpty(currentTime) && !TextUtils.isEmpty(endTime)){
			try {
				java.util.Date end_date = myFormatter.parse(endTime + " 23:59:59");
				java.util.Date current_date = myFormatter.parse(currentTime);
				long l = (end_date.getTime() - current_date.getTime()) / 1000;
				long day = l / (24 * 60 * 60);
				long hour = (l / (60 * 60) - day * 24);
				long min = ((l / (60 )) - day * 24 * 60 - hour * 60);
				long s = (l - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
				return day + "天" + hour + "小时" + min + "分" + s + "秒";
			} catch (Exception e) {
				return "";
			}
		}
		return "";
	}
}
