package Hashmap;
import java.util.*;
public class Union_and_Intersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
         

        // Union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union = "+set.size());
        for (Integer num : set) {
            System.out.print(num+" ");
        }
        System.out.println();

        // Intersection
        set.clear();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        
        int count = 0;
        ArrayList<Integer> intersectionList = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
             intersectionList.add(arr2[i]);
             set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = "+count);
        for(Integer num : intersectionList) {
            System.out.print(num + " ");
        }
    }
}
