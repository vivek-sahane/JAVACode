package LinkedList;

public class FlattenadoublelevelmultiLL {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    public Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;      //store values
            Node c = null;  // Declare 'c' outside the if block

            if (temp.child != null) {
                c = flatten(temp.child);    //recursion
                temp.next = c;
                c.prev = temp;
            }

            // Move 'c ko aage le jao' inside the if block
            while (c != null && c.next != null) {
                c = c.next;
            }

            if (c != null) {
                c.next = t;
                if (t != null) {
                    t.prev = c;
                }
            }

            temp.child = null;   //vimp
            temp = t;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
