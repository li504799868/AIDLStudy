package com.lzp.aidlstudy.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by li.zhipeng on 2017/4/25.
 * <p>
 * 测试用类
 */

public class TestBean implements Parcelable {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static final Parcelable.Creator<TestBean> CREATOR = new Creator<TestBean>() {
        @Override
        public TestBean[] newArray(int size) {
            return new TestBean[size];
        }

        @Override
        public TestBean createFromParcel(Parcel in) {
            TestBean bean = new TestBean();
            bean.setX(in.readInt());
            bean.setY(in.readInt());
            return bean;
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(x);
        dest.writeInt(y);
    }
}
