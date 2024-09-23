package DSA2.ADVANCE_DSA.BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

// Level order traversal
public class FOUR {
    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode rn = queue.remove();
                System.out.print(rn.val + " ");
                if (rn.left != null) {
                    queue.add(rn.left);
                }
                if (rn.right != null) {
                    queue.add(rn.right);
                }
            }

            System.out.println();

        }

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
        FOUR obj = new FOUR();
        obj.levelOrderTraversal(root);

    }
}
