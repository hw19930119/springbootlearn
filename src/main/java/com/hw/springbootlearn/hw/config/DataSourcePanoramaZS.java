/*
 * @(#) DataSourcePanoramaZS
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-08-01 15:17:18
 */

package com.hw.springbootlearn.hw.config;


import com.alibaba.druid.pool.DruidDataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.hw.springbootlearn.hw.dao.panoramazs", sqlSessionTemplateRef  = "ponoramaZsSqlSessionTemplate")  //关联的mapper.xml所在位置
public class DataSourcePanoramaZS {
    @Bean(name = "ponoramaZsDataSource") //作为一个bean对象并命名
    @ConfigurationProperties(prefix = "spring.datasource.ponoramazs") //配置文件中，该数据源的前缀
   // @Primary   //用于标记主数据源，除了主数据源外，其余注入文件都不添加该注解
    public DataSource testDataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Bean(name = "ponoramaZsSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("ponoramaZsDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/panoramazs/*.xml"));//对应mapper.xml的具体位置
        return bean.getObject();
    }

    @Bean(name = "ponoramaZsTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("ponoramaZsDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ponoramaZsSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ponoramaZsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
