import java.util.*;
public class dll{
	public static void main(String args[]){
		dll list = new dll();
		list.iFront(4);
		list.iFront(3);
		list.iEnd(5);
		list.iAt(6,2);
		list.display();
		System.out.println();
		list.dAt(2);
		list.display();
	}
	class Node{
		int value;
		Node prev , next;
		
		Node(int val){
			this.value = val;
		}
		Node(int val,Node next,Node prev){
			this.value = val;
			this.next = next;
			this.prev = prev;
		}
	}
	Node head;
	
	void iFront(int val){
		Node node = new Node(val);
		node.next = head;
		node.prev= null;
		if(head!=null){head.prev = node;}
		head = node;
	}
	void iEnd(int val){
		Node node = new Node(val);
		Node temp = head;
		while(temp.next!= null){
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;
		node.next = null;
	}
	void iAt(int val,int pos){
		Node node = new Node(val);
		Node temp = head;
		for (int i =1 ; i< pos ; i++){
			temp = temp.next;
		}
		node.next = temp.next;
		node.prev = temp;
		temp.next.prev = node;
		temp.next = node;
	}
	void dFront(){
		if(head == null){return;}
		head = head.next;
		if(head!= null){
			head.prev = null;
		}
	}
	void dEnd(){
		Node temp = head;
		while(temp.next!= null){
			temp = temp.next;
		}
		temp.prev.next = null;
	}
	void dAt(int pos){
		Node temp = head;
		for(int i= 1 ; i<pos;i++){
			temp = temp.next;
		}
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
	}
		void display(){
		Node temp = head;
		while(temp!= null){
			System.out.print(temp.value + "  ");
			temp=temp.next;
		}
	}
}