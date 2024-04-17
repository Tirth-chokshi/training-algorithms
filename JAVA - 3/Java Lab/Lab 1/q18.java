import java.util.Scanner;

class Square {
	public int num;
	
	public Square (int n){
		num = n;
	}
	public void printS(){
		System.out.println("Square of enterd number: "+num*num);
	}
	public static void main(String args[]) {
		Square no = new Square(3);
		no.printS();
	}
}