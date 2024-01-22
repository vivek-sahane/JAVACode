public class StudentClass {

    //creaing a new data type
    public static void change(Student s){
        s.name ="Rohan";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vivek" , 15,16.8);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.numberofstudent);

        Student s2 = new Student("Vishal",16,37.69);
        System.out.println(s2.numberofstudent);
    }
}
