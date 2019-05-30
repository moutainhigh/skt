package net.meyki.data.client.domain;

/**
 * Created by Administrator on 2017/1/19.
 */

public class WalletMenuBean {
    public String MunuName;
    public int MunuIco;
    public String money;

    public WalletMenuBean(String munuName, int munuIco,String money) {
        this.MunuName = munuName;
        this.MunuIco = munuIco;
        this.money = money;
    }


}
