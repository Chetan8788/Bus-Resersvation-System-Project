package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;
import com.masai.utility.DBUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String login(int AdId, String password) throws CustomerException {
	
		String result = null;
		
		  try (Connection conn = DBUtil.provideConnection()) {
			
			 PreparedStatement ps = conn.prepareStatement("select * from login where AdId = ? AND AdPass = ?");
			  
			 ps.setInt(1, AdId);
			 ps.setString(2, password);
			 
			 
			 ResultSet rs = ps.executeQuery();
			 
			 if(rs.next()) {
				 result = "Login Succesful...";
			 }
			 else {
				 throw new CustomerException("Invalid Id OR Password");
			 }
			 
		} catch (SQLException e) {
			// TODO: handle exception
			throw new CustomerException(e.getMessage());
		}   
		
		return result;
		
	}

	@Override
	public List<Bus> showBuses() throws BusException {
		
        List<Bus> buses = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from Bus");
		
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				 
					
				int Bid = rs.getInt("Bid");
				String BName = rs.getString("BName");
				String start = rs.getString("BRoute_start");
				String end = rs.getString("BRoute_end");
				String type = rs.getString("BType");
				int seats = rs.getInt("BSeats");
				Date dept = rs.getDate("BDateTime_dept");
				Date arri = rs.getDate("BDateTime_arri");
				int AId = rs.getInt("BAdId");
				
				Bus bus = new Bus(Bid, BName, start, end, type, seats, dept, arri, AId);
				
				buses.add(bus);
				
			}
			
			if(rs.next() == true) {
				throw new BusException("Buses not available");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BusException(e.getMessage());
		}
		
		return buses;
	}

	@Override
	public String bookTicket(String mob,String source, String destintion,int tickets) throws CustomerException {
		
		String msg = "Ticket not booked!";
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(" select * from bus where BRoute_start = ? AND BRoute_end = ?");
			
			ps.setString(1, source);
			ps.setString(2, destintion);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int bt = rs.getInt("BSeats");
				
				if(tickets < bt ) {
					
					PreparedStatement ps2 = conn.prepareStatement("insert into customers(CMob,Bid,BName,BRoute_start,BRoute_end,BType,BSeats,BDateTime_dept,BDateTime_arri,BAdId) values(?,?,?,?,?,?,?,?,?,?)");
				
						ps2.setString(1, mob);
						ps2.setInt(2, rs.getInt("Bid"));
						ps2.setString(3, rs.getString("BName"));
						ps2.setString(4, rs.getString("BRoute_start"));
						ps2.setString(5, rs.getString("BRoute_end"));
					    ps2.setString(6, rs.getString("Btype"));
					    ps2.setInt(7, tickets);
					    ps2.setDate(8, rs.getDate("BDateTime_dept"));
					    ps2.setDate(9, rs.getDate("BDateTime_arri"));
					    ps2.setInt(10, rs.getInt("BAdId"));
						
					    int x = ps2.executeUpdate();
					    
					PreparedStatement ps3 = conn.prepareStatement("update bus set BSeats = BSeats - ? where Bid = ?");
					
					ps3.setInt(1, tickets);
					ps3.setInt(2, rs.getInt("Bid"));
					
					ps3.executeUpdate();
				}
				else {
					throw new CustomerException("Insufficient Tickets Available in Bus");
				}
			}
			else {
				throw new CustomerException("Please Enter Proper Source & Destination");
			}
			
			msg = "Tickets Booked succesfully";
			
		} catch (SQLException e) {
			
			throw new CustomerException(e.getMessage());
		}
		
		return msg;
	}

	@Override
	public String cancelTicket(String mob) throws CustomerException {
		
		String msg = "Ticket could not be cancelled";
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from customers where CMob = ?");
			
			ps.setString(1, mob);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				PreparedStatement ps2 = conn.prepareStatement("delete from customers where CMob = ?");
		
				ps2.setString(1, mob);
				
				ps2.executeUpdate();
				
				PreparedStatement ps3 = conn.prepareStatement("update bus set Bseats = Bseats + ? where Bid = ?");
				
				ps3.setInt(1, rs.getInt("BSeats"));
				
				ps3.setInt(2, rs.getInt("Bid")); 
				
				ps3.executeUpdate();
			}
			else {
				throw new CustomerException("Please Enter Proper Mobile No");
			}
			
			msg = "Tickets cancelled";
			
		} catch (SQLException e) {
			
			throw new CustomerException(e.getMessage());
		}
		
		return msg;
	}

	

	

}
