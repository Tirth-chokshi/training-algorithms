import java.util.Scanner;

class Sorting{
	public static void main(String args[]) {
		int [] list = new int[5];
		int temp = 0;
		
		// Taking input elements.
		System.out.println("Enter 5 elements :");
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<list.length ; i++){
			list[i]=sc.nextInt();
		}
		
		// Displaying the unsorted elements of array.
		System.out.println("Unsorted elements:");
		for(int i =0; i<list.length ; i++) {
			System.out.print(list[i]+" ");
		}
		
		// Sorting the elements of array.
		for(int i=0; i<list.length ; i++) {
			for(int j=i+1 ; j<list.length ; j++) {
				if(list[i]>list[j]) {
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				}
			}
		}
		System.out.println();
		
		// Displaying sorted elements.
		System.out.println("Sorted elements:");
		for(int i=0 ; i<list.length ; i++) {
			System.out.print(list[i]+" ");
		}
	}
}