package net.meyki.data.utils;

import android.os.Handler;
import android.os.Message;
/**
 * 线程间通信工具类
 * @author liyc
 */
public class ThreadUtil {
	/**
	 * 子线程向主线程进行数据传递
	 * @param handler 主线程和子线程共用的handler对象
	 * @param str_temp 传递的参数
	 */
	public static void subthreadToMain(Handler handler,String str_temp){
		Message message = Message.obtain();
		boolean param = true;
		if("success".equals(str_temp)){
			param = true;
		}else if("error".equals(str_temp)){
			param = false;
		}
		message.obj = param;
		// 通过Handler发布传送消息，handler
		handler.sendMessage(message);
	}
	
}
