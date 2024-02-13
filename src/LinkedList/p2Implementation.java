package LinkedList;

public class p2Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{         //Make linkedlist class
        Node head= null;
        Node tail= null;
        void insertAtEnd(int val){           //Function for insert val at end
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        public static void insertAtEnd(Node head, int val){
            Node temp = new Node(val);
            Node t= head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
        }
        void deleteAt(int idx){                    //Function for delete val
            Node temp = head;
            if(idx==0)head = head.next;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            tail = temp;
            // size--;
        }
        void insertAtHead(int val){                  //Function for insert val at head
            Node temp = new Node(val);
             if(head==null){
               head=temp;
               tail=temp;
            }
             else{
                 temp.next=head;
                 head=temp;
             }
        }
        void insertAt(int idx,int val){                 //Function for insert val at any idx
            Node t = new Node(val);
            Node temp = head;
            for(int i=1;i<idx-1;i++){
                temp =temp.next;
            }
            if(idx==size()){
                insertAtEnd(val);
                return ;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display(){                 //Parameter nhi dunga beacause it is data structure upar diye hue hein
            Node temp = head;
            while(temp !=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){                       //jrurt nhi he O(n) time complexity he function me hi built kro
            Node temp=head;
            int count =0;
            while(temp != null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(2);
        ll.display();
        System.out.println(ll.size());
        ll.insertAt(2,10);
        ll.display();


    }
}
