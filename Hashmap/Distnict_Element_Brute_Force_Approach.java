package Hashmap;
import java.util.*;
public class Distnict_Element_Brute_Force_Approach {
        public static int countDistinctElements(int[] arr) { // T.C = O(n^2)
            int count = 0;
            boolean isDistinct;
    
            for (int i = 0; i < arr.length; i++) {
                isDistinct = true;
    
                // Compare the current element with all the subsequent elements
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isDistinct = false;
                        break;
                    }
                }
    
                if (isDistinct) {
                    count++;
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int distinctCount = countDistinctElements(array);
            System.out.println("Number of distinct elements: " + distinctCount);
        }
    }
