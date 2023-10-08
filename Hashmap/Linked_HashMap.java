package Hashmap;
import java.util.*;
public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 200);
        lhm.put("USA", 300);

        System.out.println(lhm);
    }
}
