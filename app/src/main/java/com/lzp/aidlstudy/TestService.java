package com.lzp.aidlstudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.lzp.aidlstudy.bean.TestBean;

/**
 * Created by li.zhipeng on 2017/4/25.
 *
 *      跨进程服务类
 */

public class TestService extends Service {

    private final ITestInterface.Stub binder = new ITestInterface.Stub() {

        @Override
        public int getCalculateResult(TestBean bean) throws RemoteException {
            return bean.getX() + bean.getY();
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}
