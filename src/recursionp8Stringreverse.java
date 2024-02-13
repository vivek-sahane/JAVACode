public class recursionp8Stringreverse {

    static String reverse(String s, int idx){
        //base case
        if(idx==s.length())return " ";
        //recursive work
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        String s = "vivek";
        System.out.println(reverse(s,0));
    }
}
