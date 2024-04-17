import java.util.Scanner;

class question2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total = a+b+c;
		
		int avg = total/3;
		
		System.out.println("Average of 3 number:"+avg);
	}
}