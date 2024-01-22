public class OOPSApnaclg {

    public static void main(String[] args) {
        Pen p1 = new Pen();   //constructor created a pen object called p1
         p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        p1.color ="Yellow";
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username="Viveksahane";
        myAcc.setPassword("abcd");

    }
}

class BankAccount{
    public String username ;
    private String password;
     pulic void setPassword(String pwd){
         password = pwd;
    }

}
class Pen{

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
class Studentt {
    String name ;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math ){
        percentage = (phy+chem+math)/3;
    }
}
