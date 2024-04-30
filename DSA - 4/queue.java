import java.util.*;
class queue{
	public static void main(String args[]){
		queue q = new queue(5);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(8);
		q.peek();
		q.display();
		q.dequeue();
		q.display();
	}
	
	int arr[];
	int end;
	int size;
	
	queue(int size){
		this.arr = new int[size];
	}
	void enqueue(int val){
		arr[end] = val;
		end++;
	}
	void dequeue(){
		int removed = arr[0];
		for(int i =1 ; i<arr.length; i++){
			arr[i-1] = arr[i];
		}
		end--;
	}
	void peek(){
		System.out.println(arr[0]);
	}
	void display(){
		System.out.println(Arrays.toString(arr));
	}
}