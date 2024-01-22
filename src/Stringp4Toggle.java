import java.util.*;
public class Stringp4Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //Toggle
        //PHysiCs -> phYSIcS
        for(int i=0;i<str.length();i++){

            boolean flag=true;    //true ->capital
            char ch = str.charAt(i);
            int asci =(int)ch;
            if(ch==' ')continue;

            if(asci >= 97)flag= false;
            if(flag==true){              //capital
                asci +=32;
                char dh = (char)asci;     //a
                str.setCharAt(i,dh);
            }
            else{                  //small
                asci -=32;
                char dh = (char)asci;       //A
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
