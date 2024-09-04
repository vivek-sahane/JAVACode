package clgOOps;

public class Test4 {
    Test4(){
        System.out.println("Learn Coding");
    }
    Test4(int a){
         this();
         System.out.println(a);
    }
    public static void main(String[] args) {
        Test4 r = new Test4();
    }
}
