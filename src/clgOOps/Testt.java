package clgOOps;
//Overriding
class Bank {
    int get(){
        return 0;
    }
}
class ICIC extends Bank{
    int get(){
        return 7;
    }
}

class AXIS extends Bank{
    int  get(){
        return 8;
    }
}

public  class Testt{
    public static void main(String[] args) {
        AXIS a = new AXIS();
        ICIC i =new ICIC();
        System.out.println(a.get());
        System.out.println(i.get());
    }
}
