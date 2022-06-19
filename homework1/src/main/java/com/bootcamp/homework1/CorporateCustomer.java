package com.bootcamp.homework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CorporateCustomer extends CorCustomerAbstract {

	private String name;
	private String signInMonth;
	private Map<String, Order> orders = new HashMap<>();
	private Set<Bill> bills = new LinkedHashSet<Bill>(); 
	private String companySector;
	
	//constructor
	public CorporateCustomer(String name, String signInDate, Map<String, Order> orders, Set<Bill> bills, String companySector) {
		super();
		this.name = name;
		this.signInMonth = signInDate;
		this.orders = orders;
		this.bills = bills;
		this.companySector = companySector;
	}
	
	public CorporateCustomer(String name, String signInDate, String companySector) {
		super();
		this.name = name;
		this.signInMonth = signInDate;
		this.companySector = companySector;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSignInMonth() {
		return signInMonth;
	}
	
	public void setSignInMonth(String signInMonth) {
		this.signInMonth = signInMonth;
	}
	
	public Map<String, Order> getOrders() {
		return orders;
	}
	
	public void setOrders(Map<String, Order> orders) {
		this.orders = orders;
	}
	
	public Set<Bill> getBills() {
		return bills;
	}
	
	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

	public String getCompanySector() {
		return companySector;
	}

	public void setCompanySector(String companySector) {
		this.companySector = companySector;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBill(Bill bill) {
		this.bills.add(bill);
	}

	
	public Double getBillAmountCompare(Double money, Character a) {
		
		double amount = 0;
			
		for (Iterator<Bill> it = bills.iterator(); it.hasNext(); ) {
		       Double f = it.next().getAmount();
		       if(a.equals('>')) {
			       if (f >money)
			    	   return f;
			       else
			        amount = 0;
		       }
		       else if(a.equals('<')) {
		    	   if (f <money)
			    	   return f;
			       else
			        amount = 0;
		       }
		}
		return amount;
	}

	public Double getTotalBillAmount() {
		double amount = 0;	
		for (Iterator<Bill> it = bills.iterator(); it.hasNext(); ) {
			Double f = it.next().getAmount();
			amount = amount + f;
		}
		return amount;
	}
}
