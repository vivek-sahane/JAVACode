package LinkedList;

public class p9mergeTwoSortedLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {   //M1 using extra space
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return head.next;
    }

    public static ListNode mergeTwoList2(ListNode list1,ListNode list2){   //M2 without using extra space
        ListNode t1=list1;
        ListNode t2 = list2;
        ListNode h=new ListNode(100);
        ListNode t=h;
        while(t1 !=null && t2 !=null){
            if(t1.val <=t2.val){
              t.next=t1;
              t=t1;
              t1=t1.next;
            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
            if(t1==null)t=t2.next;
            else t=t1.next;
        }
        return h.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);

        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;

        ListNode mergedList = mergeTwoLists(a, d);
        // Printing the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
