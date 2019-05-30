package net.meyki.data.client.response;

import net.meyki.skt.mainPage.bean.Category;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/28.
 */
public class TypeCategoryListExResponse extends JavaCommonResponse {
    public ArrayList<Category> list= new ArrayList<Category>();
    public ArrayList<Category> getList() {
        return list;
    }
    public void setList(ArrayList<Category> data) {
        this.list = list;
    }
}
