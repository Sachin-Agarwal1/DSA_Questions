package Hashmap;
import java.util.*;
public class find_itinerary_from_ticket {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : tickets.keySet()) { // Create RevMAp to Store (To,From) Pair of Journey
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
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start)); // Print the The Value of Key
            start = tickets.get(start); // Update Start
        }
        System.out.println();
    }
}
