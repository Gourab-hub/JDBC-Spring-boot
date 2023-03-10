package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createTable() {
		var query = "CREATE TABLE student(id SERIAL PRIMARY KEY , name varchar(255) NOT NULL , city varchar(255) NOT NULL)";
		int update = this.jdbcTemplate.update(query);
		System.out.println(update);

	}

}
