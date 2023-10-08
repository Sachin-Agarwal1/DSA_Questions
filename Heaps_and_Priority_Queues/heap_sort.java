package Heaps_and_Priority_Queues;
import java.util.*;
public class heap_sort {
    
    public static void heapify(int arr[], int i, int size){
        int left = (2*i)+1; // Left Child Index
        int right = (2*i)+2; // Right Child Index
        int maxidx = i;

        if(left < size && arr[maxidx] < arr[left]){
            maxidx = left;
        }

        if(right < size && arr[maxidx] < arr[right]){
            maxidx = right;
        }

        if(maxidx != i){  // when our root is not minimum if our root is equal to minimum so heap is already in right position
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;

            // Recursive Call For Check Heap 
            heapify(arr, maxidx, size);
        }

    }

    public static void heapsort(int arr[]){
        //Step1-> Build MaxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //Step2-> Push Largest at End
        for(int i=n-1; i>=0; i--){
            //Swap(First Element to Last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0,i);
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,5,3};
        heapsort(arr);

        //Print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
