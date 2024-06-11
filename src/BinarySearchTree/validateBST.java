package BinarySearchTree;
import java.util.*;

public class validateBST {

    // time complexity: O(n)
    // space complexity: O(n) [Stack Space + ArrayList Data Structure]

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // time complexity: O(n)
// space complexity: O(n) [Stack Space + ArrayList Data Structure]
    public class Solution {
        public static ArrayList<Integer> res = new ArrayList<>();

        public static void inOrderTraversal(TreeNode node) {
            // left subtree
            if (node.left != null) {
                inOrderTraversal(node.left);
            }
            // store the result
            res.add(node.val);
            // right subtree
            if (node.right != null) {
                inOrderTraversal(node.right);
            }
        }

        public static boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }

            inOrderTraversal(root);

            int n = res.size();

            // whether the inorder traversal of a tree stored in the list is sorted or not
            for (int i = 0; i < n - 1; i++) {
                if (res.get(i) >= res.get(i + 1)) {
                    return false;
                }
            }

            return true;
        }
    }
}
