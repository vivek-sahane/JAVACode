package Trie;
import java.util.*;

public class countUniqueSubstrings {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node(); // Initializing the root node

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Set end of word at the last character
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Return true if the last node is end of word
    }

   public static int countNode(Node root) {
       if (root == null) {
           return 0;
       }
       int count = 0;
       for(int i = 0; i < 26; i++) {
          if(root.children[i] != null){
              count += countNode(root.children[i]);
          }
       }
       return count+1;
   }

    public static void main(String[] args) {

        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
