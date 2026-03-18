package Traversal;

public class driver {
	
	 public static void main(String args[])
     
	    {
	        TreeNode root = new TreeNode(0);
	        root.left = new TreeNode(1);
	        root.right = new TreeNode(2);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	      
	        
	        TreeTraversal traversaler = new TreeTraversal();
	        
	        System.out.println("Inorder traversal");
	        traversaler.inorder(root);

	        System.out.println("\nPreorder traversal ");
	        traversaler.preorder(root);

	        System.out.println("\nPostorder traversal");
	        traversaler.postorder(root);

	        System.out.println("\nLevelorder traversal");
	        traversaler.printLevelOrder(root);
	        
	        
	        
	       /*				0
	        * 			|       |
	        *         1            2
	        * 		|   |    
			*     3      4
	        */

	        
	        /*
			        Inorder traversal
			        3 1 4 0 2 
			        Preorder traversal 
			        0 1 3 4 2 
			        Postorder traversal
			        3 4 1 2 0 
			        Levelorder traversal
			        0 1 2 3 4 
	        */
	        
	    }


}
