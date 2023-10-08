// This is The Optimised Bubble Sort Code
// because in the best case the T.C of this code is O(n) and in Worst Case O(n^2) 
//but normal bubble sort code Give me T.C in best case and Worst Case is same which is O(n^2)
import java.util.*;
public class Optimised_Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        // if no two elements were swapped by inner loop, then break
        if (swapped == false) {
            break;
        }
    }
    // print the sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }

    }
    
}
