import java.util.Scanner;

class SimpleInterest { 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal amount:");
		double p = sc.nextDouble();
		System.out.print("Enter Rate per annum:");
		double r= sc.nextDouble();
		System.out.print("Enter Time (years):");
		double t = sc.nextDouble();
		// simple interest formula.
		double si=(p*r*t)/100;
		System.out.println("Simple interest:"+si);
	}
}