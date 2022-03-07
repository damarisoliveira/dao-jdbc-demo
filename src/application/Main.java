package application;

import java.util.Date;
import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("----- TESTE 1: seller findById -----");
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		
		System.out.println("\n----- TESTE 1: seller findById -----");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
	
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	
		
		System.out.println("\n----- TESTE 2: seller insert -----");
		
		list = sellerDao.findAll();
	
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		

		System.out.println("\n----- TESTE 3: seller findById -----");
		
		Seller newSeller = new Seller(null, "Mateus", "mateusmed@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! New id = " + newSeller.getId());
	}
}
