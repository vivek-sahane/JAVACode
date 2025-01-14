package clgOOps;

class Parent {
    void show(){
        System.out.println("Parent show");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child show");
    }
    void display(){
        show();
        super.show();
    }
}
public class Superr {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
