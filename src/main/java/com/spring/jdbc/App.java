package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program started");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student msg = new Student();
        msg.setId(3);
        msg.setName("newhussain");
        msg.setPassword("newpassnew");
        
        int result = studentDao.insert(msg);
        
        System.out.println("the new record method is added : "  + result);
        
        
        
    
		/*
		 * JdbcTemplate template = context.getBean("jdbctemplate", JdbcTemplate.class);
		 * 
		 * //insert query 
		 * String query = "insert into users(id,name,password) values(?,?,?)";
		 * 
		 * //fire query 
		 * 
		 * int result = template.update(query,1,"zakir-2","123zakir%%%2");
		 * System.out.println("number of records : " + result);
		 */
        
        
        
    }
    
    
}


