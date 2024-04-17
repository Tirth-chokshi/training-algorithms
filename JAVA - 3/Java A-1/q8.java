import java.util.Scanner;

class Greatest{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 integer: ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		
		if (no1>=no2 && no1>=no3){
			System.out.println(no1+" is the greatest.");
		}
		else if (no2>=no1 && no2>=no3){
			System.out.println(no2+" is the greatest.");
		}
		else{
			System.out.println(no3+" is the greatest.");
		}
		
	}
	
}