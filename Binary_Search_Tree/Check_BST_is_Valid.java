package Binary_Search_Tree;
import java.util.*;
public class Check_BST_is_Valid {
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
    public static boolean isvalidbst(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data<=min.data){
            return false;
        }
        else if(max != null && root.data>=max.data){
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i<value.length; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();

        if(isvalidbst(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
