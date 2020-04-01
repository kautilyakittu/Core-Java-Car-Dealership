package org.corejava.dealers;

import java.util.Scanner;

public class Peugeot extends Size implements ModelName {

	private int modelname;
	
	Color color=new Color();



	@Override
	public int modelName() {
		Scanner modelscan=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		switch(getSize()) {
		case 1:
			System.out.print("1. Peugeot 108 Hatchback\t\t");
			System.out.println("2. Peugeot 2008 Estate");
			break;
		
		
		case 2:
			System.out.print("1. Peugeot 508 Fastback\t\t");
			System.out.println("2. Peugeot 308 SW Estate");
			break;
			
		case 3:
			System.out.print("1. Peugeot 508 SW Estate\t\t");
			System.out.println("2. Peugeot Rifter Estate");
			break;
			
		case 4:
			System.out.print("1. Peugeot 208\t\t");
			System.out.println("2. Peugeot 3008 Estate");
			break;
			
		case 5:
			System.out.print("1. Peugeot 308 SW Estate\t\t");
			System.out.println("2. Peugeot 5008 Estate");
			break;
			
		case 6:
			System.out.print("1. Peugeot Traveller Estate\t\t");
			System.out.println("2. Peugeot E-2008 Electric Estate");
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
