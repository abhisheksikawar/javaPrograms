
public class ReverseDoublyLinkedList01 {
	
	class Node{
		int data;
		Node next;
		Node previous;
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
	Node tail,head=null;
	
	public void addNode(int data) {
		Node n=new Node(data);
	
	if(head==null) {
		head=tail=n;
		head.previous=null;
		tail.next=null;
	}else {
		tail.next=n;
		n.previous=tail;
		tail=n;
		tail.next=null;
	}
	}
	public void reverse() {
		Node current=head,temp=null;
		while(current!=null) {
			temp=current.next;
			current.next=current.previous;
			current.previous=temp;
			current=current.previous;
			
		}
		temp=head;
		head=tail;
		tail=temp;
				
	}
	void display() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
