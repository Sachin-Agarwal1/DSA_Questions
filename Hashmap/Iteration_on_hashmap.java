package Hashmap;
import java.util.*;
public class Iteration_on_hashmap {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);      
        }

        for (String key : tickets.keySet()) {
           if(!revmap.containsKey(key)){
            return key;
           }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, Integer>hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 150);
        hm.put("China", 150);
        hm.put("Japan", 152);
        hm.put("France", 140);

        //Iterate
        Set<String>keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key-> "+k+","+"Value-> "+hm.get(k)); // We are use .get() Function to Print the Value of the Key
        }
    }
}
