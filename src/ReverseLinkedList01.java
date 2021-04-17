
public class ReverseLinkedList01 {
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
		};
		
	}
	static Node head=null;
	
	public void reverse(Node head) {
		Node current=head,next=null;
		Node prev=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		
	}
	void display(Node head) {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList01 dlist=new ReverseLinkedList01();
		dlist.head=new Node(23);
		dlist.head.next=new Node(8);
		dlist.head.next.next=new Node(5);
		dlist.head.next.next.next=new Node(4);
		dlist.head.next.next.next.next=new Node(84);
		dlist.display(head);
		dlist.reverse(head);
		dlist.display(head);
	}

}
