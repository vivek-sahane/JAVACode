package clgJAVA;
import java.util.*;

class HuffmanNode{
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x,HuffmanNode y){
        return x.data-y.data ;
    }
}


public class Huffman {

    public static void printCode(HuffmanNode root, String s){

        if(root.left ==null && root.right==null && Character.isLetter(root.c)){
            System.out.println(root+":"+s);
            return;
        }
        printCode(root.left,s+"0");
        printCode(root.right,s+"1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both arrays");
        int n= sc.nextInt();
        int[]arr = new int[n];
        char[]vrr = new char[n];

        System.out.println("Enter the input for integer array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the input for character array");
        for(int i=0;i<n;i++){
            vrr[i] = sc.next().charAt(0);
        }



        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        //insert values and characters in minHeap
        for(int i=0; i<n; i++){
           //it is a node from class HuffmanNode who has int and char values to store
            HuffmanNode h = new HuffmanNode();

            h.c= vrr[i];
            h.data = arr[i];
            h.left=null;
            h.right=null;
            q.add(h);
        }

        HuffmanNode root=null;

        while(q.size()>1){

            //extract min element
            HuffmanNode x=q.poll();
            HuffmanNode y=q.poll();

            //new node f which is equal to the sun of the freqency of the two node assigning the value of f
            HuffmanNode s =new HuffmanNode();
            s.data = x.data + y.data;
            s.c = '-';

            s.left =x;
            s.right =y;
            root=s;
            q.add(s);   //add again this value into q
        }
        String s="";
        printCode(root,s);   //print the code by traversing the tree
    }
}
