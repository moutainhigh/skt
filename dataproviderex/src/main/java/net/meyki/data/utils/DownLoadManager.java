package net.meyki.data.utils;

import java.io.BufferedInputStream;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.net.HttpURLConnection;

import java.net.URL;

import android.app.ProgressDialog;

import android.os.Environment;
/**
 * 下载管理类
 * @author liyc
 *
 */
public class DownLoadManager {

	public static File getFileFromServer(String path, ProgressDialog pd) throws Exception{
		//如果相等的话表示当前的sdcard挂载在手机上并且是可用的
		if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
			URL url = new URL(path);
			HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			//获取到文件的大小 
			pd.setMax(conn.getContentLength());
//			double max = conn.getContentLength()/(1000*1000);
//			pd.setMessage("文件大小：" +max + "M");
			InputStream is = conn.getInputStream();
			File file = new File(Environment.getExternalStorageDirectory(),"天天有用.apk");
			if(file.exists()){
				file.delete();
			}
			FileOutputStream fos = new FileOutputStream(file);
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] buffer = new byte[1024];
			int len ;
			int total=0;
			while((len =bis.read(buffer))!=-1){
				fos.write(buffer, 0, len);
				total+= len;
				//获取当前下载量
				pd.setProgress(total);
			}
			fos.close();
			bis.close();
			is.close();
			return file;
		}
		else{
			return null;
		}
	}
}

