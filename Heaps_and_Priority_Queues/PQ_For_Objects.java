package Heaps_and_Priority_Queues;
import java.util.*;
public class PQ_For_Objects {
    static class Student implements Comparable<Student>{  // Overriding
        String name;
        int rank;

        public Student (String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
            // return this.name.compareTo(s2.name);  For Comparing Strings
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        //PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); ->  This Line Written When we Want Reverse Order Values

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
