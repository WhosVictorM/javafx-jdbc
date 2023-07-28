package com.example.javafxjdbc.model.dao;

import com.example.javafxjdbc.db.DB;
import com.example.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.example.javafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
