package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.UpLoadBean;

/**
 * @author 上传文件时响应
 */
public class GetCommucationUserInfoResponse extends JavaCommonResponse {
    /**
     *
     */
    private static final long serialVersionUID = 4776126993140125105L;
    public String remarkName;
    public String userName;
    public String mobile;
    public String userId;
    public String userPhoto;
    public String isFriend;
    public String communityTag;
    public String loginName;
}
