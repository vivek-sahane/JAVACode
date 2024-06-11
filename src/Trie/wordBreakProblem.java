package Trie;
import java.util.*;

public class wordBreakProblem {
    static class Node {
        insertAndSearch.Node[] children;
        boolean eow;

        public Node() {
            children = new insertAndSearch.Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static insertAndSearch.Node root = new insertAndSearch.Node(); // Initializing the root node

    public static void insert(String word) {
        insertAndSearch.Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new insertAndSearch.Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Set end of word at the last character
    }

    public static boolean search(String key) {
        insertAndSearch.Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            insertAndSearch.Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Return true if the last node is end of word
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);

            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
