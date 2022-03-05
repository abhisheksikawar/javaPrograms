package intermediate_programs;

public class ReverseLinkedList {
	
	static class Node{
		int data;
		Node next;
		//Node Prev;
		
		Node(int data){
			this.data=data;
			
		}
	}
	 Node head=null;
	 Node tail=null;
	
	 void  addNode(int data){
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
			
		}
		else {
			tail.next=newNode;
			tail=newNode;
			
		}
		
	}
	 void reverse() {
		 Node pointer=head;
		 Node previous=null;
		 Node current=null;
		 while(pointer!=null) { // 1 2 3   3 2 1
			                    //  
			 current=pointer;
			 pointer=pointer.next;
			 current.next=previous;
			 previous=current;
			 head=current;
			 display();
			 System.out.println();
			 
		 }
	 }
	 void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data);
			current=current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList r=new ReverseLinkedList();
		r.addNode(3);
		r.addNode(4);
		r.addNode(5);
		r.addNode(6);
		r.addNode(7);
		//r.display();
		r.reverse();
		//r.display();
;		

	}

}
