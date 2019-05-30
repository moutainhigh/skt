package net.meyki.data.utils;

import java.util.Map;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/**
 * 短信工具类
 * @author liyc
 */
public class SMSUtil {
	private static String getMCC(Activity activity) {
		TelephonyManager tm = (TelephonyManager) activity
				.getSystemService(Context.TELEPHONY_SERVICE);
		// 返回当前手机注册的网络运营商所在国家的MCC+MNC. 如果没注册到网络就为空.
		String networkOperator = tm.getNetworkOperator();
		// 返回SIM卡运营商所在国家的MCC+MNC. 5位或6位. 如果没有SIM卡返回空
		String simOperator = tm.getSimOperator();
		String mcc = null;
		
		if (!TextUtils.isEmpty(networkOperator)
				&& networkOperator.length() >= 5) {
			mcc = networkOperator.substring(0, 3);
		}
		if (TextUtils.isEmpty(mcc)) {
			if (!TextUtils.isEmpty(simOperator) && simOperator.length() >= 5) {
				mcc = simOperator.substring(0, 3);
			}
		}
		return mcc;
	}
	public static void showDiolag(Context context,Map<String,String> value){
		Dialog dg = new Dialog(context);
		dg.setTitle(value.get("title"));
		
	}
}
