package net.meyki.data.client.response;

import net.meyki.data.client.domain.HearNewsBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 项目名称：4.3.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/4/18 11:35
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 11:35
 * 修改备注：
 */

public class GetMeykiHeadNewResponse extends JavaCommonResponse {
    private ArrayList<HearNewsBean> list=new ArrayList<>();
    private String intervalTime;

    public String getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
    }

    public ArrayList<HearNewsBean> getList() {
        return list;
    }

    public void setList(ArrayList<HearNewsBean> list) {
        this.list = list;
    }
}
