package LinkedList;

public class nthNodeFromEnd {

    public static Node nthNode(Node head,int n){          //P1 M1
        int size =0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m = size-n+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head,int n){            //P1M2
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow ;
    }
    public static Node deleteNthFromEnd(Node head , int n){           //P2 M1
        Node slow =head;
        Node fast = head;
        for(int i=1;i<=n;i++){
              fast=fast.next;
        }
        if(fast == null){
            head = head.next;
            return head ;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void diaplay (Node head ){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(13);
        // 100 ->13 ->4 ->5 ->12
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

//        Node q = nthNode2(a,2);
//        System.out.println(q.data);
        diaplay(a);
        a= deleteNthFromEnd(a,6);
        System.out.println();
        diaplay(a);
    }
}
