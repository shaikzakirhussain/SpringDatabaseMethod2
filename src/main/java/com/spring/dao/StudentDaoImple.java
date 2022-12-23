package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entity.Student;

public class StudentDaoImple implements StudentDao {

	private JdbcTemplate jdbctemplate;
	
	
	public int insert(Student student) {
		//insert query
        String query = "insert into users(id,name,password) values(?,?,?)";
        int result = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getPassword());
		return result;
	}


	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	

}
