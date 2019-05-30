package net.meyki.skt.utils;

import meyki.dataprovider.R;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;

/**
 * 字符串格式化工具类
 * @author liyc
 *
 */
public class StrUtils {
	/**
	 * 
	 * 
	 * 格式化字符串样式  
	 * 姓名：xingming123
	 * @param context
	 * @param str
	 * @param split 
	 * @return
	 */
	public static SpannableString fromatStyle(Context context,String str ,String split){
		SpannableString styledText = new SpannableString(str);
		styledText.setSpan(new TextAppearanceSpan(context,R.style.text_gray), 0, str.indexOf(split)+1,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		return styledText;
	}
	
}
