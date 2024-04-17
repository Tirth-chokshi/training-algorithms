// Calculate factorial for given number.


import java.util.Scanner;

class Fact{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int fact=1;
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		for(int i=0; i<=number; i++) {
			fact = fact*i;
		}
		System.out.print("Factorial of "+number+" is:"+fact);
	}
}