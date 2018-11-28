package com.jahid.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jahid.dao.StudentDAO;
import com.jahid.entities.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
		StudentDAO dao=applicationContext.getBean(StudentDAO.class);
		Student stud = dao.getStudent();
		System.out.println(stud);
		
		
		
		
		
	}

}
