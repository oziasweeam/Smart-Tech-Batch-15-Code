package smarttech.batch15;

public class ClassOne {

	public static void main(String[] args) {

		ClassTwo.cat();   // This is static method
		
		ClassThree obj=new ClassThree();
		obj.dog();       // This is non static method
		
		JavaNumberMethod.cat();   // This is static method
		
		
	}

}
