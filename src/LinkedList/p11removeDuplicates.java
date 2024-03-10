package LinkedList;

public class p11removeDuplicates {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val==temp.next.val)temp.next=temp.next.next;
            if(temp.next==null)return head;
            if(temp.next.val != temp.val)temp=temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ListNode result = deleteDuplicates(a);

        // Printing the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
