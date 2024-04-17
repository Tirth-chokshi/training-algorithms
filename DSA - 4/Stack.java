import java.util.*;
class Stack
{
	int arr[];
	int top;
	
	Stack(int len)
	{
		arr = new int[len];
		top = -1;
	}
	
	int push(int value)
	{
		if(top==arr.length-1)
		{	
			System.out.println("Stack is Full / Overflow");
			return arr.length;
		}
		else
		{
			top++;
			return arr[top] = value;
		}
	}
	
	int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty / Underflow");
			return -1;
		}
		else
		{
			return arr[top];
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int size = sc.nextInt();
		
		Stack st = new Stack(size);
		
		for(int i=1;i<=st.arr.length;i++)
		{
			System.out.print("Enter value: ");
			int value = sc.nextInt();
			st.push(value);
		}
		
		System.out.println("The current value at top: " + st.peek());
	}
}