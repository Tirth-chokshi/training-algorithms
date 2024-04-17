import java.util.Scanner;

class getString{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String st = sc.next();
		
		System.out.println("Your string:"+st);
	}
}