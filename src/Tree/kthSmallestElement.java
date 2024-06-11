package Tree;
import java.util.*;

public class kthSmallestElement {

    // Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        // Function to perform in-order traversal
        public ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> result){
            if (root == null) {
                return result;
            }

            // 1. Traverse towards the left side of the node
            inOrderTraversal(root.left, result);
            // 2. Store the node value in the result array
            result.add(root.val);
            // 3. Traverse towards the right side of the node
            inOrderTraversal(root.right, result);
            return result;
        }

        // Function to find the kth smallest element in the BST
        public int kthSmallest(TreeNode root, int k) {
            // Perform in-order traversal and store the result
            ArrayList<Integer> result = inOrderTraversal(root, new ArrayList<>());
            // Return the kth smallest element (1-based index)
            return result.get(k - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        kthSmallestElement instance = new kthSmallestElement();
        Solution solution = instance.new Solution();
        TreeNode root = instance.new TreeNode(3);
        root.left = instance.new TreeNode(1);
        root.right = instance.new TreeNode(4);
        root.left.right = instance.new TreeNode(2);

        int k = 1;
        System.out.println("The " + k + "th smallest element is: " + solution.kthSmallest(root, k));
    }
}
