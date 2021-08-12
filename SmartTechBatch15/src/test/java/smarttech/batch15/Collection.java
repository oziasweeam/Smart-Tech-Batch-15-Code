package smarttech.batch15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// Class 13 Day Time is 47 mints
		
//		int [] apple = new int [3]; //Class 13 Day Time is 51 mints
//		
//		apple[0]=75;
//		apple[1]=34;
//		apple[2]=56;
//		
//		for(int abc:apple) {
//			System.out.println("The Value of apple is: "+abc);
//		}
//		
//		String[] you= new String[3];  //Class 13 Day Time is 58 mints / 1:04 H
//		
//		you[0]="Love yourself";
//		you[1]="Alive is awesome";
//		you[2]="Be in Present";
//		
//		for (int i=0;i<you.length;i++) {
//			System.out.println(you[i]);
//		}
//		
//		ArrayList<String> arrlistobj=new ArrayList<String>(); //Class 13 Day Time is 1:11 H
//		
//		arrlistobj.add("Alive is awesome");
//		arrlistobj.add("Love youself");
//		arrlistobj.add("I love Java");
//		
//		for (int i=0; i<arrlistobj.size();i++) { 
//			//Class 13 Day Time is 1:19 H
//			System.out.println("ArrayList Example: "+arrlistobj.get(i));
//		}
//		
//		HashMap<String,String> map=new HashMap<String, String>();
//		//Class 13 Day Time is 1:23 H
//		
//		map.put("Tom","4564579807");
//		map.put("Sam","8070982365");
//		map.put("Molly","6750985674");
//		map.put("Farhana","frdsfgsd");
//		map.put("Marziya", "6464984315");
//		map.put("Fariba", "546553543");
//		
//		System.out.println(map);
//		System.out.println("This is Molly's number "+map.get("Molly"));
		
//		Hashtable<String,Integer> map1=new Hashtable<String, Integer>();
//		//Class 13 Day Time is 1:26 H  //Class 13 Day Time is 1:37 H
//		
//		map1.put("Farhana",14544455);
//		map1.put("Marziya", 64645252);
//		map1.put("Fariba", 546553543);
//		
//		System.out.println(map1);
//		System.out.println("This is Marziya's number: "+map1.get("Marziya"));
//		
//		Vector<String> abc= new Vector<String>();
//		
//		abc.add("ZM Hoque");
//		abc.add("USA");
//		abc.add("Batch 15");
//		
//		System.out.println(abc);
		
		//Class 13 Day Time is 2:12 H
//		int [][] orange = new int [3][4];
//		
//		orange [2][1] = 45;
//		orange [0][1] = 67;
//		orange [1][1] = 78;
//		orange [1][2] = 90;
//		orange [0][2] = 23;
//		
//		System.out.println(orange[1][2]);
		
	    //Class 13 Day Time is 2:58 H
//		ArrayList<Integer> price=new ArrayList<Integer>(); //Class 13 Day Time is 1:11 H
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
//	       //Class 13 Day Time is 3:00 H
//		
//			ArrayList<Integer> price1=new ArrayList<Integer>(); 
//			price1.add(50);
//			price1.add(20);
//			price1.add(90);
//			Collections.sort(price1); //Class 13 Day Time is 3:03 H
//			
//			System.out.println(price1); 
//			
//		       //Class 13 Day Time is 3:04 H
//			
//				ArrayList<String> price11=new ArrayList<String>(); 
//				price11.add("$30.50");
//				price11.add("$49.75");
//				price11.add("$20.25");
//				Collections.sort(price11); //Class 13 Day Time is 3:06 H
//				
//				System.out.println(price11);
				
				
			       //Class 13 Day Time is 3:07 H
				
				ArrayList<String> price111=new ArrayList<String>();
				ArrayList<String> price11New=new ArrayList<String>();
				
				price111.add("$30.50 Taka");
				price111.add("$49.75 Taka");
				price111.add("$20.25 Taka");
				price11New.add(price111.get(1).replace("$","")); //Class 13 Day Time is 3:12 H
				
				System.out.println(price11New);  //Class 13 Day Time is 3:14 H

	}

}
