import java.util.*;
public class count_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Term Number: ");
        int n = sc.nextInt();
        long a = 0;
        long b = 0;
        long c = 1;
        int i=0;
        long sum=0;
         while(i<n){
                a=b;
                b=c;
                c=a+b;
                i++;
                sum+=c;
                System.out.print(c+" ");
              
            }
            System.out.println();
            System.out.println("Total Elements in this Series: "+ i);
            System.out.println("Sum of this Series: "+sum);
        }
    
}
