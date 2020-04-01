package org.corejava.dealers;

import java.util.Scanner;

public class Porsche extends Size implements ModelName {

	private int modelname;
	
	Color color=new Color();



	@Override
	public int modelName() {
		Scanner modelscan=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		switch(getSize()) {
		case 1:
			System.out.print("1. Porsche 718 Cayman Coupe\t\t");
			System.out.println("2. Porsche 718 Boxster Roadster");
			break;
		
		
		case 2:
			System.out.print("1. Porsche 718 Boxster Roadster\t\t");
			System.out.println("2. Porsche 718 Spyder");
			break;
			
		case 3:
			System.out.print("1. Porsche Macan Estate\t\t");
			System.out.println("2. Porsche Macan Cabriolet");
			break;
			
		case 4:
			System.out.print("1. Porsche Cayenne Coupe\t\t");
			System.out.println("2. Porsche Cayenne Estate");
			break;
			
		case 5:
			System.out.print("1. Porsche Taycan Saloon\t\t");
			System.out.println("2. Porsche Panamera Sport Turismo");
			break;
			
		case 6:
			System.out.print("1. Porsche Panamera Hatchback\t\t");
			System.out.println("2. Porsche Taycan Saloon");
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
