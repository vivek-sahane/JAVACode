package Tree;
import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class levelOrderTraversalBFS {
    public static ArrayList <Integer> levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node x=q.remove();
            if(x.left!=null){
                q.add(x.left);
            }
            if(x.right!=null){
                q.add(x.right);
            }
            ans.add(x.data);
        }
        return ans;
    }
}
