package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 项目名称：net.meyki.data.client.domain
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 11:24
 * 修改人：Daimhim
 * 修改时间：2017/6/5 11:24
 * 类描述：
 * 修改备注：
 */

public class DiscoverTagBean implements Serializable {
    private String tagId;    //	String	YES	标签业务ID
    private String tagName;    //	String	YES	标签名称
    private String tagType;    //	String	YES	标签类型:1:推荐，2：页签
    private String ico;    //	String	YES	标签图标
    private String seq;    //	String	YES	标签排序

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

}
