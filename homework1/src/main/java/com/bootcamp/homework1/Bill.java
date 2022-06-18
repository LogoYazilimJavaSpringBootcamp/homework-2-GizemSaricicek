package com.bootcamp.homework1;

public class Bill {
	
	private String biller;
	private double amount;
	private String sector;
	private String billDate;
	
	//constructors
	public Bill(String biller, double amount, String sector, String billDate) {
		super();
		this.biller = biller;
		this.amount = amount;
		this.sector = sector;
		this.billDate = billDate;
	}
	
	public Bill(String biller, double amount) {
		super();
		this.biller = biller;
		this.amount = amount;
	}

	//getters and setters
	public String getBiller() {
		return biller;
	}
	
	public void setBiller(String biller) {
		this.biller = biller;
	}
	
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getBillDate() {
		return billDate;
	}
	
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
	@Override
	public String toString() {
		return "Bill [biller=" + biller + ", amount=" + amount + ", sector=" + sector + ", billDate=" + billDate + "]";
	}
}
