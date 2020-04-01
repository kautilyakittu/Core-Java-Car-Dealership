package org.corejava.dealers;

import java.util.Scanner;

public class Budget {	
	private static int budget;
	


	public static void BudgetRange() {
		try {
		Scanner budgetscan=new Scanner(System.in);
		System.out.println("Please Choose from the following budget\n");
		System.out.println("1. 4-5k \t2. 6-10k\n");
		System.out.println("3. 11-15k \t4. 16-20k\n");
		
		budget=budgetscan.nextInt();
		while(budget<1 || budget>4) {
			System.out.println("You have selected invalid option. Please Try Again");
			budget=budgetscan.nextInt();
		}
		switch(budget) {
		
		case 1:
			System.out.println("\t\tYou have selected 4-5k range.");
			break;
		
		case 2:
			System.out.println("\t\tYou have selected 6-10k range.");
			break;
		
		case 3:
			System.out.println("\t\tYou have selected 11-15k range.");
			break;
		
		case 4:
			System.out.println("\t\tYou have selected 16-20k range.");
			break;
			
		}
		
		
		
	
	}
	catch(Exception e) {
		System.out.println("\t\tPlease Enter number input\n\n");
		BudgetRange();
	}
		new Size().SizeAvailable();

	}
	public static int getBudget() {
		
		return budget;
	}

	
}
		
	
	

