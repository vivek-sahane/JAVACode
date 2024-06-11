package Trie;
import java.util.*;

public class insertAndSearch {
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

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("their")); // true
        System.out.println(search("thor"));  // false
        System.out.println(search("an"));    // false
        System.out.println(search("a"));     // true
        System.out.println(search("any"));   // true
    }
}
