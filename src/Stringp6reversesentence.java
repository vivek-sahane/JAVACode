public class Stringp6reversesentence {
    public static void main(String[] args){
        String str ="I am online educator";
        String ans =" ";
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            if(ch!=' '){                //Do opertion first for onr word
                sb.append(ch);
            }
            else{
                 sb.reverse();
                 ans +=sb;
                 ans +=" ";
                 sb =new StringBuilder(" ");   //empty stringbuider
            }
        }
        sb.reverse();
        ans +=sb;                   //for last word beacause thier is no space
        System.out.println(ans);
    }
}
