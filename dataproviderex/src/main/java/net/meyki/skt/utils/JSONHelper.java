package net.meyki.skt.utils;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * @author wzj
 * 
 */
public class JSONHelper 
{
	
	private static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * 
	 * @param object
	 * @return json     
	 */
	public static String toJson(Object object) 
	{
		String str = null;
		
		try 
		{
			str = objectMapper.writeValueAsString(object);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return str;
	}
	
	/**
	 * 
	 * @param json
	 *            json ��ʽ����
	 * @param cls
	 * 			       ����
	 * @return ����             
	 */
	public static <T> T toObj(String json, Class<T> cls) 
	{
		T t = null;
		
		try 
		{
			t = objectMapper.readValue(json, cls);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return t;
	}
	
	/**
	 * json 
	 * 
	 * @param json
	 *            json �
	 * @param tr
	 *            
	 * @return                     
	 */
	public static <T> T toObj(String json, TypeReference<T> tr) 
	{
		T t = null;
		
		try 
		{
			t = objectMapper.readValue(json, tr);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return t;
	}
}
