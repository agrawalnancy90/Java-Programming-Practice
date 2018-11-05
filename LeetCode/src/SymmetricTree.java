import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;

/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

public class SymmetricTree {
	
	public static SymmetricTree st = new SymmetricTree();
	
	public static void main(String[] args) {
		
		TreeNode root = createBinaryTreeFromArray(new Integer[] {1,2,2,4,3,4,3}, null, 0);
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		//printLevelOrder(queue);
		System.out.println(isSymmetric(root));
	}
	
	
	public static boolean isSymmetric(TreeNode root) {
		return compare(root, root);
	}
	
	public static boolean compare(TreeNode lnode, TreeNode rnode) {
		int count = 0;
		if(lnode == null)
			++count;
		if(rnode == null)
			++count;
		if(count == 1)
			return false;
		if(count == 2)
			return true;
		
		return (lnode.val == rnode.val && compare(lnode.left, rnode.right) 
                && compare(lnode.right, rnode.left));
	}
	

	public static List<Integer> getValuesInBFS(TreeNode root){
        List<Integer> valuesBFS = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        recursiveBFS(valuesBFS, queue);
        return valuesBFS;
        
	}
	
	public static void recursiveBFS(List<Integer> values, Queue<TreeNode> queue) {
		if(queue.isEmpty())
			return;
		TreeNode node = queue.poll();
		values.add(node.val);
		
		
		if(node.left != null)
			queue.offer(node.left);
		if(node.right != null)
			queue.offer(node.right);
		recursiveBFS(values, queue);
	}
	
	
	public static boolean isPalindrome(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<(arr.length)/2; i++) {
			stack.push(arr[i]);
		}
		
		int i;
		if(arr.length % 2 == 0) {
			i = (arr.length)/2;
		} else {
			i = (arr.length)/2 + 1;
		}
		
		for(; i<arr.length; i++) {
			if(stack.pop() != arr[i])
				return false;
		}
		
		return true;
		
	}
	
	/**
	 * Create binary tree from array in level order
	 * @param values
	 * @param root
	 * @param index
	 * @return
	 */
	public static TreeNode createBinaryTreeFromArray(Integer[] values, TreeNode root, int index) {
		
		if(index < values.length) {
			TreeNode node = getNewNode(values[index]);
			root = node;
			
			root.left = createBinaryTreeFromArray(values, root.left, (2*index + 1));
			root.right = createBinaryTreeFromArray(values, root.right, (2*index + 2));
		}
		return root;
	}
	
	/**
	 * Print binary tree in level order
	 * @param values
	 * @param root
	 * @param index
	 * @return
	 */
	public static void printLevelOrder(Queue<TreeNode> queue) {
		
		if(queue.isEmpty())
			return;
		
		TreeNode node = queue.poll();
		System.out.print(node.val + " ");
		if(node.left != null)
			queue.offer(node.left);
		if(node.right != null)
			queue.offer(node.right);
		printLevelOrder(queue);
	}
	
	
	
	public static TreeNode getNewNode(int value) {
		TreeNode node = st.new TreeNode(value);
		node.left = null;
		node.right = null;
		return node;
	}
	
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	

}


