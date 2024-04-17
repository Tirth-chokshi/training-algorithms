import java.util.Scanner;

class OddEven {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer to check number is Odd or Even:");
		int num = sc.nextInt();
		// checking whether number of input is Even or Odd.
		if (num%2==0){
			System.out.println("Number is even:"+num);
		}
		else {
			System.out.println("Number is Odd:"+num);
		}
	}
}