package org.corejava.dealers;


import java.time.Instant;
import java.util.Random;

public class PriceQuote {
	
private static long price;

public static long quote() {
	if(Size.getSize()==1) {
		price=new Random().nextInt(10000-5000)+5000;
	}
	else if(Size.getSize()==2) {
		price=new Random().nextInt(15000-10000)+10000;
	}
	else if(Size.getSize()==3) {
		price=new Random().nextInt(20000-15000)+15000;
	}
	else if(Size.getSize()==4) {
		price=new Random().nextInt(25000-20000)+20000;
	}
	else if(Size.getSize()==5) {
		price=new Random().nextInt(30000-25000)+25000;
	}
	else if(Size.getSize()==6) {
		price=new Random().nextInt(40000-30000)+30000;
	}
	
	return price;
}

public static void availability() {
	long pricequote=quote();
	System.out.println("\n\n Price estimate for your selected car is $"+pricequote);
	java.util.Date date=new java.util.Date();
	date.setDate(date.getDate()+10);
	System.out.println("If you want to proceed with further process. We will arrange the appointment on "+date);
	Confirmation.finalReview();
}



}
