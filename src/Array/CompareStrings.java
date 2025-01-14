import java.util.HashMap;
import java.util.Scanner;

public class CompareStrings {

    public static int solve(String s, String t, int n) {
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        // Count frequency of characters in string s
        for (int i = 0; i < n; i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Count frequency of characters in string t
        for (int i = 0; i < n; i++) {
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Check if both hashmaps are equal
        if (mp1.equals(mp2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // Ensure both strings have equal length
        if (s.length() != t.length()) {
            System.out.println("Strings are not of equal length.");
        } else {
            int result = solve(s, t, s.length());
            System.out.println(result);
        }

        sc.close();
    }
}