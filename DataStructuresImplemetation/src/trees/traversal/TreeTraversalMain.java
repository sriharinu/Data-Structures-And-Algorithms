package trees.traversal;

public class TreeTraversalMain {

	public static void main(String[] args) {
		
		TreeTraversal tree = new TreeTraversal();
		
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		
		System.out.println("=====IOrder======");
		
		tree.inOrder(tree.root);
		
		System.out.println("=====PreOrder======");
		
		tree.preOrder(tree.root);
		
        System.out.println("=====PostOrder======");
		
		tree.postOrder(tree.root);

	}

}
