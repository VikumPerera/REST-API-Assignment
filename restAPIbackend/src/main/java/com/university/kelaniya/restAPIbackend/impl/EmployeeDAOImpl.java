package com.university.kelaniya.restAPIbackend.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.university.kelaniya.restAPIbackend.dao.EmployeeDAO;
import com.university.kelaniya.restAPIbackend.dto.Employee;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Employee employee) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(employee);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

}
