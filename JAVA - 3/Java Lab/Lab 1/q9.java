import java.util.Scanner;

class question9{
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter three numbers:");
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			int no3 = sc.nextInt();
			int max;
			
			max = (no1>no2)? (no1>no3? no1:no3): (no2>no3? no2:no3);
			System.out.println("Largest number between 3 is :"+max);
				
	}
}