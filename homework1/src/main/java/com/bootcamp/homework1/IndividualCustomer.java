package com.bootcamp.homework1;

//import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class IndividualCustomer extends IndCustomerAbstract{

	private String name;
	private String surname;
	private String signInMonth;
	private Map<Integer, Order> orders = new HashMap<>();
	private Set<Bill> bills = new LinkedHashSet<Bill>();
	static Integer key;
	
	
	//constructors
	public IndividualCustomer() {
		super();
		this.name = "name";
		this.surname = "surname";
	}
	
	public IndividualCustomer(String name, String surname, String signInMonth, Map<Integer, Order> orders,
			Set<Bill> bills) {
		super();
		this.name = name;
		this.surname = surname;
		this.signInMonth = signInMonth;
		this.orders = orders;
		this.bills = bills;
	}
	
	public IndividualCustomer(String name, String surname, String signInMonth) {
		super();
		this.name = name;
		this.surname = surname;
		this.signInMonth = signInMonth;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Integer getKey() {
		return key;
	}

	public static void setKey(Integer key) {
		IndividualCustomer.key = key;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSignInMonth() {
		return signInMonth;
	}

	public void setSignInMonth(String signInMonth) {
		this.signInMonth = signInMonth;
	}

	public Map<Integer, Order> getOrders() {
		return orders;
	}

	public void setOrders(Map<Integer, Order> orders) {
		this.orders = orders;
	}

	public Set<Bill> getBills() {
		return bills;
	}
	

	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void addOrder(Order order) {
		this.orders.put(getKey(), order);
		key++;
	}

	// to get bill's for compare
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

	@Override
	public void addBill(Bill bill) {
		this.bills.add(bill);

	}
}
