package com.masai.Application;

import com.masai.usecases.LoginUseCase;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("*---Welcome to Bus Reservation System---*");
		
		new LoginUseCase().main(args);
	
	}

}
