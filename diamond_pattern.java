import java.util.*;
public class diamond_pattern {
    public static void diamond(int n){
        //For Outer Loop 
        //For 1 Half
        for(int i=1; i<=n; i++){
            //For Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //For Stars
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 Half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //For Stars
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the Number to Print Diamond: ");
        int a = sc.nextInt();
        diamond(a);
    }
}
