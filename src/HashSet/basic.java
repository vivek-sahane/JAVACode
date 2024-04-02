package HashSet;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        HashSet<String >st = new HashSet<>();
        st.add("Vivek");
        st.add("Harsh");
        st.add("Vivek");
        st.add("Sumit");
        System.out.println(st);
        System.out.println(st.size());
        st.remove("Sumit");
        st.contains("Vivek");
        System.out.println(st);

        for(String s : st){
            System.out.println(s);
        }
    }
}
