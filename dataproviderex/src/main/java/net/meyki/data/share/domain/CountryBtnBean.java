package net.meyki.data.share.domain;

/**
 * Created by Knight on 2017/3/6.
 */

public class CountryBtnBean {
    private String msg;
    private boolean isCheck;

    public CountryBtnBean(String msg, boolean isCheck) {
        this.msg = msg;
        this.isCheck = isCheck;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
