package com.bootcamp.homework1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App{
	
    public static void main( String[] args ){
        
    	CustomerFactory customerFactory = new CustomerFactory();
        Customer customer1 = customerFactory.createCustomer(1); //1 for individual customer
        Customer customer2 = customerFactory.createCustomer(2); //2 for corporate customer
        customer1.printName();
        customer2.printName();

        //creating customers and adding them to list
    	IndividualCustomer cus0 = new IndividualCustomer("Gizem","Saricicek","October");
    	IndividualCustomer cus1 = new IndividualCustomer("Sinem","Saricicek","June");
    	IndividualCustomer cus2 = new IndividualCustomer("Selin","Bican", "July");
    	IndividualCustomer cus3 = new IndividualCustomer("Ceyda","Sahin", "September");
    	IndividualCustomer cus4 = new IndividualCustomer("Taha","Akkaya","June");
    	IndividualCustomer cus5 = new IndividualCustomer("Mehmet","Akkaya", "July");
    	IndividualCustomer cus6 = new IndividualCustomer("Mert","Yener", "August");
    	IndividualCustomer cus7 = new IndividualCustomer("Gokcen","Kayar", "October");
    	CorporateCustomer cus8 = new  CorporateCustomer("A", "July", "Automobile");
    	CorporateCustomer cus9 = new  CorporateCustomer("B", "October", "Textile");
    	CorporateCustomer cus10 = new CorporateCustomer("C", "August", "Technology");
    	CorporateCustomer cus11 = new CorporateCustomer("D", "June", "Automobile");
    	CorporateCustomer cus12 = new CorporateCustomer("E", "September", "Technology");
    	CorporateCustomer cus13 = new CorporateCustomer("F", "June", "Textile");
    	CorporateCustomer cus14 = new  CorporateCustomer("G", "February", "Technology");
    	CorporateCustomer cus15 = new  CorporateCustomer("H", "March", "Automobile");

        List<IndividualCustomer> individualCustomers = new ArrayList<>();
        individualCustomers.add(cus0);
        individualCustomers.add(cus1);
        individualCustomers.add(cus2);
        individualCustomers.add(cus3);
        individualCustomers.add(cus4);
        individualCustomers.add(cus5);
        individualCustomers.add(cus6);
        individualCustomers.add(cus7);
        
        List<CorporateCustomer> corporateCustomers = new ArrayList<>();
        corporateCustomers.add(cus8);
        corporateCustomers.add(cus9);
        corporateCustomers.add(cus10);
        corporateCustomers.add(cus11);
        corporateCustomers.add(cus12);
        corporateCustomers.add(cus13);
        corporateCustomers.add(cus14);
        corporateCustomers.add(cus15);

        //creating bills and adding them to list
        Bill b0 = new Bill("Mango", 80 ,"Textile", "June");
        Bill b1 = new Bill("Mango", 259.9 ,"Textile", "November");
        Bill b2 = new Bill("HM", 100 ,"Textile", "September");
        Bill b3 = new Bill("Mavi", 1689 ,"Textile", "July");
        Bill b4 = new Bill("Teknosa", 1500 , "Technology", "April");
        Bill b5 = new Bill("Pull&Bear", 467.5 ,"Textile", "April");
        Bill b6 = new Bill("HM", 680 ,"Textile", "June");
        Bill b7 = new Bill("Mango", 168.9 ,"Textile", "October");
        Bill b8 = new Bill("Media Markt", 27000, "Technology", "June");
        Bill b9 = new Bill("Bershka", 659 ,"Textile", "October");
        Bill b10 = new Bill("Media Markt", 65000 ,"Technology", "October");
        Bill b11 = new Bill("Zara", 23500 ,"Textile", "June");
        Bill b12 = new Bill("Vatan", 89000 ,"Technology", "June");
        Bill b13 = new Bill("Media Markt", 56600 ,"Technology", "June");
        Bill b14 = new Bill("Teknosa", 659000 ,"Technology", "June");
        Bill b15 = new Bill("Bershka", 10000 ,"Textile", "September");
        Bill b16 = new Bill("Media Markt", 34500 ,"Technology", "June");
        Bill b17 = new Bill("Media Markt", 9050 ,"Technology", "June");
		
        List<Bill> bills = new ArrayList<>();
        bills.add(b0);
        bills.add(b1);
        bills.add(b2);
        bills.add(b3);
        bills.add(b4);
        bills.add(b5);
        bills.add(b6);
        bills.add(b7);
        bills.add(b8);
        bills.add(b9);
        bills.add(b10);
        bills.add(b11);
        bills.add(b12);
        bills.add(b13);
        bills.add(b14);
        bills.add(b15);

        //adding bills to individual customers
		cus0.addBill(b0);
		cus1.addBill(b1);
		cus2.addBill(b2);
		cus3.addBill(b3);
		cus4.addBill(b4);
		cus5.addBill(b5);
		cus6.addBill(b6);
		cus7.addBill(b7);
		cus1.addBill(b8);
		cus2.addBill(b9);
		
        //adding bills to corporate customers
		cus8.addBill(b10);
		cus8.addBill(b11);
		cus8.addBill(b12);
		cus9.addBill(b13);
		cus10.addBill(b14);
		cus10.addBill(b15);
		cus10.addBill(b16);
		cus11.addBill(b16);
		cus11.addBill(b17);
		
		//create new customer

	    System.out.println("Please enter the customer type: \n(enter 1 for individual, enter 2 for corporate)");
		Scanner input1 = new Scanner(System.in);
	    int customerType = input1.nextInt();
	    
	    switch(customerType) {
	    	
	    	//create individual customer
	    	case 1:
	    		Scanner input = new Scanner(System.in);

	    		System.out.println("Please enter the name:");
	    	    String nameInd = input.nextLine();
	    	    System.out.println("Please enter the surname:");
	    	    String surnameInd = input.nextLine();
	    	    System.out.println("Please enter the current month:");
	    	    String monthInd = input.nextLine();
	    	    IndividualCustomer newIndCus = new IndividualCustomer(nameInd,surnameInd,monthInd);
	            individualCustomers.add(newIndCus);
	            System.out.println("Succesfully added.");
	            break;
	    		
	    	// create corporate customer
	    	case 2:
	    		Scanner input2 = new Scanner(System.in);

	    		System.out.println("Please enter the name:");
	    	    String nameCor = input2.nextLine();
	    	    System.out.println("Please enter the current month:");
	    	    String monthCor = input2.nextLine();
	    	    System.out.println("Please enter the sector:");
	    	    String sectorCor = input2.nextLine();
	            CorporateCustomer newCorCus = new  CorporateCustomer(nameCor, monthCor, sectorCor);
	            corporateCustomers.add(newCorCus);
	            System.out.println("Succesfully added.");
	            break;
	    }
        System.out.println();

        //print all customers
        System.out.println("Customer List:");
        
        individualCustomers.stream().forEach(customer -> System.out.println(customer.printName(customer.getName(), customer.getSurname())));
        corporateCustomers.stream().forEach(customer -> System.out.println(customer.printName(customer.getName())));
        
        //print all bills
        System.out.println();
        System.out.println("Customer Bills:");
        
        individualCustomers.stream().
        forEach(customer -> System.out.println(customer.printName(customer.getName(), customer.getSurname()) + ": " + customer.getBills()));
        corporateCustomers.stream().
        forEach(customer -> System.out.println(customer.printName(customer.getName()) + ": " + customer.getBills()));
        
        //find 'c' or 'C' in customer's name or surname
        System.out.println();
        System.out.println("Customers who contains 'c' or 'C' in their name or surname:");

        individualCustomers.stream()
        .filter(s -> s.getName().contains("c") || s.getName().contains("C") || s.getSurname().contains("c") || s.getSurname().contains("C"))
        .forEach(customer -> System.out.println(customer.printName(customer.getName(), customer.getSurname())));
        corporateCustomers.stream()
        .filter(s -> s.getName().contains("c") || s.getName().contains("C"))
        .forEach(customer -> System.out.println(customer.printName(customer.getName())));
        
        //find the customers who bill amount is less then 500 tl
        System.out.println();
        System.out.println("Customers who bill amount is less then 500 TL:");
        
        individualCustomers.stream()
        .filter(a -> a.getBillAmountCompare(500.0, '<') !=0)
        .forEach(customer -> System.out.println(customer.printName(customer.getName(), customer.getSurname())));
        corporateCustomers.stream()
        .filter(a -> a.getBillAmountCompare(500.0, '<') != 0)
        .forEach(customer -> System.out.println(customer.printName(customer.getName())));
        
        //find the bills amount which is higher then 1500 tl
        System.out.println();
        System.out.println("Bills amount which is higher then 1500 TL:");
        
        bills.stream().filter(a -> a.getAmount() >1500.0)
        .forEach(bill -> System.out.println(bill.getBiller() + " " + bill.getAmount()));

        //find the bills total amount which is sign-in month is July
        System.out.println();
        System.out.print("Bills total amount which is sign-in month is June: ");
        
        List<Double> totalAmountJulyInd = individualCustomers.stream()
        .filter(a -> a.getSignInMonth().equals("June"))
        .map(pm ->pm.getTotalBillAmount()).toList();
        
        double sum1 = totalAmountJulyInd.stream().mapToDouble(Double::doubleValue).sum();
        
        List<Double> totalAmountJulyCor = corporateCustomers.stream()
        .filter(a -> a.getSignInMonth().equals("June"))
        .map(pm ->pm.getTotalBillAmount()).toList();
        
        double sum2 = totalAmountJulyCor.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println(sum1+sum2);

        //find the bills rate which is higher then 1500 tl
        System.out.println();
        System.out.print("Bills rate which is higher then 1500 TL: ");
        
        List<Double> billRatesInd = individualCustomers.stream()
        .filter(a -> a.getBillAmountCompare(1500.0, '>') !=0)
        .map(pm ->pm.getBillAmountCompare(1500.0, '>')).toList();
        
        List<Double> billRatesCor = corporateCustomers.stream()
        .filter(a -> a.getBillAmountCompare(1500.0, '>') !=0)
        .map(pm ->pm.getBillAmountCompare(1500.0, '>')).toList();
        
        double rateFinal = (billRatesInd.stream().mapToDouble(Double::doubleValue).sum() + billRatesCor.stream().mapToDouble(Double::doubleValue).sum()) / (billRatesInd.size() + billRatesCor.size());
        
        System.out.println(rateFinal);     
        
        input1.close();
    }
}
