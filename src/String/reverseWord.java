package String;

public class reverseWord {
    String reverseWords(String S)
    {
        // code here
        String str[] = S.split("\\.");
        StringBuilder sb = new StringBuilder();

        for(int i = str.length-1;i>0;i--){
            sb.append(str[i]+".");
        }
        return sb.toString()+str[0];
    }


        // Function to reverse words in a given string.
        String reverseWords2(String S) {
            StringBuilder ans = new StringBuilder();
            StringBuilder sb = new StringBuilder();

            // Iterate through the characters of the string in reverse order
            for (int i = S.length() - 1; i >= 0; i--) {
                char ch = S.charAt(i);

                if (ch != '.') {
                    // If the character is not a dot, prepend it to the current word
                    sb.insert(0, ch);
                } else {
                    // If the character is a dot, append the current word to the result
                    ans.append(sb).append('.');
                    sb = new StringBuilder(); // Reset the StringBuilder for the next word
                }
            }

            // Append the last word to the result string
            ans.append(sb);

            return ans.toString();
        }


    public static void main(String[] args) {

    }
}
