public class Stringp4ToogleString {
    public static void main(String[] args) {

        String str ="Physics";
        for(int i=0;i<str.length();i++){

            boolean flag=true;    //true ->capital
            char ch = str.charAt(i);
            int asci =(int)ch;
            if(ch==' ')continue;

            if(asci >= 97)flag= false;
            if(flag==true){              //capital
                asci +=32;
                char dh = (char)asci;     //a
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
            else{                  //small
                asci -=32;
                char dh = (char)asci;       //A
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
