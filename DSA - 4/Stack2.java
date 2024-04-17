import java.util.*;
class Stack2
{
	int arr[];
	int top;
	
	Stack2(int len)
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
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty / Underflow");
			return -1;
		}
		
		else
		{
			int popEle = arr[top];
			top--;
			return popEle;
		}
	}
	
	int disp()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty / Underflow");
			return -1;
		}
		
		else
		{
			System.out.println("Elements are: ");
			for(top = arr.length-1;top>=-1;top--)
			{
				System.out.println(peek());
			}
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int size = sc.nextInt();
		
		Stack2 st = new Stack2(size);
		
		for(int i=1;i<=st.arr.length;i++)
		{
			System.out.print("Enter value: ");
			int value = sc.nextInt();
			st.push(value);
		}
		
		System.out.println("")
		while(st.top>=st.arr.length-3)
		{
			pop();
			top--;
		}
	}
}