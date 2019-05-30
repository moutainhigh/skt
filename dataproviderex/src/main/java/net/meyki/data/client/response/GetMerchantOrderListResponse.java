package net.meyki.data.client.response;

import net.meyki.data.client.domain.MyReOrderShopListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 商家配送列表
 * Created by Daimhim on 2016/12/12.
 */

public class GetMerchantOrderListResponse extends JavaCommonResponse {


    /**
     * extData :
     * hasNext : false
     * list : [{"createTime":"2016-12-06 14:40:00","flag":"0","goodsCount":"1","goodsId":"098d2b52df294fb3a8face9834e59618","goodsName":"货到付款","goodsPrice":"15.00","goodsSrc":"http://i1.meyki.net/communitycphoto/aacf8b2292d2488f8a704e1f89c8335e.png","goodsUnit":"我","marketPrice":"15.00","operatorsId":"","orderId":"ca0879173a824b54a77310ddddccc3ba","orderSn":"201612061440007790","shopCate":"1","shopId":"027cc3c8fbeb4b708240e00923d21244","shopName":"zu代金券","specCount":"2147483647","specImgSrc":"","specName":"我","specPrice":"15.00","specUnit":"我"}]
     * pages : 1
     * totalRecords : 1
     */

    private String extData;
    private boolean hasNext;
    private int pages;
    private int totalRecords;
    private List<MyReOrderShopListBean> list;

    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<MyReOrderShopListBean> getList() {
        return list;
    }

    public void setList(List<MyReOrderShopListBean> list) {
        this.list = list;
    }

}
