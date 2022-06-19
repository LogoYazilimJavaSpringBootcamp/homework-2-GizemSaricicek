package com.bootcamp.homework1;

public abstract class IndCustomerAbstract implements Customer {
	
	String printName(String name, String surname){ //override
		return "Individual customer name and surname: " + name + " " + surname;
	}

}
