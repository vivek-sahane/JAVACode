package LinkedList;
import java.util.*;

public class p10separateEvenOdd {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;
        int index = 1;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            if (index % 2 == 0) {
                odd.next = newNode;
                odd = odd.next;
            } else {
                even.next = newNode;
                even = even.next;
            }
            head = head.next;
            index++;
        }
        odd.next = evenHead.next;
        return oddHead.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ListNode result = oddEvenList(a);

        // Printing the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
