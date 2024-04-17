
/*
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class RandomPlate {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    System.out.print("Random number-plate: ");
    for(int i=0;i<3;i++) {
    char randomLetter = (char) (r.nextInt(26) + 'A');
    System.out.print(randomLetter);
    }
    System.out.printf("%04d%n", r.nextInt(10000));
    }
}
*/

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class RandomPlate{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	Random r = new Random();
	
	System.out.println("Random plate: ");
	
	for(int i=0; i<3 ;i++) {
		char randomLetter = (char)( r.nextInt(26) + 'A');
		System.out.print(randomLetter);
	}
	System.out.printf("%04d%n" , r.nextInt(1000));
	}
}