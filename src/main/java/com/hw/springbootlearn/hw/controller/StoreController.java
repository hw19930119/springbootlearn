

package com.hw.springbootlearn.hw.controller;

import com.hw.springbootlearn.hw.dao.panoramazs.StoreDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
public class StoreController {
    @Autowired
    private StoreDao storeDao;

    @RequestMapping(value = "/getStore")
    public List<Map<String, Object>> getStore() throws SQLException {

        return storeDao.getStoreList();
    }
}
