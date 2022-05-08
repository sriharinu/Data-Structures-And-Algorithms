package trees.traversal;


class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data=data;
		this.left=this.right=null;
	}
}
public class TreeTraversal {
	
	Node root;
	
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	void preOrder(Node root)
	{
		if(root==null)
			return;
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	void postOrder(Node root)
	{
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+" ");
	}
	
}
