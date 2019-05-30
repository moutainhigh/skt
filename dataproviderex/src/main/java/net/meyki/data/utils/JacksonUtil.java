package net.meyki.data.utils;


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.type.TypeReference;

/**
 * 实体类和JSON对象之间相互转化（依赖包jackson-all-1.7.6.jar、jsoup-1.5.2.jar）
 *
 * @author wck
 *
 */
public final class JacksonUtil {

	public static ObjectMapper objectMapper;

	/**
	 * 使用泛型方法，把json字符串转换为相应的JavaBean对象。
	 * (1)转换为普通JavaBean：readValue(json,Student.class)
	 * (2)转换为List,如List<Student>,将第二个参数传递为Student
	 * [].class.然后使用Arrays.asList();方法把得到的数组转换为特定类型的List
	 *
	 * @param jsonStr
	 * @param valueType
	 * @return
	 */
	public static <T> T readValue(String jsonStr, Class<T> valueType) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);
			objectMapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
			//设置有属性不能映射成PO时不报错
			objectMapper.getDeserializationConfig().disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		}

		try {
//			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			return objectMapper.readValue(jsonStr, valueType);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * json数组转List
	 *
	 * @param jsonStr
	 * @param valueTypeRef
	 * @return
	 */
	public static <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);
			objectMapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
			//设置有属性不能映射成PO时不报错
			objectMapper.getDeserializationConfig().disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		}

		try {
//			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			return objectMapper.readValue(jsonStr, valueTypeRef);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 把JavaBean转换为json字符串
	 *
	 * @param object
	 * @return
	 */
	public static String toJSon(Object object) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}

		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * JSON字符串转换成Map
	 *
	 * @param json
	 *            需要转换的json字符串
	 * @return 转换成功的Map，转换失败返回null
	 */
	public static Map<String, Object> readJson2Map(String json) {
		// String json =
		// "{\"success\":true,\"A\":{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"+
		// "\"B\":{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}}";
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		Map<String, Object> out = new HashMap<String, Object>();
		Map<String, Map<String, Object>> maps;
		try {
			maps = objectMapper.readValue(json, Map.class);
			// System.out.println(maps.size());
			Set<String> key = maps.keySet();
			Iterator<String> iter = key.iterator();
			while (iter.hasNext()) {
				String field = iter.next();
				// System.out.println(field + ":" + maps.get(field));
				out.put(field, maps.get(field));
			}
			return out;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, Object> in = new HashMap<String,Object>();
		in.put("status", "1");
		in.put("data", null);
		in.put("errCode", "");
		in.put("errMsg", "");

		String json = JacksonUtil.toJSon(in);
		System.out.println("json = "+json);
		Map<String,Object> out = JacksonUtil.readJson2Map(json);
		System.out.println("out_status = "+ out.get("status"));

		// OcUsersPart userBean1 = new OcUsersPart(1, "liubei", "123",
		// "liubei@163.com");
		// OcUsersPart userBean2 = new OcUsersPart(2, "guanyu", "123",
		// "guanyu@163.com");
		// OcUsersPart userBean3 = new OcUsersPart(3, "zhangfei", "123",
		// "zhangfei@163.com");
		//
		//
		// List<OcUsersPart> userBeans = new ArrayList<OcUsersPart>();
		// userBeans.add(userBean1);
		// userBeans.add(userBean2);
		// userBeans.add(userBean3);
		//
		// OcUsersPart deptBean = new OcUsersPart(1, "liubei", "123",
		// "liubei@163.com");
		// //对象转json
		// String userBeanToJson = JacksonUtil.toJSon(userBean1);
		// String deptBeanToJson = JacksonUtil.toJSon(deptBean);
		//
		// System.out.println("deptBean to json:" + deptBeanToJson);
		// System.out.println("userBean to json:" + userBeanToJson);
		//
		// //json转字符串
		// OcUsersPart jsonToUserBean = JacksonUtil.readValue(userBeanToJson,
		// OcUsersPart.class);
		// OcUsersPart jsonToDeptBean = JacksonUtil.readValue(deptBeanToJson,
		// OcUsersPart.class);
		//
		// System.out.println("json to DeptBean" + jsonToDeptBean.toString());
		// System.out.println("json to UserBean" + jsonToUserBean.toString());
		//
		// //List 转json字符串
		// String listToJson = JacksonUtil.toJSon(userBeans);
		// System.out.println("list to json:" + listToJson);
		//
		// //数组json转 List
		// List<OcUsersPart> jsonToUserBeans = JacksonUtil.readValue(listToJson,
		// new
		// TypeReference<List<OcUsersPart>>() {
		// });
		// String userBeanString = "";
		// for (OcUsersPart userBean : jsonToUserBeans) {
		// userBeanString += userBean.toString() + "\n";
		// }
		// System.out.println("json to userBeans:" + userBeanString);
	}
}