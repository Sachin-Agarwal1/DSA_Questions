package Hashmap;
import java.util.*;
public class TreeMap_Implemantation {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 200);
        tm.put("USA", 300);
        tm.put("Indonesia", 400);

        System.out.println(tm);
    }
}
