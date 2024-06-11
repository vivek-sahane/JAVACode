package Tree;
import java.util.*;

public class maximumPathSum {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    int max = Integer.MIN_VALUE;

    int helper(Node root){
        if(root==null){
            return 0;
        }
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        max = Math.max( max, root.data+left+right);

        return root.data+Math.max(left,right);
    }

    int findMaxSum(Node root)
    {
        helper(root);
        return max;
    }
}
