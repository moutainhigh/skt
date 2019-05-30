package net.meyki.data.client.response;

import net.meyki.data.client.domain.RejectDetailBen;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hl on 2017/1/13.
 */
public class RejectDetailResponse extends JavaCommonResponse {
    public  List<RejectDetailBen> list = new ArrayList<>();
}
