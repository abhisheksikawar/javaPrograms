
public class PrintElementsOfLinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
		static Node head=null;
		static Node tail=null;
		
		 static void addNode(int data){
			Node newNode=new Node(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			
		}
		 public static void display() {
			 int mid=5;
			 int count=0;
			 Node current=head;
			 Node middle=null;
			 while(current!=null) {
				 if(count==mid) {
					middle=current; 
				 }
				 count++;
				 current=current.next;
			 }
			 int x=0;
			 current=head;
			 while(x<5) {
				 System.out.print(current.data);
				 System.out.print(middle.data);
				 System.out.println();
				 current=current.next;
				 middle=middle.next;
				 x++;
			 }
		 }
		 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNode(2);
		addNode(9);
		addNode(7);
		addNode(5);
		addNode(3);
		
		addNode(2);
		addNode(9);
		addNode(7);
		addNode(5);
		addNode(3);
		display();


	}

}
