import java.util.*;
public class Stringleetcodelengthoflastworld {

        public static int lengthOfLastWord(String s) {
            // Trim the input string to remove leading and trailing spaces
            s = s.trim();

            // Find the index of the last space in the trimmed string
            int lastSpaceIndex = s.lastIndexOf(' ');

            // Calculate the length of the last word based on the last space index
            if (lastSpaceIndex == -1) {
                // If there is no space, the entire string is the last word
                return s.length();
            } else {
                // If there is a space, calculate the length of the last word
                return s.length() - lastSpaceIndex - 1;
            }
        }
    public static void main(String[] args) {

    }
}

