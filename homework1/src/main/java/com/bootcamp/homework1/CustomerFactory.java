package com.bootcamp.homework1;

public class CustomerFactory {

	public Customer createCustomer(int type) {
		if(type == 1) {
			return new IndividualCustomer();
		}
		else if(type == 2) {
			return new CorporateCustomer();
		}
		return null;
	}
}
