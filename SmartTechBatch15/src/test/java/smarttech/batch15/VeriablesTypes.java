package smarttech.batch15;

public class VeriablesTypes {

	static int b=20; //Class level variables or static variables
	
	static int c=60;
	
	static int x=50; //This is Instance variables in Java are non-static variables 
	
	static int z=5;
	static int m=5;
		
	public static void main(String[] args) {
		
		VeriablesTypes abc= new VeriablesTypes();
		abc.number();
		
    // Automation Basic page 50
		
		VeriablesTypes xyz= new VeriablesTypes();
		xyz.instance();
		
		VeriablesTypes zmh = new VeriablesTypes();
		zmh.multiply();
		
		
	}

	public static void number() {
		                 //This is the Local variables Method   
		int a= 10;
	System.out.println("Adding this three Number:  " + (a+b+c));			
	}
	
	 protected static void instance() {       //This is the Local variables Method
		int y=150;
		System.out.println("This is two number add: " + (x+y));
	}
	 
	 private static void multiply() {  //private class can never be access
		                          
		 int h=2;
		 System.out.println("multiply this three number: " + (z*m*h));
		 
	 }
}
