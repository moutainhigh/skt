package net.meyki.data.share.response;

import net.meyki.data.client.domain.COrderSeasonBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：net.meyki.data.share.response
 * 项目版本：user-4.5.8
 * 创建人：lxy
 * 创建时间：2017/7/14 0014 上午 11:17
 * 修改人：Administrator
 * 修改时间：2017/7/14 0014 上午 11:17
 * 类描述：
 * 修改备注：
 */
public class COrderSeasonResponse extends JavaCommonResponse {
    public List<COrderSeasonBean> list = new ArrayList<>();

}
