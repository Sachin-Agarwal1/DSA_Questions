package Heaps_and_Priority_Queues;
import java.util.*;
public class Insert_in_a_Heap {
    static class Heap{
        ArrayList<Integer>arr = new ArrayList<>();

        public void add(int data){
            // add at last Inedex
            arr.add(data);

            int x = arr.size()-1; // x is Child Index
            int parent = (x-1)/2; // Find Parent Index

            while(arr.get(x) < arr.get(parent)){ // T.C = O(logn)
                // Swap if Child is less than Parent
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = (2*i)+1; // Left Child Index
            int right = (2*i)+2; // Right Child Index
            int minidx = i;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }

            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }

            if(minidx != i){  // when our root is not minimum if our root is equal to minimum so heap is already in right position
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                // Recursive Call For Check Heap 
                heapify(minidx);
            }

        }
        public int delete(){
            int data = arr.get(0);

            // Step1->Swap First and Last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step2->Delete Last
            arr.remove(arr.size()-1);

            //Step3->Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(4);
        pq.add(2);
        pq.add(10);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.delete();
        }
    }
}
