package homework.h15;

// https://leetcode.com/problems/invert-binary-tree/

public class T1 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode oldLeft = root.left;
        root.left = root.right;
        root.right = oldLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this(val, null, null);
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}