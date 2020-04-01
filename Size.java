package org.corejava.dealers;

import java.util.Scanner;



public class Size extends Budget{
	private static int size,sizeoption;
	




	public void SizeAvailable() {
		System.out.println("\tAvailable sizes based on your budget are displayed below. Please Select one of them.\n");
		sizeSuggestion();
		sizeInput();
		BrandInterface interfac=new Brand();
		interfac.brandName();
			
		
	}
	
	public int sizeInput() {
		Scanner scansize=new Scanner(System.in);
		try {
		
		size=scansize.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please Enter Number Input");
			sizeInput();
		}
		while(size<1 || size>sizeoption) {
			System.out.println("Inavlid Option. Please Try again");
			size=scansize.nextInt();
		}
		
	
		
		
		return size;
	}
	
	public void sizeSuggestion() {
		if(getBudget()>=1) {
			System.out.print("1. Micro\t");
			System.out.println("2. Mini");
			sizeoption=2;
		}
		if(getBudget()>=2) {
			System.out.print("3. Sedan\t");
			sizeoption=3;
		}
		if(getBudget()>=3) {
			System.out.println("4. Compact SUV");
			System.out.print("5. SUV\t");
			sizeoption=4;
		}
		if(getBudget()==4) {
			System.out.println("\t6. Luxury");
			sizeoption=6;
		}
	}
	
	public static int getsizeoption() {
		return sizeoption;
	}



	public static int getSize() {
		return size;
	}

	
	
	
	
}
