public class Student {

    String name ;

    int rno;

    double percent;

    final String schoolname = " AVA";

    static int numberofstudent;

    //Default Constructor
    public Student(){

    }

    public Student (String naam , int roll, double per){
        name = naam;
        rno= roll;
        percent =per ;
        numberofstudent++;
    }
    public int getRno(){         //Getting
        return rno;
    }
    public void setRno(int rno){    //Setting
        this.rno = rno;
    }

}
