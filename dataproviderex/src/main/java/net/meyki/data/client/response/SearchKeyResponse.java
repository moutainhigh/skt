package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 会员活动接口响应回来的数据
 *
 * @author Administrator
 */
public class SearchKeyResponse extends JavaCommonResponse {
    public ArrayList<String> list = new ArrayList<String>();

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
