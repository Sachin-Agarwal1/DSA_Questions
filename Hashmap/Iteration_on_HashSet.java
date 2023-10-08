package Hashmap;
import java.util.*;
public class Iteration_on_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Bangalore");

        // Iterator it = hs.iterator();  This is a Method to Iterate on HashSet
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for (String city : hs) { // This is a Another Method to Iterate on HashSet
            System.out.println(city);      
        }
    }
}
