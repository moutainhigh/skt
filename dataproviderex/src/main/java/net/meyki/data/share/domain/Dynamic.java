package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 项目名称：4.2.8
 * 类描述：用户领取动态
 * 创建人：xyp
 * 创建时间：2017/3/28 14:09
 * 修改人：meyki-bear
 * 修改时间：2017/3/28 14:09
 * 修改备注：
 */

public class Dynamic implements Serializable{
    public String userId; //领取用户的id
    public String userName; //领取用户的名称
    public String amount; //领取金额
    private String str_msg;

    public String getMsg(){
        str_msg =  userName + "成功领取" + amount;

        return str_msg;
    }
}
