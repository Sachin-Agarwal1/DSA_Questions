import java.util.*;
public class Butterfly_Pattern {
    public static void butterfly(int n){
        // For 1 Half Part 
        // For Outer Loop 
        for(int i=1; i<=n; i++){      
            //For Print Stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // For Spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // For Print Stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for (int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // For Spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // For Print Stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the Number to Print Butterfly Pattern: ");
        int a = sc.nextInt();
        butterfly(a); 
    }  
}
