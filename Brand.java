package org.corejava.dealers;

import java.util.Scanner;

public class Brand implements BrandInterface{
	static int brandselection;
	static int sizeinput=new Size().getsizeoption();
	String brandname;
	

	@Override
	public void brandName() {
		System.out.println("\n\t\tList of Cars are displayed below");
		// TODO Auto-generated method stub
		System.out.println("\n1. Audi\t\t\t2. Benz");
		System.out.println("3. Peugeot\t\t4. Porsche");
		brandSelection();
		new BrandName().display();
		
		
	}
	
	public int brandSelection() {
		Scanner brandscan=new Scanner(System.in);
	try {
		brandselection=brandscan.nextInt();
		while(brandselection<1 || brandselection>4) {
			System.out.println("Please enter correct input.");
			brandselection=brandscan.nextInt();
		}
		
		
	}
	catch(Exception e) {
		System.out.println("Please Enter number input");
		brandSelection();
	}
	return brandselection;
	}

	public static int getBrandselection() {
		return brandselection;
	}

	public static int getSizeinput() {
		return sizeinput;
	}
	
	

	

	

}
