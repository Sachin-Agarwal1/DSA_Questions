import java.util.*;
public class fibonacciseries2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Term Number: ");
        int n = sc.nextInt();
        long a = 0;
        long b = 1;
        long c = 0;
            for(int i=1; i<=n; i++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;

                
               
               
            }
        }
    }  

    

