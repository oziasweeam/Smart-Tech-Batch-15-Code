package smarttech.batch15;

public class ReverseString {

	public static void main(String[] args) {
		
		String abc = "United State Of America";
		StringBuilder obj = new StringBuilder (abc);
		
		obj.reverse();
		System.out.println(obj);

	}

}
