package net.meyki.data.distributon.domain;

/**
 * 项目名称：4.1.0
 * 类描述：物流信息的
 * 创建人：meyki-bear
 * 创建时间：2017/1/13 15:22
 * 修改人：meyki-bear
 * 修改时间：2017/1/13 15:22
 * 修改备注：
 */
//注意，这些变量名称都是胡写的，与接口无关。。。
public class LogesticBean {
    private String context; //物流描述
    private String time; //时间

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
