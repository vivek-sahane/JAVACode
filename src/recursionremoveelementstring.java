public class recursionremoveelementstring {

    static String removeA(String s, int idx){

        //base case
        if(idx==s.length())return"";

        //recursive work
        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);

        //self work
        if(currChar !='a'){
            return currChar + smallAns ;
        }else{
            return smallAns;
        }
    }
    static String removeA2(String s){

        if(s.length()==0)return" ";

        String smallAns = removeA2(s.substring(1));  //abcd   //bcd   //cd   //d
        char currChar = s.charAt(0);

        if(currChar != 'a'){
            return currChar + smallAns ;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {

    }
}
