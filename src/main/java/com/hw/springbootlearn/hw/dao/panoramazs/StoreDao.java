/*
 * @(#) StoreDao
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-08-01 16:16:56
 */

package com.hw.springbootlearn.hw.dao.panoramazs;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface StoreDao {
    public List<Map<String,Object>> getStoreList();
}
