package net.meyki.data.client.domain;

import net.meyki.data.client.response.GetUserInfoResponse;

import java.io.Serializable;
import java.util.List;

/**
 * 项目名称：net.meyki.data.client.domain
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/27 9:41
 * 修改人：Daimhim
 * 修改时间：2017/6/27 9:41
 * 类描述：
 * 修改备注：
 */

public class MainInfoMenuBean implements Serializable{
    private int img;
    private int name;
    private int type;
    private String count;
    private List<MainInfoMenuBean> menuBeans;
    private int viewtype_title;
    private GetUserInfoResponse mGetUserInfoResponse;
    private int size;
    private List<GetNewOrderInfoListBean> mGetNewOrderInfoListBeans;

    public MainInfoMenuBean() {
    }

    public MainInfoMenuBean(int img, int name, int type, int count) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.count = count+"";
    }

    public MainInfoMenuBean(int img, int name, int type) {
        this.img = img;
        this.name = name;
        this.type = type;
    }

    public MainInfoMenuBean(int img, int name, int type, int count, int VIEWTYPE_TITLE) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.count = ""+count;
    }
    public MainInfoMenuBean(int img, int name) {
        this.img = img;
        this.name = name;
    }

    public MainInfoMenuBean(List<MainInfoMenuBean> menuBeans) {
        this.menuBeans = menuBeans;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<MainInfoMenuBean> getMenuBeans() {
        return menuBeans;
    }

    public void setMenuBeans(List<MainInfoMenuBean> menuBeans) {
        this.menuBeans = menuBeans;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public GetUserInfoResponse getGetUserInfoResponse() {
        return mGetUserInfoResponse;
    }

    public void setGetUserInfoResponse(GetUserInfoResponse getUserInfoResponse) {
        mGetUserInfoResponse = getUserInfoResponse;
    }

    public List<GetNewOrderInfoListBean> getGetNewOrderInfoListBeans() {
        return mGetNewOrderInfoListBeans;
    }

    public void setGetNewOrderInfoListBeans(List<GetNewOrderInfoListBean> getNewOrderInfoListBeans) {
        mGetNewOrderInfoListBeans = getNewOrderInfoListBeans;
    }
}
