package net.meyki.data.utils;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * 获得软件的全局配置文件
 * @author Administrator
 *
 */
public class SharedConfig {
	
	Context context;
	SharedPreferences shared;
	public SharedConfig(Context context){
		this.context=context;
		shared=context.getSharedPreferences("config", Context.MODE_PRIVATE);
	}

	public SharedPreferences GetConfig(){
		return shared;
	}
	public void ClearConfig(){
		shared.edit().clear().commit();
	}
}
