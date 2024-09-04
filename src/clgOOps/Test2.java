package clgOOps;
import java.util.*;

class A2{
    void show(){
        System.out.println("Hello World");
    }
}

class B2 {
    A2 r = new A2();

    void show(){
        r.show();
            System.out.println("Hello learner");
    }

}

public class Test2 {
    public static void main(String[] args) {
        B2 r = new B2();
        r.show();
    }
}
