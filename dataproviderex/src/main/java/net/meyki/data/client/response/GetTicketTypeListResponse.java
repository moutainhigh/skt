package net.meyki.data.client.response;

import net.meyki.data.client.domain.TicketTypeBean;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/8.
 */
public class GetTicketTypeListResponse extends JavaCommonResponse {

    private List<TicketTypeBean> list = new ArrayList<>();

    public List<TicketTypeBean> getList() {
        return list;
    }

    public void setList(List<TicketTypeBean> list) {
        this.list = list;
    }

}
