package Binary_Search_Tree;
import java.util.*;
public class AVL_Trees {
    static class Node{
        int data, height;
        Node left, right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root){
        if(root == null)
            return 0;  
        
        return root.height;
    }

    static int max(int a, int b){
        return (a > b) ? a : b;
    }

     // Right Rotate Subtree Rooted With y
     public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        // Perform Rotation
        x.right = y;
        y.left = T2;

        // Update Height
        y.height =  max(height(y.left), height(y.right)) + 1;
        x.height =  max(height(x.left), height(x.right)) + 1;
        // Return New Root
        return x;
    }

    // Left Rotate Subtree Rooted With x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Perform Rotation
        y.left = x;
        x.right = T2;

        // Update Height
        x.height =  max(height(x.left), height(x.right)) + 1;
        y.height =  max(height(y.left), height(y.right)) + 1;
        // Return New Root
        return y;
    }

    // Get Balance Factor of Node
    public static int getBalance(Node root){
        if(root == null)
            return 0;
        
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key){
        if(root == null)
            return new Node(key);
        
        if(key < root.data)    // Left Subtree
            root.left = insert(root.left, key);
        else if(key > root.data)  // Right Subtree
            root.right = insert(root.right, key);
        else
            return root;  // Duplicate Key Not Allowed
        
        // Update Root Height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get Root's Balance Factor
        int bf = getBalance(root);

        // Left Left Case
        if(bf > 1 && key < root.left.data)
            return rightRotate(root);
        

        // Right Right Case
        if(bf < -1 && key > root.right.data)
            return leftRotate(root);
        

        // Left Right Case
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //Right Left Case
        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root; // Return If AVL Balanced
    }

    public static void preorder(Node root) {
        if(root == null) {
           return;
        }
        System.out.print(root.data+" ");
        preorder(root. left);
        preorder(root. right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);
    }
}
