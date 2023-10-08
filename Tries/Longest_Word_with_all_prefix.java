package Tries;
import java.util.*;
public class Longest_Word_with_all_prefix {
    static class Node{
        Node Children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                Children[i] = null;
            }
        }
    }  

    public static Node root = new Node();

    public static void insert(String word){ // T.C = O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.Children[idx] == null){
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){ // T.C = O(L)
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.Children[idx] == null){
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.eow == true;
    }

    public static String ans = "";
    public static void longestword(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.Children[i] != null && root.Children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestword(root.Children[i], temp);
                temp.deleteCharAt(temp.length()-1); // Backtracking Step
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
