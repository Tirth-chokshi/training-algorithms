/* Get a number from the user and print
whether it is postive or negitive. */

import java.util.Scanner;

class PostiveNegitive{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number>0){
			System.out.println(number+" is postive number.");
		}
		else{
			System.out.println(number+" is negitive number.");
		}
	}
}