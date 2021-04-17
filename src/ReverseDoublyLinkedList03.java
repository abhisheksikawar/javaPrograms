
public class ReverseDoublyLinkedList03 {
	
	public static class Node{
		int data;
		Node next;
		Node Previous;
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}

	Node tail=null;
    Node head=null;
	public  void addNode(int data) {
		 Node newNode=new Node(data);
		 
		 if(head==null) {
			 head=tail=newNode;
			 head.Previous=null;
			 tail.next=null;
		 }else {
			 tail.next=newNode;
			 newNode.Previous=tail;
			 tail=newNode;
			 tail.next=null;
		 }
		
	}
	
	public void reverse() {
		Node current=head,temp=null;
		
		while(current!=null) {
			temp=current.next;
			current.next=current.Previous;
			current.Previous=temp;
			current=current.Previous;
			
		}
		temp=head;
		head=tail;
		tail=temp;
	}
	public void display() {
		Node current=head;
		while(current!=null) {
			
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseDoublyLinkedList03 dlist=new ReverseDoublyLinkedList03();
		dlist.addNode(9);
		dlist.addNode(2);
		dlist.addNode(3);
		dlist.addNode(8);
		dlist.addNode(4);
		dlist.addNode(5);
		
		dlist.display();
		dlist.reverse();
		System.out.println();
		dlist.display();
	}

}
