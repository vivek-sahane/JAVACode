package clgOOps;

import java.util.*;

interface Animal{
    void eat();
    void shout();
}

public class Interface implements Animal{
    public void eat(){
        System.out.println("Dog is eating.");
    }
    public void shout(){
        System.out.println("Dog is sleeping");
    }
    public static void main(String[] args) {
        Animal a = new Interface();
        a.eat();
        a.shout();
    }
}
