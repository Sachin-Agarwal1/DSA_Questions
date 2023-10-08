import java.util.*;
public class fibonacchi_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Term Number: ");
        int n = sc.nextInt();
        long a = 0;
        long b = 0;
        long c = 1;
            for(int i=1; i<=n; i++){
                a=b;
                b=c;
                c=a+b;
                System.out.print(c+" ");
            }
        }
    }  
