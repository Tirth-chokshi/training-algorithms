import java.util.Scanner;

class Q1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try{
			int d,num;
			num = sc.nextInt();
			d = num/0;
			System.out.println("Enterd num: "+d);
		}
		catch (Exception A) {
			System.out.println("cannot Divide by Zero");
		}
	}
}