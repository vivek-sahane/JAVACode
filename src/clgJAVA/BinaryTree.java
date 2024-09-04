package clgJAVA;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Binary {
    Node root;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            whereToInsert(root, newNode);
        }
    }

    private void whereToInsert(Node currNode, Node newNode) {
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("Element "+currNode.data+" Where you want to insert 1.Left 2.Right");
            int b = sc.nextInt();
            if (b == 1) {
                if (currNode.left == null) {
                    currNode.left = newNode;
                    break;
                }
                currNode = currNode.left;
            } else if (b == 2) {
                if (currNode.right == null) {
                    currNode.right = newNode;
                    break;
                }
                currNode = currNode.right;
            } else {
                System.out.println("Enter a valid choice:");
            }
            System.out.println("Do you want to continue 1.Yes , 0.No");
            c = sc.nextInt();
        } while (c != 0);
    }

    public void display() {
        System.out.println("Inorder Traversal");
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(" "+root.data);
        inOrder(root.right);
    }

    public int cntNode(Node root){
        if(root==null){
            return 0;
        }
        else{
            int cnt=1;
            cnt += cntNode(root.left);
            cnt += cntNode(root.right);
            return cnt;
        }
    }

    public void printLeaves(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(root.data);
            return;
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }


    public int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        int max=Math.max(maxHeight(root.left),maxHeight(root.right));
        return max+1;
    }

    static int max=0;
    public int maxDiameter(Node root){
        if(root==null){
            return 0;
        }
        int left = maxDiameter(root.left);
        int right = maxDiameter(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }

    public int cntLeaves(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        else{
            return cntLeaves(root.left) + cntLeaves(root.right);
        }
    }

    public void levelOrder(Node root){

    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary b = new Binary();
        int again;
        do {
            System.out.println("Enter the operation you want to perform: 1.Insertion , 2.Display , 3.countNode , 4.Print Leaves , 5.maxHeight , 6.maxDiameter , 7.Count Leaves ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert");
                    int a = sc.nextInt();
                    b.insert(a);
                    break;

                case 2:
                    System.out.println("Here's the display elements");
                    b.display();
                    break;

                case 3:
                    System.out.println("Count the number of Nodes "+b.cntNode(b.root));
                    break;

                case 4:
                    System.out.println("Leaves of Tress :");
                    b.printLeaves(b.root);
                    break;

                case 5:
                    System.out.println("Maximum height of BT :"+b.maxHeight(b.root));
                    break;

                case 6:
                    System.out.println("Maximum Diameter of BT :"+b.maxDiameter(b.root));
                    break;

                case 7:
                    System.out.println("Count of leaves :"+b.cntLeaves(b.root));
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Do you want to continue 1.Yes , 0.No");
            again = sc.nextInt();
        } while (again == 1);
    }
}
