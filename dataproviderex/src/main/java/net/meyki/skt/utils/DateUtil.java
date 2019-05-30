package net.meyki.skt.utils;




import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtil {
    public static String DATE_PATTERN_YEAR_2_SECOND= "yyyy-MM-dd HH:mm:ss";

    public static String DATE_PATTERN_YEAR_2_DAY= "yyyy-MM-dd";
    public static String DATE_PATTERN_YEAR_2_MONTH= "yyyy年MM月";
    public static String DATE_PATTERN_YEAR_2_MINUTE= "yyyy年MM月dd日 hh:mm";
    public static String DATE_PATTERN_YEAR_2_MINNUTE_24= "yyyy年MM月dd日 HH:mm";
    public static String DATE_PATTERN_YEAR_2_DAY2= "yyyy年MM月dd日";
    public static String DATE_PATTERN_MONTH_2_DAY2= "MM月dd日";
    public static String DATE_PATTERN_DAY= "dd";
    //把日期转为字符串
    public static String ConverToString(Date date)
    {
        DateFormat df = new SimpleDateFormat();
        try{
            return df.format(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    //把日期转为字符串
    public static String converToString(Date date, String pattern)
    {
        DateFormat df = new SimpleDateFormat(pattern);
        try{
            return df.format(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    //把字符串转为日期
    public static Date converToDate(String strDate) throws Exception
    {
        DateFormat df = new SimpleDateFormat(DATE_PATTERN_YEAR_2_MINUTE);
        return df.parse(strDate);
    }
    public static Date converToDateAct(String strDate) throws Exception
    {
        DateFormat df = new SimpleDateFormat(DATE_PATTERN_YEAR_2_SECOND);
        return df.parse(strDate);
    }
    //把字符串转为日期
    public static Date converToDate(String strDate,String pattern)
    {
        DateFormat df = new SimpleDateFormat(pattern);
        try {
            return df.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
 // 将字符串转为时间戳

    public static String getTime(String user_time) {
    String re_time = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
    Date d;
    try {

    d = sdf.parse(user_time);
    long l = d.getTime();
    String str = String.valueOf(l);
    re_time = str.substring(0, 10);

    } catch (ParseException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    return re_time;
    }

    // 将时间戳转为字符串
    public static String getStrTime(String cc_time) {
    String re_StrTime = null;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    // 例如：cc_time=1291778220
    long lcc_time = Long.valueOf(cc_time);
    re_StrTime = sdf.format(new Date(lcc_time * 1000L));

    return re_StrTime;

    }
    /**
     * Convert <Date> list into a day-string list.
     * @param dates date list
     * @return
     */
    public static List<String> getDayList(List<Date> dates) {
        List dayList = new ArrayList();
        if( dates!=null ){
            for (Date date : dates) {
                String day = converToString(date,DATE_PATTERN_DAY);
                dayList.add(day);
            }
        }

        return dayList;
    }
}
