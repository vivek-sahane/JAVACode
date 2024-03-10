package LinkedList;
import java.util.*;

public class p8cycleDetection2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                // Cycle detected, move pointer to find the start of the cycle
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp; // Return the start of the cycle
            }
        }
        return null; // No cycle found
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
        // Creating a cycle by connecting the last node to the third node
        f.next = c;

        ListNode startOfCycle = detectCycle(a);

        if (startOfCycle != null) {
            System.out.println("Cycle detected. Start of the cycle: " + startOfCycle.val);
        } else {
            System.out.println("No cycle found.");
        }
    }
}
