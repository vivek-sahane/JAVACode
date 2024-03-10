package Queue;
import java.util.*;
public class linekdListImplementationInQueue {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head= null;
        Node tail = null;
        int size=0;

        //add
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        //peek
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        //remove
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
                int x=head.val;
                head=head.next;
                size--;
                return x;
        }

        //display
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }

        //isEmpty
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.display();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        System.out.println(q1.isEmpty());
        q1.add(3);
        q1.add(7);
        q1.add(8);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
    }
}
