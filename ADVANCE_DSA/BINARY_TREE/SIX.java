package DSA2.ADVANCE_DSA.BINARY_TREE;

// balanced binary tree
public class SIX {
    boolean ans = true;

    public int height(TreeNode node) {
        if (node == null)
            return -1;
        int lh = height(node.left);
        int rh = height(node.right);
        if (Math.abs(lh - rh) > 1) {
            ans = false;
        }

        return Math.max(lh, rh) + 1;
    }

    public boolean isTreeBalanced(TreeNode root) {
        height(root); // Call the recursive function
        return ans; // Return the balance status
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
        root.right.right = new TreeNode(30);
        root.right.right = new TreeNode(300);
        root.right.right = new TreeNode(3001);
        root.right.right = new TreeNode(3002);
        root.right.right = new TreeNode(3003);
        root.right.right = new TreeNode(3004);
        root.right.right = new TreeNode(3005);
        // Create an instance of TWO
        SIX obj = new SIX();
        boolean ans = obj.isTreeBalanced(root);
        System.out.println(ans);

    }
}
