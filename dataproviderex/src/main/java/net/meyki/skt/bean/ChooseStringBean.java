package net.meyki.skt.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 项目名称：4.1.0
 * 类描述：下拉选择的实体类
 * 创建人：meyki-bear
 * 创建时间：2017/1/12 15:18
 * 修改人：meyki-bear
 * 修改时间：2017/1/12 15:18
 * 修改备注：
 */

public class ChooseStringBean implements Parcelable {
    private String chooseThing;//需要显示的内容
    private boolean isChoose; //是否已被选中

    public String getChooseThing() {
        return chooseThing;
    }

    public void setChooseThing(String chooseThing) {
        this.chooseThing = chooseThing;
    }

    public boolean isChoose() {
        return isChoose;
    }

    public void setChoose(boolean choose) {
        isChoose = choose;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.chooseThing);
        dest.writeByte(this.isChoose ? (byte) 1 : (byte) 0);
    }

    public ChooseStringBean() {
    }

    protected ChooseStringBean(Parcel in) {
        this.chooseThing = in.readString();
        this.isChoose = in.readByte() != 0;
    }

    public static final Parcelable.Creator<ChooseStringBean> CREATOR = new Parcelable.Creator<ChooseStringBean>() {
        @Override
        public ChooseStringBean createFromParcel(Parcel source) {
            return new ChooseStringBean(source);
        }

        @Override
        public ChooseStringBean[] newArray(int size) {
            return new ChooseStringBean[size];
        }
    };
}
