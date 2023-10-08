import java.util.*;
public class patternprogram {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number to Print Pattern: ");
        int n= sc.nextInt();
        int i,j;
        for ( i=1; i<=n; i++){
            for(j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
