package net.meyki.data.client.response;

import net.meyki.data.client.domain.DisAreaBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hl on 2017/3/3.
 */
public class DisAreaInfoResponse extends JavaCommonResponse {
    public List<DisAreaBean> listInfo = new ArrayList();
}
