package com.masai.Application;

import java.util.Scanner;

import com.masai.dao.CustomerDaoImpl;
import com.masai.usecases.BookTicketUseCase;
import com.masai.usecases.CancelTicketUseCase;
import com.masai.usecases.LoginUseCase;
import com.masai.usecases.showBusUseCase;

public class Bus_Reservation_System {
	
	public static void welcome() {
		
		new Welcome().main(null);
	}

	public static void choices() {
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter 1 to view buses");
	    System.out.println("Enter 2 to Book a Ticket");
	    System.out.println("Enter 3 to Cancel a ticket");
		System.out.println("Enter 4 to Exit");
		
		int choice = input.nextInt();
		
		switch(choice) {
		
		case 1:
			new showBusUseCase().main(null);
			Bus_Reservation_System.choices();
			break;
		
		case 2:
			new BookTicketUseCase().main(null);
			Bus_Reservation_System.choices();
			break;
			
		case 3:
			new CancelTicketUseCase().main(null);
			Bus_Reservation_System.choices();
			break;
			
		case 4:
			System.out.println("Exit from choices..");
		}
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Bus_Reservation_System.welcome() ;
	    
	    System.out.println("Enter one of the following choices to continue...");
	    
	    Bus_Reservation_System.choices();
	     
	}

}
