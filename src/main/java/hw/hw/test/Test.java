/*
 * @(#) Test
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-23 09:10:45
 */

package hw.hw.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import hw.proxy.JdkProxy;
import hw.proxy.ProxyLog;
import hw.proxy.ProxyTime;
import hw.service.TestInterface;
import hw.serviceImpl.Animal;
import hw.serviceImpl.Dog;
import hw.serviceImpl.TestInterfaceImpl;

public class Test {

    public static void main(String[] args) {
        /*TestInterface impl = new TestInterfaceImpl();
        TestInterface impl1=new ProxyLog(impl);
        TestInterface impl2=new ProxyTime(impl1);
        impl2.sayHi();*/
        //多态测试
        /*Animal a=new Dog();
        Dog dog=(Dog)a;
        dog.run();*/
        //jdk动态代理测试
        TestInterfaceImpl test=new TestInterfaceImpl();
        InvocationHandler jdkProxy=new JdkProxy(test);
         TestInterfaceImpl m=(TestInterfaceImpl)Proxy.newProxyInstance(test.getClass().getClassLoader(),
                                                                           test.getClass().getInterfaces(),
                                                                            jdkProxy);
        m.sayHi();
    }
}
