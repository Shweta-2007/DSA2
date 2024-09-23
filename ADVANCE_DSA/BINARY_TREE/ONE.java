package DSA2.ADVANCE_DSA.BINARY_TREE;

//Given root of a binary tree, return true if the tree can be split into two non empty subarrays with equal sums, or false otherwise
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ONE {
    private boolean found = false;
    private int totalSum = 0;

    public boolean checkEqualSumTree(TreeNode root) {
        if (root == null)
            return false;

        totalSum = calculateSum(root);
        if (totalSum % 2 == 1)
            return false;

        checkSubTreeSum(root, true);

        return found;
    }

    public int calculateSum(TreeNode node) {
        if (node == null)
            return 0;
        return node.val + calculateSum(node.left) + calculateSum(node.right);
    }

    public int checkSubTreeSum(TreeNode node, boolean isRoot) {
        if (node == null)
            return 0;
        int leftSum = checkSubTreeSum(node.left, false);
        int rightSum = checkSubTreeSum(node.right, false);
        int subTreeSum = node.val + leftSum + rightSum;
        if (subTreeSum * 2 == totalSum && !isRoot) {
            found = true;
        }

        return subTreeSum;

    }

}