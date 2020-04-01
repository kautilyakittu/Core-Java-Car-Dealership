package org.corejava.dealers;

import java.util.Scanner;
import java.util.UUID;

public class Confirmation {
	private static int finalconfirmation;
 
	public static void finalReview() {
		try {
		Scanner finalscan=new Scanner(System.in);
		System.out.println("Select one of the below options");
		System.out.println("1. Yes.\t\t2. No");
		
		finalconfirmation=finalscan.nextInt();
		
		System.out.println(finalconfirmation);
		while(finalconfirmation<1 || finalconfirmation>2) {
			System.out.println("Please Enter Correct details");
			finalconfirmation=finalscan.nextInt();
		}
		
		if(finalconfirmation==1) {
			String uniqueID = UUID.randomUUID().toString();
			System.out.println("Your appointment was registered successfully");
			System.out.println("Appointment reference code is "+uniqueID);
			System.out.println("Please show this code at Core Java Car Dealership,Dayton,Ohio");
		}
		else if(finalconfirmation==2) {
			System.out.println("Thank you for using our service !!");
		}
	}
	
	catch(Exception e) {
		System.out.println("Please Enter Number input");
		finalReview();
	}
	}
}
