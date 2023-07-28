package com.example.javafxjdbc.model.dao;

import com.example.javafxjdbc.model.entities.Department;

import java.util.List;


public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
