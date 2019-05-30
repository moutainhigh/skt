package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.List;

import meyki.distribution.dataprovider.domain.Bran;
import meyki.distribution.dataprovider.domain.Brand;
import meyki.distribution.dataprovider.domain.BrandEx;
import meyki.distribution.dataprovider.domain.Good;



/**
 * code对应的javabean实体类
 * @author liyc
 */
public class GoodCode implements Serializable{
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
	
//	private List<Good> data;
	
	
//	public List<Good> getData() {
//		return data;
//	}
//
//	public void setData(List<Good> data) {
//		this.data = data;
//	}

	public Page page;
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Page implements Serializable {
		private static final long serialVersionUID = -2246564891707275483L;
		private int page;
		private int nextpage;
		public int getPage() {
			return page;
		}
		public void setPage(int page){
			this.page = page;
		}
		public int getNextpage() {
			return nextpage;
		}
		public void setNextpage(int nextpage) {
			this.nextpage = nextpage;
		}
		@Override
		public String toString() {
			return "Page [page=" + page + ", nextpage=" + nextpage + "]";
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
	public static class Data implements Serializable{
		private List<Good> goods;

		private List<BrandEx> brands;

		public List<Good> getGoods() {
			return goods;
		}

		public void setGoods(List<Good> goods) {
			this.goods = goods;
		}

		public List<BrandEx> getBrands() {
			return brands;
		}

		public void setBrands(List<BrandEx> brands) {
			this.brands = brands;
		}
		
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

    
	public String getResult() {
		return result;
	}

	

	@Override
	public String toString() {
		return "GoodCode [result=" + result + ", message=" + message
				+ ", user_id=" + user_id + ", page=" + page + "]";
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
