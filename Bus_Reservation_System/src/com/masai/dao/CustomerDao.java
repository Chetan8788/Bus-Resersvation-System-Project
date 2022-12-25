package com.masai.dao;

import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public interface CustomerDao {

	public String login(int AdId, String password)throws CustomerException;
	
	public List<Bus> showBuses() throws BusException;
	
	public String bookTicket(String mob,String source,String destintion,int tickets) throws CustomerException;

    public String cancelTicket(String mob) throws CustomerException;
}
