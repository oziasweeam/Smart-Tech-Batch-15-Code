package smarttech.batch15;

public class JavaParameterMethod {

	public static void main(String[] args) {
		
		JavaParameterMethod xyz = new JavaParameterMethod();
		xyz.zunaed("Zunaed M Hoque");
		
		xyz.zunaed("My Teacher Name Jahidul Islam");
		xyz.zunaed("My Institute Name Is Smart Tech IT");
		
		
		add(4,5);
		add(10,20);
		add(1500,700);
		
		int a= 5;
    	int b= 7;
    	int c= a*b;
    	
//    	System.out.println("This value is multiply a and b: "+c);
	}

	   void zunaed(String a) {
		
		System.out.println("Myname is:" + a);
	}

    static void add(int a,int b){
    	int c=a+b;
    	System.out.println("This value is adding a and b: " +c);
    }
    
    static void add() {
    	int a= 5;
    	int b= 7;
    	int c= a*b;
    	
    	System.out.println("This value is multiply a and b: "+c);
    }
}
