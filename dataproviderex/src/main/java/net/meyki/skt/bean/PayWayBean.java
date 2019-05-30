package net.meyki.skt.bean;

import java.io.Serializable;

/**
 * 支付方式对应的bean
 *
 * @author liyc
 */
public class PayWayBean implements Serializable {
    public boolean isColor;

    public PayWayBean() {

    }

    public PayWayBean(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public PayWayBean(int id, String name, boolean isCheck) {
        super();
        this.id = id;
        this.name = name;
        this.isCheck = isCheck;
    }

    public boolean isCheck() {
        return isCheck;
    }


    public void setCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }

    public void setTxtColor(boolean isColor) {
        this.isColor = isColor;
    }


    public int id;
    public String image;
    public String name;
    public boolean isCheck = false;
}
