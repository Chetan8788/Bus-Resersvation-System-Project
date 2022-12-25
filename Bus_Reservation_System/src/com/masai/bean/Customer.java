package com.masai.bean;

import java.time.LocalDateTime;

public class Customer {



    private int Cid;
	private String CMob;
	private int Bid;
	private String BName;
	private String BRoute_start;
	private String BRoute_end;
	private String BType;
	private int BSeats;
	private LocalDateTime BDateTime_dept;
	private LocalDateTime BDateTime_arri;
	private int BAdId;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cMob, int bid, String bName, String bRoute_start, String bRoute_end, String bType,
			int bSeats, LocalDateTime bDateTime_dept, LocalDateTime bDateTime_arri, int bAdId) {
		super();
		Cid = cid;
		CMob = cMob;
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

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCMob() {
		return CMob;
	}

	public void setCName(String cMob) {
		CMob = cMob;
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

	public LocalDateTime getBDateTime_dept() {
		return BDateTime_dept;
	}

	public void setBDateTime_dept(LocalDateTime bDateTime_dept) {
		BDateTime_dept = bDateTime_dept;
	}

	public LocalDateTime getBDateTime_arri() {
		return BDateTime_arri;
	}

	public void setBDateTime_arri(LocalDateTime bDateTime_arri) {
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
		return "Customer [Cid=" + Cid + ", CMob=" + CMob + ", Bid=" + Bid + ", BName=" + BName + ", BRoute_start="
				+ BRoute_start + ", BRoute_end=" + BRoute_end + ", BType=" + BType + ", BSeats=" + BSeats
				+ ", BDateTime_dept=" + BDateTime_dept + ", BDateTime_arri=" + BDateTime_arri + ", BAdId=" + BAdId
				+ "]";
	}
	
   
}
