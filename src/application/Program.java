package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 2000.0, obj); */ 
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obg : list) {
			System.out.println(obg);
		}
		
		System.out.println("\n=== Test 3: Seller findALL ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
