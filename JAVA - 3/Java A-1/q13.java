import java.util.Scanner;

class LElement_array {  
    public static void main(String[] args) {  
	Scanner sc = new Scanner(System.in);
       int [] list = new int [5] ;
       
	   System.out.print("Enter 5 elements :");
	   
	   // Taking input.
	   for(int i=0; i<list.length ;i++) {
		   list[i] = sc.nextInt();
	   }
	   int max = list[0];  
   
       for (int i = 0; i < list.length; i++) {  
            //Compare elements of array with max  
           if(list[i] > max)  
               max = list[i];  
       }  
       System.out.println("Largest element in the array is : " + max);  
    }  
}  