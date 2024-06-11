package Tree;
import java.util.*;

public class diameterOfTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class Solution {
        static int max = 0;

        public static int height(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            max = Math.max(max, left + right);
            return 1 + Math.max(left, right);
        }

        public static int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return max;
        }
    }

}
