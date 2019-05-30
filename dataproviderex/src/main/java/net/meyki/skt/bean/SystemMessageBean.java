package net.meyki.skt.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
public class SystemMessageBean {
    public String num;
    public List<StmMsgeBean> list;

    @Override
    public String toString() {
        return "SystemMessageBean{" +
                "num='" + num + '\'' +
                ", list=" + list +
                '}';
    }
}
