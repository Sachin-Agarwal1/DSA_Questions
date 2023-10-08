import java.util.*;
public class GCD_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int n2 = sc.nextInt();
        int gd = 0;
        for(int i=1; i<=n1; i++){
            if((n1%i==0)&&(n2%i==0)){
                gd=i;
            }
        }
        System.out.println("Your Greatest Common Divisor is: "+gd);
    }
    
}
