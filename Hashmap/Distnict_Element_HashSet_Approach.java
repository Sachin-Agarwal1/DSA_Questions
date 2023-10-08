package Hashmap;
import java.util.*;
public class Distnict_Element_HashSet_Approach { // T.C = O(n)
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<num.length;i++){
            hs.add(num[i]);
        }
        System.out.println("Ans = "+hs.size());
    }
}
