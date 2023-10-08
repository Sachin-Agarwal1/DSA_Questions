import java.util.*;
public class half_pyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //For Outer Loop 
    for (int i=1; i<=n; i++){
        //For Spaces
        for (int j=1; j<=(n-i); j++ ){
            System.out.print(" ");
        }
            //For Stars
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
