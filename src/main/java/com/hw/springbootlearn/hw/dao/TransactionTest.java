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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value="/t")
public class TransactionTest {
@Autowired
JdbcTemplate jdbcTemplate;
@RequestMapping(value="/test")
public void testSelect(){
   List list= jdbcTemplate.queryForList("SELECT * FROM FOO");
    list.forEach(row-> System.out.println(row.toString()));
}
}
