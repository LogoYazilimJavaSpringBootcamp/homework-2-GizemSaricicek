package com.bootcamp.homework1;

public abstract class CorCustomerAbstract implements Customer{
	
	String printName(String name){ //override
		return "Corporate customer name: " + name;
	};
}
