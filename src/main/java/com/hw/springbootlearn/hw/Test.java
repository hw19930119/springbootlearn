/*
 * @(#) Test
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-26 10:00:57
 */

package com.hw.springbootlearn.hw;

import com.hw.springbootlearn.hw.proxy.JdkProxy;
import com.hw.springbootlearn.hw.service.TestInterface;
import com.hw.springbootlearn.hw.serviceImpl.TestInterfaceImpl;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

@Controller
public class Test {
    @org.junit.Test
    public void testJDKProxy(){
        TestInterface ti=new TestInterfaceImpl();
        JdkProxy jdkProxy=new JdkProxy(ti);
        TestInterface ti1= (TestInterface) Proxy.newProxyInstance(ti.getClass().getClassLoader(),
            ti.getClass().getInterfaces(),
            jdkProxy);
        ti1.sayHi();
    }
}
