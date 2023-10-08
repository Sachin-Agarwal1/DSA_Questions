package Hashmap;
import java.util.*;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        System.out.println(set.size());

        set.remove(2);

        set.clear();

        System.out.println(set.size());

        if(set.contains(2)){
            System.out.println("2 is present in the set");
        }else{
            System.out.println("2 is not present in the set");
        }
        System.out.println(set.isEmpty());
    }
}
