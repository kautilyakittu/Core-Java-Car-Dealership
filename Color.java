package org.corejava.dealers;
import java.util.*;

public class Color {
	int colorname;
	
	Random random = new Random();
	
	
	public void colorInput() {
		Scanner colorscan=new Scanner(System.in);
		System.out.println("\t\tPlease Select the color from the following");
		System.out.println("1. Blue\t\t 2. Red");
		System.out.println("3. White\t 4. Black");
		try {
		colorname=colorscan.nextInt();
		
		}
		catch(Exception e) {
			System.out.println("Please Enter number input");
			colorInput(); 
		}
		while(colorname<1 || colorname>4) {
			System.out.println("Incorrect input");
			colorname=colorscan.nextInt();
		}
		
		if(carColor(colorname)) {
			PriceQuote.availability();
		}
		else {
			System.out.println("Out of Stock. Please select other color");
			colorInput();
		}
			
	}
	
	public boolean carColor(int carcolor) {
		return random.nextBoolean();
	}

}
