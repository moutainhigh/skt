package net.meyki.data.client.response;

import net.meyki.data.client.domain.ProvinceAddressBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 项目名称：user-4.5.2
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/17 14:41
 * 修改人：meyki-bear
 * 修改时间：2017/6/17 14:41
 * 修改备注：
 */

public class GetAddressChinaInfoResponse extends JavaCommonResponse {
    private List<ProvinceAddressBean> list; //省级信息

    public List<ProvinceAddressBean> getList() {
        return list;
    }

    public void setList(List<ProvinceAddressBean> list) {
        this.list = list;
    }
}
