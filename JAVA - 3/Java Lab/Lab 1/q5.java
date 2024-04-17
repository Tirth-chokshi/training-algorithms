import java.util.Scanner;

class question2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the meters:");
		
		double meter = scan.nextDouble();
		double feet;
		
		feet = (meter/0.3048);
		
		System.out.printf("%f meters is %f in feets",meter,feet);
	}
}