package org.corejava.dealers;

import java.util.Scanner;

public class Customer {
	private String name;
	Scanner customerscan=new Scanner(System.in);
	public void details() {
		System.out.print("What is your name?\t");
		
		name=customerscan.nextLine();
		

		while(name.isEmpty()) {
			System.out.println("Please enter your name and try again");
			
			name=customerscan.nextLine();
		}
			System.out.println("\n\t\tHello "+name);
			Budget.BudgetRange();
	}
	


}
