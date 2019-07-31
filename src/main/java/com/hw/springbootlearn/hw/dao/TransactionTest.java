/*
 * @(#) TransactionTest
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-24 15:32:01
 */

package com.hw.springbootlearn.hw.dao;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/t")
public class TransactionTest {

@RequestMapping(value="/test")
@Test
public void testSelect(){
    Runnable a=new Runnable() {
        @Override
        public void run() {

        }
    };
}
}
