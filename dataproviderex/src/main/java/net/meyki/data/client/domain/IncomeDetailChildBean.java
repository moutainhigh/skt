package net.meyki.data.client.domain;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class IncomeDetailChildBean {

    String name;
    String time;
    String money;

    public IncomeDetailChildBean(String name, String time, String money) {
        this.name = name;
        this.time = time;
        this.money = money;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
