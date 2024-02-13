package Stacks;

public class p7linkedListImplementation {
    public static class Node{   //user defined data type
         int val;
         Node next;
         Node (int val){
             this.val = val;
         }
     }
     public static class LLStack{   //user defined data structure
        private Node head = null;
        private int size = 0;

        void push(int x){
           Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head=head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        void displayrec(Node h){
            if(h==null)return ;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0)return true;
            return false;
        }
     }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        st.display();
    }
}
