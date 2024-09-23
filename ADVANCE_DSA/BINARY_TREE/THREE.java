package DSA2.ADVANCE_DSA.BINARY_TREE;

public class THREE {
    private int totalSum = 0;
    private boolean isFound = false;

    public boolean checkEqualSumTree(TreeNode root) {
        if (root == null)
            return false;

        totalSum = sumOfTree(root);
        // If the total sum is odd, we can't split it into two equal parts
        if (totalSum % 2 == 1) {
            return false;
        }

        // Check if there is a subtree with sum equal to half of the total sum
        findSubTreeWithSum(root, totalSum / 2);
        return isFound;
    }

    public int sumOfTree(TreeNode node) {
        if (node == null)
            return 0;

        return node.val + sumOfTree(node.left) + sumOfTree(node.right);
    }

    public int findSubTreeWithSum(TreeNode node, int targetSum) {
        if (node == null)
            return 0;

        // Calculate the sum of the current subtree
        int currentSum = node.val + findSubTreeWithSum(node.left, targetSum)
                + findSubTreeWithSum(node.right, targetSum);
        if (currentSum == targetSum) {
            isFound = true;
        }

        return currentSum;
    }

    public static void main(String[] args) {
        // construct the binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.left.left = new TreeNode(8);
        root.right.right = new TreeNode(3);
        // Create an instance of TWO
        THREE obj = new THREE();
        boolean result = obj.checkEqualSumTree(root);
        System.out.println(result);

    }
}
