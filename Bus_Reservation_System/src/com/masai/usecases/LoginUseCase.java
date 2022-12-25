  package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.CustomerException;

public class LoginUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Login First :");
		
		System.out.println("Enter Your Id");
		
		int id = input.nextInt();
		
		System.out.println("Enter Your Password :");
		
		String pass = input.next();
		
		CustomerDao customerDao = new CustomerDaoImpl();
		
		try {
			String result = customerDao.login(id,pass);
			
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
