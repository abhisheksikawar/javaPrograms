
public class SinglyLinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node head=null,tail=null;
	
	void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			
			//tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
			
		}
	}
	void display() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sll=new  SinglyLinkedList();
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(3);
		sll.display();
	}

}
