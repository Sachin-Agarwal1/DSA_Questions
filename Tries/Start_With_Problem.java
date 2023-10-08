package Tries;
import java.util.*;
public class Start_With_Problem {
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

    public static boolean Startwith(String key){ // T.C = O(L)
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.Children[idx] == null){
                return false;
            }
            curr = curr.Children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(Startwith(prefix1));
        System.out.println(Startwith(prefix2));
    }
}
