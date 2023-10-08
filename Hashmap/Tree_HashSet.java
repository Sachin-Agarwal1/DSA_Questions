package Hashmap;
import java.util.*;
public class Tree_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bangalore");
        System.out.println(hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangalore");
        System.out.println(lhs);


        TreeSet<String>ts = new TreeSet<String>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bangalore");
        System.out.println(ts);
    }
}
