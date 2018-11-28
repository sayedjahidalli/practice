package com.jahid.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.jahid.entities.Student;

public class StudentDAO {
	private HibernateTemplate hibernateTemplate;
	
	
	
	public StudentDAO(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public Student getStudent() {
		
		return hibernateTemplate.get(Student.class, 2);
	}

}
