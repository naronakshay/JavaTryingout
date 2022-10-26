package workout;
import java.util.*;

class Node{
	Node left,right;
	int value;
	public Node(int value) {
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
class BinaryTree{
	
	
	
	
	 public Node createNewNode(int v) {
		 Node a= new Node(v);
		 return a;
		 
	 }
	
	public Node  insert(Node node, int value) {
		if(node == null)
		{
			return createNewNode(value);
		}
		if(value< node.value)
			node.left=insert(node.left,value);
		else
			node.right=insert(node.right,value);
		return node;
	}
	
	public void print(Node n)
	{
		if(n==null)
			return;
		else
		{
			System.out.println(n.value);
			while(n.left!=null)
			{
				n=n.left;
				System.out.println(n.value);
				
			}
			while(n.right!=null)
			{
				n=n.left;
				System.out.println(n.value);
				
			}
		}
	}
	
	
}





public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the root node");
		int r= sc.nextInt();
		BinaryTree b =new BinaryTree();
		Node root=null;
		root=b.insert(root, r);
		
		while(true) {
			System.out.println("Enter the element");
			int e=sc.nextInt();
			root=b.insert(root, e);
			System.out.println("Do you want to coninue:");
			String s=sc.next();
			if(s.equals("yes"))
				continue;
			else
				break;
			
		}
		
		b.print(root);
		
		
		
		
	}

}
