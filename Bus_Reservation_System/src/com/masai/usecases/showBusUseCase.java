package com.masai.usecases;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.BusException;

public class showBusUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			List<Bus> buses = dao.showBuses();
			
			Iterator<Bus> itr = buses.iterator();
			
			buses.forEach((Bus b) -> {
				

				System.out.println("Bus Id : "+b.getBid());
				System.out.println("Bus name : "+b.getBName());
				System.out.println("Bus Starts From : "+b.getBRoute_start());
				System.out.println("Bus Ends at : "+b.getBRoute_end());
				System.out.println("Bus Type : "+b.getBType());
				System.out.println("Available seats : "+b.getBSeats());
				System.out.println("Bus Departs At : "+b.getBDateTime_dept());
				System.out.println("Bus Arrives At : "+b.getBDateTime_arri());
				System.out.println("Bus Admin Id : "+b.getBAdId());
				
				System.out.println("***************************************");
			});
			
		} catch (BusException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
