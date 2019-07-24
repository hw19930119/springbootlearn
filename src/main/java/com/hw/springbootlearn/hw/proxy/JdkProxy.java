/*
 * @(#) JdkProxy
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-23 14:50:06
 */

package com.hw.springbootlearn.hw.proxy;

import org.apache.ibatis.reflection.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler{
    private Object target;
    public JdkProxy(Object target){
        super();
        this.target=target;
    }

    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象方法
     * @param args 方法的参数
     * @return Object 调用方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理方法之前");
        method.invoke(target);
        System.out.println("动态代理之后");
        return null;
    }
}
