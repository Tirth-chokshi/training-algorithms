import java.util.*;

public class ll{
	public static void main(String args[]){
		ll list = new ll(5);
		list.iFront(3);
		list.iEnd(2);
		list.iEnd(1);
		list.iAt(4,2);
		list.display();
		System.out.println();
		list.dAt(1);
		list.display();
	}
	
	class Node{
		int value;
		Node next;
		Node(int value){ this.value = value; }
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	Node head;
	int size;
	public ll(int size){
		this.size = size;
	}
	 void iFront(int val){
		Node node = new Node(val);
		node.next = head;
		head = node;
		size++;
	}
	void iEnd(int val){
		Node node = new Node(val);
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = node;
		node.next = null;
	}
	void iAt(int val,int pos){
		if(pos == 0){
			iFront(val);
		}
		if(pos == size){
			iFront(val);
		}
		Node temp = head;
		for(int i = 1 ; i< pos; i++){
			temp = temp.next;
		}
		Node node = new Node(val,temp.next);
		temp.next = node;
		size++;
	}
	void dFront(){
		Node temp = head;
		head = temp.next;
		temp = null;
		size--;
	}
	void dEnd() {
		if (head == null || head.next == null) {
        // Empty list or only one element; nothing to delete
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
        temp = temp.next;
		}
		temp.next = null; // Remove the last node
		size--;
	}
	void dAt(int pos){
		Node temp = head;
		for(int i= 1 ; i<pos; i++){
			temp = temp.next;
		}
		
	}
	
	void display(){
		Node temp = head;
		while(temp!= null){
			System.out.print(temp.value + " -> ");
			temp=temp.next;
		}
	}
	
}