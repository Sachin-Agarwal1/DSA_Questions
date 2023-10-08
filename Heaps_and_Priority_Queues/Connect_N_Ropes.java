package Heaps_and_Priority_Queues;
import java.util.*;
public class Connect_N_Ropes {
    public static void main(String[] args) {
        int ropes[] = {2,3,3,4,6};

        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }

        System.out.println("Cost of Connecting N Ropes -> "+cost);
    }
    
}
