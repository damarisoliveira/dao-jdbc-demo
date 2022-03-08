package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

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
		
		
		
		
		
		System.out.println("\n----- TESTE 3: department insert -----");
		
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido! id -> " + newDepartment.getId() + " Departamento -> " + newDepartment.getName());
			
		
		
		
		
		
		sc.close();
		
	}

}
