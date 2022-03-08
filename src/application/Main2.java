package application;

import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list;
		
		
		System.out.println("\n----- TESTE 1: seller findAll -----");
		
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
	}

}
