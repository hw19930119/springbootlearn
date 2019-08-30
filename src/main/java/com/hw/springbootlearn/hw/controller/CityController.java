/*
 * @(#) CityController
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-30 19:50:50
 */

package com.hw.springbootlearn.hw.controller;

import com.hw.springbootlearn.hw.dao.springbootdb.CityDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

@RestController
public class CityController {
    @Autowired
    private CityDao cityDao;
    @Autowired
    DataSource mysqlDataSource;
    @Autowired
    DataSource ponoramaZsDataSource;
    @RequestMapping(value="/getCity")
    public List<Map<String,Object>> getCitys() throws SQLException {
        Connection con=mysqlDataSource.getConnection();
        Connection con1=ponoramaZsDataSource.getConnection();
        System.out.println(con);
        System.out.println(mysqlDataSource.toString());
        System.out.println(ponoramaZsDataSource.toString());
         return cityDao.getCityList();
    }
}
