package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.CustomerException;

public class CancelTicketUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Mobile No :");
		
		String mob = input.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			String result = dao.cancelTicket(mob);
			
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
