package application;

import java.util.List;
import java.util.Scanner;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n----- TESTE 1: department findAll -----");
		
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
		
		System.out.println("\n----- TESTE 2: department findById -----");
		
		System.out.print("Digite o id: ");
		int id = sc.nextInt();
		
		Department department = departmentDao.findById(id);
		System.out.println(department);
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
