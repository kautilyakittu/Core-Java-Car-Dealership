package org.corejava.dealers;

import java.util.Scanner;

public class Audi extends Size implements ModelName {

	private int modelname;
	
	
	Color color=new Color();


	@Override
	public int modelName() {
		Scanner modelscan=new Scanner(System.in);
		// TODO Auto-generated method stub

		switch(getSize()) {
		case 1:
			System.out.print("1. Audi A1 Sportback\t\t");
			System.out.println("2. Audi A1 Coupe");
			break;
		
		
		case 2:
			System.out.print("1. Audi A3 Sportback\t\t");
			System.out.println("2. Audi A3 Cabriolet");
			break;
			
		case 3:
			System.out.print("1. Audi A4 Saloon\t\t");
			System.out.println("2. Audi A5 Cabriolet");
			break;
			
		case 4:
			System.out.print("1. Audi A3 Sportback\t\t");
			System.out.println("2. Audi A4 Avant");
			break;
			
		case 5:
			System.out.print("1. Audi Q7 Estate\t\t");
			System.out.println("2. Audi Q8 Estate");
			break;
			
		case 6:
			System.out.print("1. Audi R8 TTS\t\t");
			System.out.println("2. Audi R8 Coupe");
			break;
		}
		try {
		
		modelname=modelscan.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please Enter Number input");
			modelName();
		}
		while(modelname<1 || modelname>2) {
			System.out.println("Incorrect input");
			modelname=modelscan.nextInt();
		}
		color.colorInput();
		return modelname;
	}

}
