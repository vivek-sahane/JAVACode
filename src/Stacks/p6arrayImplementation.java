package Stacks;
import java.util.*;
public class p6arrayImplementation {
    public static class Stack{
     private int[]arr = new int[5];
     private int idx=0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        int size(){
            return idx;
        }

        void display(){
            for(int i=0;i<=idx-1 ;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(idx==0)return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length)return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
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
        System.out.println(st.isFull());
        st.push(100);
        st.display();
    }
}
