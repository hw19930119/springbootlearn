/*
 * @(#) CityDao
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-30 19:44:21
 */

package com.hw.springbootlearn.hw.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface CityDao {

    public List<Map<String,Object>> getCityList();
}
