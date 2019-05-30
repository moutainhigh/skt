package net.meyki.skt.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.text.TextUtils;

public class IntervalUtil {

	public static String getInterval(String createtime) { // 传入的时间格式必须类似于2012-8-21
															// 17:53:20这样的格式
		String interval = null;

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date d1 = (Date) sd.parse(createtime, pos);

		// 用现在距离1970年的时间间隔new
		// Date().getTime()减去以前的时间距离1970年的时间间隔d1.getTime()得出的就是以前的时间与现在时间的时间间隔
		long time = new Date().getTime() - d1.getTime();// 得出的时间间隔是毫秒

		if (time / 1000 < 10 && time / 1000 >= 0) {
			// 如果时间间隔小于10秒则显示“刚刚”time/10得出的时间间隔的单位是秒
			interval = "刚刚";

		} else if (time / 1000 < 60 && time / 1000 > 0) {
			// 如果时间间隔小于60秒则显示多少秒前
			int se = (int) ((time % 60000) / 1000);
			interval = se + "秒前";
		} else if (time / 60000 < 60 && time / 60000 > 0) {
			// 如果时间间隔小于60分钟则显示多少分钟前
			int m = (int) ((time % 3600000) / 60000);// 得出的时间间隔的单位是分钟
			interval = m + "分钟前";

		} else if (time / 3600000 < 24 && time / 3600000 >= 0) {
			// 如果时间间隔小于24小时则显示多少小时前
			int h = (int) (time / 3600000);// 得出的时间间隔的单位是小时
			interval = h + "小时前";
		} else {
			// 大于24小时，则显示正常的时间，但是不显示秒
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			ParsePosition pos2 = new ParsePosition(0);
			Date d2 = (Date) sdf.parse(createtime, pos2);

			interval = sdf.format(d2);
		}
		return interval;
	}

	/**
	 * 
	 * 判断两个时间差，如果两个时间差小于1分钟的话应该返回“”
	 * 
	 * @param time1
	 *            第一个时间，这个参数可以为空，上一个item对应的时间
	 * @param time2
	 *            第二个时间，这个参数不能为空,当前item对应的时间，大于第一个时间
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static String getInterval(String time1, String time2) { // 传入的时间格式必须类似于2012-8-21
																	// 17:53:20这样的格式
		String interval = null;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat sd2 = new SimpleDateFormat("MM-dd HH:mm");
		SimpleDateFormat sd3 = new SimpleDateFormat("HH:mm");
		ParsePosition pos = new ParsePosition(0);
		if(TextUtils.isEmpty(time2)){
			Log.d("meyki", "time2参数不能为空");
			return "";
		}else {
			Date d = (Date) sd.parse(time2, pos);
			if(d==null){
				Log.d("meyki", "time2参数格式不正确");
				return "";	
			}
		}
		pos = new ParsePosition(0);
		Date d2 = (Date) sd.parse(time2, pos);
		long time = 0;
		Date d1 = null;
		if (!TextUtils.isEmpty(time1)) {
			pos = new ParsePosition(0);
			d1 = (Date) sd.parse(time1, pos);
			time = d2.getTime() - d1.getTime();
		} else {
			time = d2.getTime() - d2.getTime();
		}
		Date d = new Date();
		try {
			if (time / 1000 < 120 && time / 1000 > 0) {// 时间差小于120秒
				interval = "";
			} else {// 时间间隔大于120秒
					if(DateTimeUtil.isToday(d2)){//是今天
						interval = sd3.format(sd.parse(time2));
					}else if(DateTimeUtil.isYesterdaty(d2)){//昨天
						interval = "昨天" + sd3.format(sd.parse(time2));
					} else {// 其余情况,需要判断是否跨年
						if (d2.getYear() - d.getYear() > 0) {// 跨年的情况
						interval = sd1.format(sd.parse(time2));
					} else {// 没有跨年的情况
						interval = sd2.format(sd.parse(time2));
					}
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return interval;
	}
}
