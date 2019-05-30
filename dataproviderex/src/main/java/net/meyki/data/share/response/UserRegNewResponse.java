package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * 项目名称：net.meyki.data.share.response
 * 项目版本：sclient
 * 创建时间：2018.04.28 20:15
 * 修改人：Daimhim
 * 修改时间：2018.04.28 20:15
 * 类描述：
 * 修改备注：
 *
 * @author：Daimhim
 */

public class UserRegNewResponse extends JavaCommonResponse {
    private String roleId;
    //": "500",
    private String userId;
    //": "883e17f0067441f786fab1196ded60cd"

    @Override
    public String toString() {
        return "UserRegNewResponse{" +
                "roleId='" + roleId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
