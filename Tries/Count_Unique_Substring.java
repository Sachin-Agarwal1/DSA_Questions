package Tries;
import java.util.*;
public class Count_Unique_Substring {
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

    public static int countnodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.Children[i] != null){
                count += countnodes(root.Children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "apple";

        // Suffix -> insert in tree
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countnodes(root));
    }
}
