import java.util.*;
public class factorial {
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        long a = sc.nextLong();
        long b = 1;

        for(long i=1; i<=a; i++)
        {
           b *= i;   
        }
        System.out.println("Your Factorial is :"+b);

     }
     }
}