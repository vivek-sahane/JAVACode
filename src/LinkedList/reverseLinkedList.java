package LinkedList;
import java.util.*;
public class reverseLinkedList {
    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    Node reverseList(Node head) {
            Node prev = null;
            Node next = null;
            Node curr = head;

            while(curr!=null){
                next = curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
    }
    public static void main(String[] args) {

    }
}
