package String;

public class removeDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str1.indexOf(ch+"")==-1){
                str1.append(ch);
            }
        }
        return str1+"";
    }

    public static void main(String[] args) {
        String str="VivekSahane";
        System.out.println(removeDuplicates(str));
    }
}
