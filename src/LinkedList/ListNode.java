//package LinkedList;
//
//public class ListNode {
//
//
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {     //P4
//        ListNode tempA = headA;
//        ListNode tempB = headB;
//        int lengthA=0;
//        while(tempA !=null){
//            lengthA++;
//            tempA=tempA.next;
//        }
//        int lengthB = 0;
//        while(tempB != null){
//            lengthB++;
//            tempB=tempB.next;
//        }
//        tempA=headA;
//        tempB=headB;
//
//        if(lengthA > lengthB){
//            int steps = lengthA-lengthB;
//            for(int i=1;i<=steps;i++){
//                tempA=tempA.next;
//            }
//        }else{
//            int steps = lengthB-lengthA;
//            for(int i=1;i<=steps;i++){
//                tempB = tempB.next;
//            }
//        }
//        while(tempA != tempB){
//            tempA =tempA.next;
//            tempB = tempB.next;
//        }
//        return tempA;
//    }
//
//        public ListNode middleNode(ListNode head) {         //P5 Middle of linkedlist
//            ListNode slow = head;
//            ListNode fast = head;
//            while(fast!=null && fast.next!=null){
//                slow = slow.next;
//                fast=fast.next.next;
//            }
//            return slow;
//        }
//
//    public ListNode deleteMiddle(ListNode head) {            //P6 delete middle ele
//        if(head.next==null)return null;
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast.next.next!=null && fast.next.next.next!=null){
//            slow = slow.next;
//            fast=fast.next.next;
//        }
//        slow.next = slow.next.next;
//        return head;
//    }
//    public boolean hasCycle(ListNode head) {                  //P7 HasCycle or not return true or false
//        if(head ==null)return false;
//        if(head.next ==null)return false;
//        ListNode slow =head;
//        ListNode fast =head;
//        while(fast !=null){
//            if(slow==null)return false;
//            slow=slow.next;
//            if(fast.next==null)return false;
//            fast=fast.next.next;
//            if(fast==slow)return true;
//        }
//        return false;
//    }
//    public ListNode detectCycle(ListNode head) {                //P-8 hascycle2 return the start of cycle
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // Detect the cycle using Floyd's Tortoise and Hare algorithm
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if (fast == slow) {
//                // Cycle detected, move one pointer to the head and find the start of the cycle
//                ListNode temp = head;
//                while (temp != slow) {
//                    temp = temp.next;
//                    slow = slow.next;
//                }
//                return temp;  // Return the start of the cycle
//            }
//        }
//
//        return null;  // No cycle found
//    }
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {       // P9 mearge Two sorted list using merge sort
//                                                                          //USING EXTRA SPACE
//        ListNode temp1 = list1;
//        ListNode temp2 = list2;
//        ListNode head = new ListNode(100);
//        ListNode temp =head;
//        while(temp1 !=null &&temp2 !=null){
//            if(temp1.val <= temp2.val){
//                ListNode a = new ListNode(temp1.val);
//                temp.next= a;
//                temp = a;
//                temp1 = temp1.next;
//            }else{
//                ListNode a = new ListNode(temp2.val);
//                temp.next= a;    //put a value in next
//                temp = a;        //make temp = a
//                temp2 = temp2.next;   //update temp position
//            }
//        }
//
//        if(temp1==null){
//            temp.next = temp2;
//        }
//        else{
//            temp.next = temp1;
//        }
//        return head.next;
//    }
//    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {     //M2 merge sort not using extra space
//        ListNode t1 = list1;
//        ListNode t2 =list2;
//        ListNode h = new ListNode(4);
//        ListNode t = h;
//        while(t1!=null && t2 != null){
//            if(t1.val<t2.val){
//                t.next = t1;
//                t=t1;
//                t1=t1.next;
//            }
//            else{
//                t.next =t2;
//                t=t2;
//                t2=t2.next;
//            }
//        }
//        if(t1 == null){
//            t.next=t2;
//        }
//        else{
//            t.next=t1;
//        }
//        return h.next;
//    }
//    public ListNode oddEvenList(ListNode head) {          //P10 Return oddeven list
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode oddHead = new ListNode(0);
//        ListNode evenHead = new ListNode(0);
//        ListNode odd = oddHead;
//        ListNode even = evenHead;
//
//        int index = 1;
//
//        while (head != null) {
//            ListNode newNode = new ListNode(head.val);
//
//            if (index % 2 == 1) {
//                odd.next = newNode;
//                odd = odd.next;
//            } else {
//                even.next = newNode;
//                even = even.next;
//            }
//
//            head = head.next;
//            index++;
//        }
//
//        odd.next = evenHead.next;
//
//        return oddHead.next;
//    }
//    public ListNode deleteDuplicates(ListNode head) {        //P11 Remove Duplicates
//        ListNode temp = head;
//        while(temp!=null && temp.next!=null){
//            if(temp.next.val==temp.val){
//                temp.next =temp.next.next;
//            }
//            if(temp.next==null)return head;
//            if(temp.next.val != temp.val){
//                temp=temp.next;
//            }
//        }
//        return head;
//    }
//    public ListNode deleteDuplicates(ListNode head) {          //P11 Remove Duplicates medium level
//        if (head == null || head.next == null)
//            return head;
//
//        ListNode newHead = null;
//        ListNode tail = null;
//        int data = Integer.MIN_VALUE;
//        ListNode temp = head;
//
//        while (temp != null) {
//            if (temp.next != null && temp.val == temp.next.val) {
//                data = temp.val;
//                temp = temp.next;
//                continue;
//            }
//
//            if (temp.val != data) {
//                if (newHead == null) {
//                    newHead = temp;
//                    tail = temp;
//                } else {
//                    tail.next = temp;
//                    tail = temp;
//                }
//            }
//
//            temp = temp.next;
//        }
//
//        if (tail != null) {
//            tail.next = null;
//        }
//
//        return newHead;
//    }
//    public ListNode reverseList(ListNode head) {            //Leetcode que
//        ListNode prev = null;
//        ListNode current = head;
//        ListNode next = null;
//
//        while (current != null) {
//            next = current.next; // Save the next node
//            current.next = prev; // Reverse the link
//            prev = current;      // Move one step forward in the reversed list
//            current = next;      // Move one step forward in the original list
//        }
//
//        return prev; // 'prev' is now the new head of the reversed list
//    }
//
//    public ListNode reverseList(ListNode head) {        //reverse the list by recursive method
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next=null;
//        return newHead ;
//    }
//    public boolean isPalindrome(ListNode head) {                            //P13 isPalindrome LinkedList
//        //step1->find mid, step->2 reverse above mid, step3->compare
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast.next != null && fast.next.next!=null){
//            slow =slow.next;
//            fast = fast.next.next;
//        }
//        ListNode temp = reverse(slow.next);
//        slow.next = temp;
//        ListNode p1 = head;
//        ListNode p2 = slow.next;
//        while(p2!=null){
//            if(p1.val != p2.val)return false;
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//        return true;
//    }
//    public int pairSum(ListNode head) {       //max Twin pairsum linkedlist  P14
//        ListNode fast=head;
//        ListNode slow = head;
//        while(fast.next.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        slow.next = reverse(slow.next);
//        int sumMax = 0;
//        ListNode head1 = head;
//        ListNode head2 = slow.next;
//        while(head2!=null){
//            int sum = head1.val+ head2.val;
//            if(sum>sumMax){
//                sumMax=sum;
//            }
//            head1 = head1.next;
//            head2 = head2.next;
//        }
//        return sumMax;
//    }
//
//}
