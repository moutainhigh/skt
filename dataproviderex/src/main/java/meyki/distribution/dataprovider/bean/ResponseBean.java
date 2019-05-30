package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import meyki.distribution.dataprovider.bean.GoodCode.Page;

import com.google.gson.Gson;
/**
 * 响应的结果基础实体类
 * @author liyc
 *
 * @param <T>
 */
public class ResponseBean<T> implements Serializable {
	private static final long serialVersionUID = -1209076299073975173L;

	private String result;
	private String message;
	private List<T> data;
	private Page page;
	
	@Override
	public String toString() {
		return "ResponseBean [result=" + result + ", message=" + message
				+ ", data=" + data + ", page=" + page + "]";
	}



	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Page{
		private String page;
		private int nextpage;
		public String getPage() {
			return page;
		}
		public void setPage(String page) {
			this.page = page;
		}
		@Override
		public String toString() {
			return "Page [page=" + page + ", nextpage=" + nextpage + "]";
		}
		public int getNextpage() {
			return nextpage;
		}
		public void setNextpage(int nextpage) {
			this.nextpage = nextpage;
		}
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	static ParameterizedType type(final Class raw, final Type... args) {
	return new ParameterizedType() {
		public Type getRawType() {
			return raw;
		}
		public Type[] getActualTypeArguments() {
			return args;
		}
		public Type getOwnerType() {
			return null;
		}
	};
}

	public static ResponseBean fromJson(String json, Class clazz) {
		Gson gson = new Gson();
		Type objectType = type(ResponseBean.class, clazz);
		return gson.fromJson(json, objectType);
	}

	public String toJson(Class<T> clazz) {
		Gson gson = new Gson();
		Type objectType = type(ResponseBean.class, clazz);
		return gson.toJson(this, objectType);
	}

}
