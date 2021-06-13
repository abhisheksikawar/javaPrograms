
public class InsertElementsBinaryTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	static Node root;
	static Node temp=root;
	
//	static void inOrder(Node temp) {
//		
//		inOrder(temp.left);
//		System.out.println(temp.data);
//		inOrder(temp.Right);
//	}
	static void insert(int data) {
		Node newNode=new Node(data);
		if(root==null) {
			root=newNode;
		}else {
			Node current=root;
			Node parent;
			while(true) {
				parent=current;
				if(data<current.data) {
					current=current.left;
				
				if(current==null) {
					parent.left=newNode;
					return;
				}
				}else {
					current=current.right;
					if(current==null) {
						parent.right=newNode;
						return;
					}
					
				}
				
			}
		}
		
	}

    public void inorderTraversal(Node node) {  
    	  
        //Check whether tree is empty  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
         }  
        else {  

            if(node.left!= null)  
                inorderTraversal(node.left);  
            System.out.print(node.data + " ");  
            if(node.right!= null)  
                inorderTraversal(node.right);  

        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertElementsBinaryTree bt=new InsertElementsBinaryTree();
		bt.insert(2);
		bt.insert(5);
		bt.insert(6);
		bt.insert(4);
		bt.insert(3);
		bt.inorderTraversal(bt.root);
		

	}

}
