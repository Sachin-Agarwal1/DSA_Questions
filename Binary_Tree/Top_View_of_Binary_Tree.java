package Binary_Tree;
import java.util.*;
public class Top_View_of_Binary_Tree {
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
    static class Info {
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
        // Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node>map = new HashMap<>();
        int minimum = 0;
        int maximum = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){  // First Time My Horizontal is Occurring
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    minimum = Math.min(minimum, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    maximum = Math.max(maximum, curr.hd+1);
                }
            }
        }
        // Print Top View
        for(int i=minimum; i<=maximum; i++) {
            System.out.print(map.get(i).data+" ");
        }
           System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topview(root);
    } 
}
