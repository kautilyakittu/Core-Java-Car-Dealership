package org.corejava.dealers;

import java.util.Scanner;

public class Benz extends Size implements ModelName {

	private int modelname;
	
	Color color=new Color();



	@Override
	public int modelName() {
		Scanner modelscan=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		switch(getSize()) {
		case 1:
			System.out.print("1. Mercedes-Benz A Class Hatchback\t\t");
			System.out.println("2. Mercedes-Benz A Class Saloon");
			break;
		
		
		case 2:
			System.out.print("1. Mercedes-Benz AMG GT Coupe\t\t");
			System.out.println("2. Mercedes-Benz B Class Hatchback");
			break;
			
		case 3:
			System.out.print("1. Mercedes-Benz C Class Cabriolet\t\t");
			System.out.println("2. Mercedes-Benz C Class Coupe");
			break;
			
		case 4:
			System.out.print("1. Mercedes-Benz C Class Estate\t\t");
			System.out.println("2. Mercedes-Benz CLS Coupe");
			break;
			
		case 5:
			System.out.print("1. Mercedes-Benz E Class Estate All-terrain\t\t");
			System.out.println("2. Mercedes-Benz EQC Estate");
			break;
			
		case 6:
			System.out.print("1. Mercedes-Benz S Class Saloon\t\t");
			System.out.println("2. Mercedes-Benz SLC Roadster");
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
