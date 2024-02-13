public class recursionp7StringremovealloccurenceofA {

    static String removeA(String s,int idx){
        //base case
        if(idx==s.length())return" ";
        //recursive work
        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);
        //self work
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {

    }
}
