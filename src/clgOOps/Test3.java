package clgOOps;

public class Test3 {
    //Access controls or access modifier
    void show(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Test3 r = new Test3();
        System.out.println(r);
        r.show();
    }
}
