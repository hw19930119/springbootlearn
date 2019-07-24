/*
 * @(#) SpringbootlearnApplication
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2019
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2019-07-24 16:13:59
 */

package hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

@SpringBootApplication
@RestController
public class SpringbootlearnApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootlearnApplication.class, args);
	}
	@RequestMapping(value="/hello")
	public String helloWrold(){

		return "hollo world!";
	}
	@Override
	public void run(String... args) throws Exception {
		showConnection();
		showData();
	}

	private void showConnection() throws SQLException {
		System.out.println(dataSource.toString());
		Connection conn = dataSource.getConnection();
		System.out.println(conn.toString());
		conn.close();
	}

	private void showData() {
		jdbcTemplate.queryForList("SELECT * FROM FOO")
			.forEach(row -> System.out.println(row.toString()));
	}
}
