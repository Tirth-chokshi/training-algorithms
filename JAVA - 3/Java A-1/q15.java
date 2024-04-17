import java.util.Scanner;

class AddMatrices {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		float [][] mat1 = new float[3][3];
		float [][] mat2 = new float[3][3];
		float [][] result = new float[3][3];
		
		// Taking matix 1 elements :
		System.out.println("Enter matrices number1: ");
		for(int i=0; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				mat1[i][j] = sc.nextFloat();
			}
		}
		
		// Taking matix 2 elements :
		System.out.println("Enter matrices number2: ");
		for(int i=0; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				mat2[i][j] = sc.nextFloat();
			}
		}
		
		// Adding 2 matrix and printing result.
		System.out.println("Addtion of two matrices:");
		for(int i=0; i<mat1.length;i++){
			for(int j=0 ; j<mat1[i].length ; i++) {
				result[i][j] = mat1[i][j] + mat2[i][j]; // perform addition.
				System.out.println(result[i][j] + " "); // printing the result of addition.
				
			}
			System.out.println(" ");
		}
	}
}