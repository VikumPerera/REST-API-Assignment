package com.university.kelaniya.restAPIbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.university.kelaniya.restAPIbackend.dao.EmployeeDAO;
import com.university.kelaniya.restAPIbackend.dto.Employee;

public class EmployeeTest {
	private static AnnotationConfigApplicationContext context;

	private static EmployeeDAO employeeDAO;

	private Employee employee;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.university.kelaniya");
		context.refresh();
		employeeDAO = (EmployeeDAO)context.getBean("employeeDAO");
	}
	
	@Test
	public void testAddEmployee() {
		
		employee = new Employee();
		
		employee.setFirstName("Vikum");
		employee.setLastName("Perera");
		
		assertEquals("Successfully added a category inside the table!",true,employeeDAO.add(employee));
		
		
	}
}
