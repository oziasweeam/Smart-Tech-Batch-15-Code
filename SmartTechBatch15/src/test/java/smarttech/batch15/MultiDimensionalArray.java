package smarttech.batch15;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//Class 13 Day Time is 2:12 H
		
		int [][] orange = new int [3][4];
		
		orange [2][1] = 45;
		orange [0][1] = 67;
		orange [1][1] = 78;
		orange [1][2] = 90;
		orange [0][2] = 23;
		
		System.out.println(orange[1][2]);

	}

}
