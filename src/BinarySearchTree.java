import java.util.*;

class Node {
    int val;
    Node right, left;

    public Node(int val) {  //constructor
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Binary {
    Node root;

    public void insert(int val) {
        root = insertAt(root, val);
    }

    private Node insertAt(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertAt(root.left, val);
        }
        else if (val > root.val) {
            root.right = insertAt(root.right, val);
        }

        return root;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(" " + root.val);
            inOrder(root.right);
        }
    }

    public void smallestEle(Node root){
        if(root.left==null){
            System.out.println(root.val);
            return;
        }
        smallestEle(root.left);
        return;
    }

    public int largestEle(Node root) {
        // Traverse to the rightmost node to find the largest element
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public Node delete(Node root, int a) {
        if (root == null) {
            return root;
        }
        if (root.val < a) {
            root.right = delete(root.right, a);
        } else if (root.val > a) {
            root.left = delete(root.left, a);
        } else {
            // Node with one or no children
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the largest element from the left subtree
            root.val = largestEle(root.left);

            // Delete the largest element from the left subtree
            root.left = delete(root.left, root.val);
        }
        return root;
    }




    public boolean search(Node root, int a) {
        if (root == null) {
            return false;
        }
        if (root.val == a) {
            return true;
        }
        if (root.val < a) {
            return search(root.right, a);
        } else {
            return  search(root.left, a);
        }
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary b = new Binary();
        int again;
        do {
            System.out.println("Enter the operation you want to perform: 1.Insertion , 2.Display ,3.smallestElement ,4.largest Element , 5.searchEle , 6.delete element ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert: ");
                    int val = sc.nextInt();
                    b.insert(val);
                    break;

                case 2:
                    System.out.println("Here's the display of elements:");
                    b.inOrder(b.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Smallest element in BST :");
                    b.smallestEle(b.root);
                    break;

                case 4:
                    System.out.println("Largest element in BST :");
                    b.largestEle(b.root);
                    break;

                case 5:
                    System.out.println("Enter the element you want to search :");
                    int a=sc.nextInt();
                    if(b.search(b.root,a)){
                        System.out.println("Element is Present");
                    }
                    else{
                        System.out.println("Element is not present");
                    }

                case 6:
                    System.out.println("Enter the element you want to delete :");
                    int c=sc.nextInt();
                    b.delete(b.root,c);

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Do you want to perform another operation? 1.Yes , 0.No : ");
            again = sc.nextInt();
        } while (again != 0);

    }
}
