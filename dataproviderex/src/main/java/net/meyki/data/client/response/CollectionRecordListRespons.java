package net.meyki.data.client.response;/**
 * Created by Administrator on 2017/6/15 0015.
 */

import net.meyki.data.client.domain.CollectionRecordBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 作者：zhaolifeng
 * 时间：2017/06/15 16:05
 * 描述：收款记录
 */
public class CollectionRecordListRespons extends JavaCommonResponse {

   // extData		JSONObject	YES	其它数据
   public String   totalRecords;//		String	YES	总记录数
    public  String  pages	;//	String	YES	总页数
    public   boolean  hasNext	;//	String	YES	是否有下一页,true:有下一页，false：无下一页

    public List<CollectionRecordBean> list ;
}
