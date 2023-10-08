import java.util.*;
public class l_c_m {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your First Number: ");
    int n1 = sc.nextInt();
    System.out.print("Enter Your Second Number: ");
    int n2 = sc.nextInt();
    int gcd = 0;
    for(int i=1; i<=n1; i++){
        if((n1%i==0)&&(n2%i==0)){
            gcd=i;
        }
       //Formula of LCM is = (n1*n2)/gd
    }
    System.out.println("Your LCM is: "+(n1*n2)/gcd);
    }
}
    

