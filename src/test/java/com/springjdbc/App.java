package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	 public static void main(String[] args) {
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		 
		 JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 
		 //sql query
		 String query = "insert into student(id, firstname, lastname, email,gender,dob ) values(?,?,?,?,?,?)";
		 
		 //fireing query
		 
		 int result = template.update(query, 1, "shaik", "zakir", "szh@gmail.com", "M", "19-10-1999");
		 System.out.printf( "no of records is  :",+ result);
	 }
}
