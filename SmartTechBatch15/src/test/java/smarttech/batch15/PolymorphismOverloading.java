package smarttech.batch15;

public class PolymorphismOverloading {

	public static void main(String[] args) {
		// Class day 10 time 4:15h

		add(5,8,45);
		
	}

	static void add(int a, int b){
		System.out.println(a+b);
	  	
	}
	
	static void add(int a, int b, int c){  
		System.out.println(a+b+c);
	
	}	
}