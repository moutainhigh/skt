package meyki.distribution.dataprovider.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 项目名称：4.0.8
 * 类描述：
 * 创建人：meyki-bear
 * 创建时间：2017/1/11 19:48
 * 修改人：meyki-bear
 * 修改时间：2017/1/11 19:48
 * 修改备注：
 */

public class GoodImage implements Parcelable {
    public String id ;
    public String goodsImg;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.goodsImg);
    }

    public GoodImage() {
    }

    protected GoodImage(Parcel in) {
        this.id = in.readString();
        this.goodsImg = in.readString();
    }

    public static final Creator<GoodImage> CREATOR = new Creator<GoodImage>() {
        @Override
        public GoodImage createFromParcel(Parcel source) {
            return new GoodImage(source);
        }

        @Override
        public GoodImage[] newArray(int size) {
            return new GoodImage[size];
        }
    };
}
