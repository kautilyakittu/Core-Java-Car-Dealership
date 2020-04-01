package org.corejava.dealers;

public class BrandName extends Brand {

	
	public void display() {
		System.out.println("\n\t\tPlease select the model from the below options\n");
		switch(getBrandselection()) {
			
		case 1:
			ModelName audi=new Audi();
			audi.modelName();
			break;
		case 2:
			ModelName bmw=new Benz();
			bmw.modelName();
			break;
		case 3:
			ModelName alpha=new Peugeot();
			alpha.modelName();
			break;
		case 4:
			ModelName buggati=new Porsche();
			buggati.modelName();
			break;
			
		}
		
	}



	

	

}
