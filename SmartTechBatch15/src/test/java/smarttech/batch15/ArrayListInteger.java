package smarttech.batch15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {

	public static void main(String[] args) {
		//Class 13 Day Time is 2:58 H
		
//		ArrayList<Integer> price=new ArrayList<Integer>(); 
//		
//		price.add(30);
//		price.add(70);
//		price.add(90);
//		
//		for (int i=0; i<price.size();i++) { 
//			System.out.println("ArrayList Example: "+price.get(i));
//
//		}
//		
//		       //Class 13 Day Time is 3:00 H
//		
//				ArrayList<Integer> price1=new ArrayList<Integer>(); 
//				price1.add(50);
//				price1.add(20);
//				price1.add(90);
//				Collections.sort(price1); //Class 13 Day Time is 3:03 H
//				
//				System.out.println(price1); 
		
		
//	       //Class 13 Day Time is 3:04 H
//		
//			ArrayList<String> price1=new ArrayList<String>(); 
//			price1.add("$30.50");
//			price1.add("$49.75");
//			price1.add("$20.25");
//			Collections.sort(price1); //Class 13 Day Time is 3:06 H
//			
//			System.out.println(price1);
		
		    
	       //Class 13 Day Time is 3:07 H
		
			ArrayList<String> price11=new ArrayList<String>();
			ArrayList<String> price11New=new ArrayList<String>();
			
			price11.add("$30.50 Taka");
			price11.add("$49.75 Taka");
			price11.add("$20.25 Taka");
			price11New.add(price11.get(1).replace("$","%")); //Class 13 Day Time is 3:12 H
			
			System.out.println(price11New); //Class 13 Day Time is % 3:14 H
			



	 
	}

}
