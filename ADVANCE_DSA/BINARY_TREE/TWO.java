package DSA2.ADVANCE_DSA.BINARY_TREE;

import java.util.*;

// Iterative in order traversal 
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TWO {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;

        }

        return result;

    }

    public static void main(String[] args) {
        // construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Create an instance of TWO
        TWO obj = new TWO();

        // Call the inOrderTraversal method
        List<Integer> result = obj.inOrderTraversal(root);

        // Print the result
        System.out.println("In-order Traversal: " + result);
    }

}
