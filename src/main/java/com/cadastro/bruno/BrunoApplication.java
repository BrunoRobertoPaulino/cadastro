package com.cadastro.bruno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Cadastro;

@SpringBootApplication
public class BrunoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BrunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM userNames";
		List<Cadastro> user = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cadastro.class));

		user.forEach(System.out::println);
	}

}
