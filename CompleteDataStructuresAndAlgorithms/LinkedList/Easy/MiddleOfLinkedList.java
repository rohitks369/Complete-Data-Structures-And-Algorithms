package Easy;

public class MiddleOfLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void pushNode(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		if(temp==null) {
			temp=newNode;
		}
		else {
			temp.next=newNode;
			temp=temp.next;
		}
		
		
	}
	public void findMiddle() {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("The middle of the linked list is : "+slow.data);
	}
	public void printList() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		MiddleOfLinkedList list=new MiddleOfLinkedList();
		for(int i=1;i<=7;i++) {
			list.pushNode(i);
		}
		
		list.findMiddle();
		list.printList();
	}
}
