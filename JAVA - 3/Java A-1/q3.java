import java.util.Scanner;

class TypeCasting{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the decimal number:");
		double num = sc.nextDouble();
		System.out.println("Your number:"+num);
		
		// converting into integer.
		int num2 = (int)num;
		System.out.println("The integer value is: "+num2);
	}
}