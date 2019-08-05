/*
 * @(#) SpringbootlearnApplication
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-24 16:13:59
 */

package com.hw.springbootlearn.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,//排除springboot自动装配
	DataSourceTransactionManagerAutoConfiguration.class,//排除springboot自动装配
	HibernateJpaAutoConfiguration.class,//排除掉jpa的自动装配，否者pom中引入了jpa，但是又没有相关的配置，自动装配就会报错
	JdbcTemplateAutoConfiguration.class})//排除springboot自动装配
@RestController
public class SpringbootlearnApplication{
	/*@Autowired
	private DataSource dataSource;*/

	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootlearnApplication.class, args);
	}
	@RequestMapping(value="/hello")
	public String helloWrold(){

		return "hollo world!";
	}
	/*@Override
	public void run(String... args) throws Exception {
		showConnection();
		showData();
	}

	private void showConnection() throws SQLException {
		System.out.println(dataSource.toString());
		Connection conn = dataSource.getConnection();
		System.out.println(conn.toString());
		conn.close();
	}*/

	/*private void showData() {
		jdbcTemplate.queryForList("SELECT * FROM FOO")
			.forEach(row -> System.out.println(row.toString()));
	}*/
}
