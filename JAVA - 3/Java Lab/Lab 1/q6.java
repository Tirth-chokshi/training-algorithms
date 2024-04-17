import java.util.Scanner;

class question2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the letter:");
		char ch = scan.next().charAt(0);   
		
		if(ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U') {
			System.out.printf("%c is a vowel",ch);
		}
		else {
			System.out.printf("%c is a costant",ch);
		}
	}
}