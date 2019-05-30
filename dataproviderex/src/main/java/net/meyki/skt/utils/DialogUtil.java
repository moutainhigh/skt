package net.meyki.skt.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * 对话框工具类
 * 
 * @author liyc
 */
public class DialogUtil {

	/** 对话框对象 */
	private static ProgressDialog progressdialog;

	/**
	 * 加载对话框
	 */
//	public static final Dialog ProgressDialog(Context context) {
//		int resId = getStyleRes(context, "CommonDialog");
//		if (resId > 0) {
//			final Dialog dialog = new Dialog(context, resId);
//			resId = getLayoutRes(context, "smssdk_progress_dialog");
//			if (resId > 0) {
//				dialog.setContentView(resId);
//				return dialog;
//			}
//		}
//		return null;
//	}

	/**
	 * 创建一个进度条对话框
	 * 
	 * @return
	 */
	public static final ProgressDialog createProgressDialog(Context context,
			String title, String message) {
		if (progressdialog != null) {
			progressdialog.cancel();
		}
		progressdialog = new ProgressDialog(context);

		progressdialog.setTitle(title);
		progressdialog.setMessage(message);
		return progressdialog;
	}
	
	public static  void show(ProgressDialog dialog){
		if(dialog!=null && !dialog.isShowing()){
			dialog.show();
		};
	}
	
	public static void dismiss(ProgressDialog dialog){
		if(dialog!=null && dialog.isShowing()){
			dialog.dismiss();
		};
	}
	public static void canel(ProgressDialog dialog){
		if(dialog!=null && dialog.isShowing()){
			dialog.cancel();
		};
	}
	/**
	 * 显示对话框
	 * 
	 * @param dialog
	 */
	public static final void showProgressDialog() {
		if (progressdialog != null && !progressdialog.isShowing()) {
			progressdialog.show();
		}
	}

	/***
	 * 隐藏对话框
	 * 
	 * @param dialog
	 */
	public static final void dismissProgressDialog() {
		if (progressdialog != null && progressdialog.isShowing()) {
			progressdialog.dismiss();
		}
	}

	/**
	 * 销毁对话框
	 */
	public static final void canelProgressDialog() {
		if (progressdialog != null) {
			progressdialog.cancel();
		}
	}
}