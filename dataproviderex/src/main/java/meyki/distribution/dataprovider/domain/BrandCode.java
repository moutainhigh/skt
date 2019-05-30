package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
import java.util.List;


public class BrandCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4509655030439978912L;
	/** 响应结果*/
	private String result;
	/**操作失败时需要用到的*/
	private String message;
	/** 用户id*/
	private String user_id;
	
	public Page page;
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Page{
		private int page;
		private int nextpage;
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getNextpage() {
			return nextpage;
		}
		public void setNextpage(int nextpage) {
			this.nextpage = nextpage;
		}
	};

//	public static GsonCode fromJson(String json, Class clazz) {
//        Gson gson = new Gson();
//        Type objectType = type(GsonCode.class, clazz);
//        return gson.fromJson(json, objectType);
//    }

//    public String toJson(Class<T> clazz) {
//        Gson gson = new Gson();
//        Type objectType = type(GsonCode.class, clazz);
//        return gson.toJson(this, objectType);
//    }
//
//    static ParameterizedType type(final Class raw, final Type... args) {
//        return new ParameterizedType() {
//            public Type getRawType() {
//                return raw;
//            }
//
//            public Type[] getActualTypeArguments() {
//                return args;
//            }
//
//            public Type getOwnerType() {
//                return null;
//            }
//        };
//    }
	public Data data;
	public static class Data{
		public List<Brand> brands;
	}
//
//	public void setData(List<T> data) {
//		this.data = data;
//	}
//
//
//	private List<T> data;
//	public String getResult() {
//		return result;
//	}

	@Override
	public String toString() {
		return "GsonCode [result=" + result + ", message=" + message
				+ ", user_id=" + user_id +  "]";
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
