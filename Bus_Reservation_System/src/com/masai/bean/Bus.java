package com.masai.bean;

import java.sql.Date;
import java.time.LocalDateTime;

public class Bus {

	
	private int Bid;
	private String BName;
	private String BRoute_start;
	private String BRoute_end;
	private String BType;
	private int BSeats;
	private Date BDateTime_dept;
	private Date BDateTime_arri;
	private int BAdId;
	
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bus(int bid, String bName, String bRoute_start, String bRoute_end, String bType, int bSeats,
			Date bDateTime_dept, Date bDateTime_arri, int bAdId) {
		super();
		Bid = bid;
		BName = bName;
		BRoute_start = bRoute_start;
		BRoute_end = bRoute_end;
		BType = bType;
		BSeats = bSeats;
		BDateTime_dept = bDateTime_dept;
		BDateTime_arri = bDateTime_arri;
		BAdId = bAdId;
	}


	public int getBid() {
		return Bid;
	}


	public void setBid(int bid) {
		Bid = bid;
	}


	public String getBName() {
		return BName;
	}


	public void setBName(String bName) {
		BName = bName;
	}


	public String getBRoute_start() {
		return BRoute_start;
	}


	public void setBRoute_start(String bRoute_start) {
		BRoute_start = bRoute_start;
	}


	public String getBRoute_end() {
		return BRoute_end;
	}


	public void setBRoute_end(String bRoute_end) {
		BRoute_end = bRoute_end;
	}


	public String getBType() {
		return BType;
	}


	public void setBType(String bType) {
		BType = bType;
	}


	public int getBSeats() {
		return BSeats;
	}


	public void setBSeats(int bSeats) {
		BSeats = bSeats;
	}


	public Date getBDateTime_dept() {
		return BDateTime_dept;
	}


	public void setBDateTime_dept(Date bDateTime_dept) {
		BDateTime_dept = bDateTime_dept;
	}


	public Date getBDateTime_arri() {
		return BDateTime_arri;
	}


	public void setBDateTime_arri(Date bDateTime_arri) {
		BDateTime_arri = bDateTime_arri;
	}


	public int getBAdId() {
		return BAdId;
	}


	public void setBAdId(int bAdId) {
		BAdId = bAdId;
	}


	@Override
	public String toString() {
		return "Bus [Bid=" + Bid + ", BName=" + BName + ", BRoute_start=" + BRoute_start + ", BRoute_end=" + BRoute_end
				+ ", BType=" + BType + ", BSeats=" + BSeats + ", BDateTime_dept=" + BDateTime_dept + ", BDateTime_arri="
				+ BDateTime_arri + ", BAdId=" + BAdId + "]";
	}
	
	

}
