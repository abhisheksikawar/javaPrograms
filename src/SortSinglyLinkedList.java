
public class SortSinglyLinkedList {
	
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
		 
		 static void sort() {
			 Node current=head,index=null;
			 int temp=0;
			 if(head==null) {
				 return ;
			 }else {
				 while(current!=null) {
					 index=current.next;
					 while(index!=null) {
						 if(current.data>index.data) {
							 temp=current.data;
							 current.data=index.data;
							 index.data=temp;
							 
						 }
						 index=index.next;
					 }
					 current=current.next;
				 }
			 }
		 }
		static void display() {
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SortSinglyLinkedList sll=new SortSinglyLinkedList();
		addNode(2);
		addNode(9);
		addNode(7);
		addNode(5);
		addNode(3);
		sort();
		display();

	}

	

	

}
