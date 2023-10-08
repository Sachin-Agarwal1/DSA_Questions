package Binary_Search_Tree;
import java.util.*;
public class root_to_leaf_path {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){    // Left Subtree
            root.left = insert(root.left, val);
        }else{   // Right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printpath(ArrayList<Integer>path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printroot2leaf(Node root, ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1); //Backtracking Step
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<value.length; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        
        printroot2leaf(root, new ArrayList<>());
    }
}
