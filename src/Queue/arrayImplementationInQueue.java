package Queue;
import java.util.*;
public class arrayImplementationInQueue {

    public static class queueA{
        private int f=-1;
        private int r=-1;
        int size=0;
        private int[]arr=new int[5];

        //add function using array
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){      //queue is currently empty
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }

        //function for remove element
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;             // f ko aage badhao
            size--;
            return arr[f-1];
        }

        //function for peek
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        //function for isEmpty
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }

        //display
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
