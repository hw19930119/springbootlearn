/*
 * @(#) ProxyLog
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-23 09:23:18
 */

package hw.proxy;

import hw.service.TestInterface;
import hw.serviceImpl.TestInterfaceImpl;

public class ProxyLog implements TestInterface{

    TestInterface impl;
    public ProxyLog(TestInterface impl){
        this.impl=impl;
    }

    @Override
    public void sayHi() {
        System.out.println("log代理类之前方法===");
        impl.sayHi();
    }
}
