package Heaps_and_Priority_Queues;
import java.util.*;
public class Impliment_of_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        //PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); ->  This Line Written When we Want Reverse Order Values
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    } 
}
