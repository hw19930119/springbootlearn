package com.hw.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
