import java.util.*;
public class Stringp1variousfunctions {
    public static void main(String[] args) {

        String str="Hello";
        String gtr="World";

        // Remove non-alphanumeric characters and convert to lowercase
      //   String processedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('l'));
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("ello"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));
        System.out.println("abc"+10+20);
        System.out.println("abc"+(10+20));
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(2));
        System.out.println(str.equals(gtr));
   //     System.out.println(str.reverse());      use in StringBuilders
   //     System.out.println(str.deleteCharAt(3));
   //     System.out.println(str.delete(3,4));
   //     System.out.println(str.setCharAt(3,v));
   //     System.out.println(str.append(gtr));
   //     System.out.println(str.insert(2,v));
    }
}
