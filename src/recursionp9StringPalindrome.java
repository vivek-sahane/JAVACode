import java.util.Scanner;

public class recursionp9StringPalindrome {
    static String reverse(String s, int idx){
        //base case
        if(idx==s.length())return " ";
        //recursive work
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String rev = reverse(s,0);
        if(rev.equals(s)){
            System.out.println("isPalindrome");
        }
        else{
            System.out.println("notPalindrome");
        }
    }
}
