import java.util.*;
class arrDelete
{
	public static void main(String [] args)
	{
		int arr[] = {10, 20, 30, 40, 50};
		int len = arr.length;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before Deletion: ");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter position: ");
		int posi = sc.nextInt();
		
		for(int i=posi-1;i<len-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		int newArr[] = new int[len-1];
		
		System.out.println("After Deletion: ");
		for(int i=0;i<len-1;i++)
		{
			newArr[i] = arr[i];
			System.out.println(newArr[i]);
		}
		
	}
}