package LinkedList;

public class basics1 {

    public static void displayr(Node head){
        if(head==null)return;
        System.out.println(head.data+" ");
        displayr(head.next);
    }
    public static void displayreverse(Node head){
        if(head==null)return;
        displayreverse(head.next);
        System.out.println(head.data+" ");
    }
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
    public static int length (Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;      //Value
        Node next;     //Address of next node
        Node (int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 ->3 ->9 ->8 ->16
        a.next=b;       // 5 ->3   9   8   16
        b.next=c;       // 5 ->3 ->9  8    16
        c.next=d;       // 5 ->3 ->9 ->8   16
        d.next=e;       // 5 ->3 ->9 ->8 ->16
//        System.out.println(a.next);    //LinkedList.basics1$Node@65ab7765
//        System.out.println(a.next.data);  //3
//        System.out.println(b);         //LinkedList.basics1$Node@65ab7765
//        System.out.println(b.next);    //LinkedList.basics1$Node@1b28cdfa
//        System.out.println(b.data);    //3

        System.out.println(length(a));
    }
}
