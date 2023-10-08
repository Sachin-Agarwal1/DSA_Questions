package Hashmap;
import java.util.*;
public class Operations_in_Hashmap {
    public static void main(String args[]) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("China", 300);

        System.out.println(hm);

        //Get
        System.out.println(hm.get("India")); // Return value
        System.out.println(hm.get("Indonesia")); // Retuen Null

        //Contains Key
        System.out.println(hm.containsKey("India")); // Retuen True
        System.out.println(hm.containsKey("Indonesia")); // Return False

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println("Size of HashMap -> "+hm.size());

        // Clear-> Clear All Hashmap 
        hm.clear();

        // Is Empty
        System.out.println(hm.isEmpty()); // Return True When Hashmap is Empty 
        
    }
}
