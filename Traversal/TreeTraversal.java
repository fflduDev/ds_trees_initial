package Traversal;


import java.util.LinkedList;
import java.util.Queue;

 

public class TreeTraversal implements iTreeTraversal{

	 
	    public void preorder(TreeNode TreeNode) {
	        if (TreeNode == null)
	            return;

	        // Traverse root
	        System.out.print(TreeNode.data + " ");
	        // Traverse left
	        preorder(TreeNode.left);
	        // Traverse right
	        preorder(TreeNode.right);
	    }

	    public void inorder(TreeNode TreeNode) {
	        if (TreeNode == null)
	            return;

	        // Traverse left
	        inorder(TreeNode.left);
	        // Traverse root
	        System.out.print(TreeNode.data + " ");
	        // Traverse right
	        inorder(TreeNode.right);
	    }

	    public void postorder(TreeNode TreeNode) {
	        if (TreeNode == null)
	            return;

	        // Traverse left
	        postorder(TreeNode.left);
	        // Traverse right
	        postorder(TreeNode.right);
	        // Traverse root
	        System.out.print(TreeNode.data + " ");
	    }
	    
	   public void printLevelOrder(TreeNode root) {
	       Queue<TreeNode> queue = new LinkedList<TreeNode>();
	       queue.add(root);
	       while (!queue.isEmpty()) {
	           TreeNode tempNode = queue.poll();
	           System.out.print(tempNode.data + " ");

	           /*add left child to the queue */
	           if (tempNode.left != null) {
	               queue.add(tempNode.left);
	           }

	           /*add right right child to the queue */
	           if (tempNode.right != null) {
	               queue.add(tempNode.right);
	           }
	       }
	   }

	   
	
}
