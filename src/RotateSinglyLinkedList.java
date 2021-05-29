class RotateSinglyLinkedList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node head=null,tail=null;
	
	void rotate(int k) {
		Node rotate=head;
		int count=1;
		while(count<k&&rotate!=null) {
			rotate=rotate.next;
			count++;
		}
		if(rotate==null) {
			return ;
			
		}
		Node kthNode=rotate;
		while(rotate.next!=null) {
			rotate=rotate.next;
			
		}
		rotate.next=head;
		head=kthNode.next;
		kthNode.next=null;
	
	}
	
	public static void main(String args[]) {
		RotateSinglyLinkedList list=new RotateSinglyLinkedList();
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.display();
		list.rotate(3);
		System.out.println();
		list.display();
		
	}

	private void display() {
		// TODO Auto-generated method stub
		Node current=head;
		while(current!=null) {
			System.out.print(current.data);
			current=current.next;
		}
	}

	private void push(int n) {
		// TODO Auto-generated method stub
		Node newNode=new Node(n);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
//		newNode.next=head;
//		head=newNode;
	}
}