/*
 * @(#) TestInterfaceImpl
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-23 09:09:27
 */

package com.hw.springbootlearn.hw.serviceImpl;


import com.hw.springbootlearn.hw.service.TestInterface;

public class TestInterfaceImpl implements TestInterface {
    @Override
    public void sayHi() {
        System.out.println("hello gis!!");
    }
}
