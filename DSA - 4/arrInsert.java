import java.util.*;
class arrInsert
{
	public static void main(String [] args)
	{
		int arr[] = {10, 20, 30, 40, 50};
		int len = arr.length;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before Insertion: ");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		
		int newArr[] = new int[len+1];
		
		System.out.println("Enter element: ");
		int elem = sc.nextInt();
		System.out.println("Enter position: ");
		int posi = sc.nextInt();
		
		for(int i=0;i<len;i++)
		{
			newArr[i] = arr[i];
		}
		
		for(int i=len;i>=posi;i--)
		{
			newArr[i] = newArr[i-1];
		}
		
		newArr[posi-1] = elem;
		
		System.out.println("After Insertion: ");
		for(int i=0;i<len+1;i++)
		{
			System.out.println(newArr[i]);
		}
	}
}