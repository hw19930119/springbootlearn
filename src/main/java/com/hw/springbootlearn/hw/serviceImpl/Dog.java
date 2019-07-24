/*
 * @(#) Dog
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-23 15:14:32
 */

package com.hw.springbootlearn.hw.serviceImpl;

import com.hw.springbootlearn.hw.serviceImpl.Animal;

public class Dog extends Animal {

    public void eat(){
        System.out.println("dog eatting=------------");
    }
    public void run(){
        System.out.println("dog running-----]");
    }
}
