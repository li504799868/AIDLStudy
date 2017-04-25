// aidl  定义实现的Service方法
package com.lzp.aidlstudy;

import com.lzp.aidlstudy.bean.TestBean;

interface ITestInterface {

    // 定义一个计算方法
    int getCalculateResult(in TestBean bean);

}
