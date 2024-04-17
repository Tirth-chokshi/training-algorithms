import java.util.Scanner;

class question7{
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter tempreture in fernheit:");
			int fernheit = sc.nextInt();
			
			int celcius = (fernheit-32)*5/9;
			
			System.out.println(celcius);
	}
}