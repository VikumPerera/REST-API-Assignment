package com.university.kelaniya.restAPIbackend.dao;

import java.util.List;

import com.university.kelaniya.restAPIbackend.dto.Employee;

public interface EmployeeDAO {
	Employee get(int id);
	List<Employee> list();
	boolean add(Employee employee);
	boolean update(Employee employee);
	boolean delete(Employee employee);
}
